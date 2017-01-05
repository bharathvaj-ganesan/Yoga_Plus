package in.proudtobeanindian.yogaplus;



import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by G.BHARATHVAJ on 05-01-2017.
 */

public class PlaylistItem {
    public final String id;
    public final String title;
    public final String description;
    public final String thumbnailUrl;
    public final String videoId;
    public final int position;
    public Video video;

    public PlaylistItem(JSONObject jsonItem) throws JSONException {
        id = jsonItem.getString("id");
        final JSONObject snippet = jsonItem.getJSONObject("snippet");
        position = snippet.getInt("position");
        title = snippet.getString("title");
        description = snippet.getString("description");
        thumbnailUrl = snippet.getJSONObject("thumbnails").getJSONObject("medium").getString("url");
        videoId = snippet.getJSONObject("resourceId").getString("videoId");
    }
}
