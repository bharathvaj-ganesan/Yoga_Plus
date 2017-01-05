package in.proudtobeanindian.yogaplus.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import in.proudtobeanindian.yogaplus.R;

/**
 * Created by G.BHARATHVAJ on 05-01-2017.
 */

public class About_Us extends Fragment {
    String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";
    String myData = " <h2>What is Yogasana?</h2>\n" +
            "  <p>The word asana literally means a posture. Out of the innumerable asanas a body can assume, 84 have been identified as Yogasanas, through which one can transform the body and mind into a possibility for ultimate well-being. Yogasanas are not exercises, but rather very subtle processes to manipulate one's energy in a particular direction.<p>In an untrained state, the human body is a constant manifestation of various levels of compulsiveness. By consciously forming the body into a certain posture, one creates a conducive passage for energy flow that can elevate one's consciousness. Yogasanas are a way of aligning the inner system and adjusting it to the celestial geometry, thereby becoming in sync with the existence and naturally achieving a chemistry of healthfulness, joyfulness, blissfulness, and above all, balance.\n" +
            " ";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us,container,false);
        WebView webView = (WebView) view.findViewById(R.id.webView1);
        webView.setVerticalScrollBarEnabled(false);
        webView.setBackgroundColor(getResources().getColor(R.color.nav_color));
        webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("About");
    }
}
