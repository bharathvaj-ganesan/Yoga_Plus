package in.proudtobeanindian.yogaplus;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by G.BHARATHVAJ on 05-01-2017.
 */


public class Playlist {
    public final int totalResults;
    public final int resultsPerPage;

    public List<Page> pages;

    public Playlist(JSONObject jsonPlaylist) throws JSONException {
        pages = new ArrayList<Page>();

        JSONObject pageInfo = jsonPlaylist.getJSONObject("pageInfo");
        totalResults = pageInfo.getInt("totalResults");
        resultsPerPage = pageInfo.getInt("resultsPerPage");
    }

    public int getCount() {
        int count = 0;
        for (Page page : pages) {
            count += page.items.size();
        }

        return count;
    }

    public Page addPage(JSONObject jsonPlaylist) throws JSONException {
        final Page page = new Page(
                jsonPlaylist.getJSONArray("items"),
                jsonPlaylist.getString("etag"),
                jsonPlaylist.optString("nextPageToken", null));

        pages.add(page);

        return page;
    }

    public PlaylistItem getItem(int position) {
        int pageNumber = position / resultsPerPage;
        Page page = pages.get(pageNumber);

        return page.items.get(position % resultsPerPage);
    }

    public String getNextPageToken(int position) {
        int pageNumber = position / resultsPerPage;
        Page page = pages.get(pageNumber);

        return page.nextPageToken;
    }

    public String getEtag(int position) {
        int pageNumber = position / resultsPerPage;
        Page page = pages.get(pageNumber);

        return page.eTag;
    }

    public class Page {
        public final String nextPageToken;
        public final List<PlaylistItem> items;
        public final String eTag;
        public boolean haveVideoDetails;

        Page(JSONArray jsonItems, String etag, String nextPageToken) throws JSONException {
            eTag = etag;
            items = new ArrayList<PlaylistItem>(jsonItems.length());
            this.nextPageToken = nextPageToken;

            for (int i = 0; i < jsonItems.length(); i++) {
                JSONObject item = jsonItems.getJSONObject(i);
                items.add(new PlaylistItem(item));
            }
        }

        public String getVideoIds() {
            StringBuffer buffer = new StringBuffer();
            for (PlaylistItem item : items) {
                buffer.append(item.videoId);
                buffer.append(',');
            }
            buffer.deleteCharAt(buffer.lastIndexOf(","));

            return buffer.toString();
        }
    }
}