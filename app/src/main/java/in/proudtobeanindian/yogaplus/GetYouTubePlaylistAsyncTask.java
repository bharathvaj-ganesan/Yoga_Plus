package in.proudtobeanindian.yogaplus;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/**
 * Created by G.BHARATHVAJ on 05-01-2017.
 */


public abstract class GetYouTubePlaylistAsyncTask extends AsyncTask<String, Void, JSONObject> {
    private static final String TAG = "GetYouTubePlaylistAsyncTask";

    private static final int YOUTUBE_PLAYLIST_MAX_RESULTS = 10;

    //see: https://developers.google.com/youtube/v3/docs/playlistItems/list
    private static final String YOUTUBE_PLAYLISTITEMS_URL = "https://www.googleapis.com/youtube/v3/playlistItems";
    private static final String YOUTUBE_PLAYLIST_PART = "snippet";
    private static final String YOUTUBE_PLAYLIST_FIELDS = "etag,pageInfo,nextPageToken,items(id,snippet(title,description,position,thumbnails(medium,high),resourceId/videoId))";

    private static OkHttpClient client = new OkHttpClient();

    private final Uri.Builder mUriBuilder;

    public GetYouTubePlaylistAsyncTask() {
        mUriBuilder = Uri.parse(YOUTUBE_PLAYLISTITEMS_URL).buildUpon();
    }

    @Override
    protected JSONObject doInBackground(String... params) {
        final String playlistId = params[0];
        if (playlistId == null || playlistId.length() == 0) {
            return null;
        }

        if (params.length == 2) {
            final String nextPageToken = params[1];
            if (nextPageToken != null) {
                mUriBuilder.appendQueryParameter("pageToken", nextPageToken);
            }
        }

        mUriBuilder.appendQueryParameter("playlistId", playlistId)
                .appendQueryParameter("part", YOUTUBE_PLAYLIST_PART)
                .appendQueryParameter("maxResults", Integer.toString(YOUTUBE_PLAYLIST_MAX_RESULTS))
                .appendQueryParameter("fields", YOUTUBE_PLAYLIST_FIELDS)
                .appendQueryParameter("key", ApiKey.YOUTUBE_API_KEY);

        final String url = mUriBuilder.build().toString();
        //Log.d(TAG, url);

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response;
        String result;
        try {
            response = client.newCall(request).execute();
            result = response.body().string();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        if (result == null) {
            Log.e(TAG, "Failed to get playlist");
            return null;
        }

        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject(result);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

        return jsonObject;
    }
}
