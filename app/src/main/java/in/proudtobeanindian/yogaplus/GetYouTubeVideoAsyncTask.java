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


public abstract class GetYouTubeVideoAsyncTask extends AsyncTask<Playlist.Page, Void, JSONObject> {
    private static final String TAG = "GetYouTubeVideoDurationAsyncTask";

    private static final String YOUTUBE_VIDEOS_URL = "https://www.googleapis.com/youtube/v3/videos";
    private static final String YOUTUBE_VIDEOS_PART = "contentDetails,statistics"; // video resource properties that the response will include.
    private static final String YOUTUBE_VIDEOS_FIELDS = "items(contentDetails/duration,id,statistics)"; // selector specifying which fields to include in a partial response.

    private static OkHttpClient client = new OkHttpClient();

    private final Uri.Builder mUriBuilder;
    private Playlist.Page page;

    public GetYouTubeVideoAsyncTask() {
        mUriBuilder = Uri.parse(YOUTUBE_VIDEOS_URL).buildUpon();
    }

    @Override
    protected JSONObject doInBackground(Playlist.Page... params) {
        page = params[0];
        if (page == null) {
            return null;
        }

        Uri uri = mUriBuilder.appendQueryParameter("id", page.getVideoIds())
                .appendQueryParameter("part", YOUTUBE_VIDEOS_PART)
                .appendQueryParameter("fields", YOUTUBE_VIDEOS_FIELDS)
                .appendQueryParameter("key", ApiKey.YOUTUBE_API_KEY)
                .build();

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