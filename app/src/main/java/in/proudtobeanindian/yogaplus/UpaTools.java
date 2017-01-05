package in.proudtobeanindian.yogaplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import java.util.ArrayList;

public class UpaTools extends AppCompatActivity {

    private final String recyclerViewTitleText[] = {"Namaskar", "Love", "Health", "Joy", "Inner Exploration", "Peace","Success", "Practice Love", "Practice Health", "Practice Joy", "Practice Exploration", "Practice Success"
    };

    private final int recyclerViewImages[] = {
            R.drawable.image1,R.drawable.image2, R.drawable.image3,R.drawable.image4, R.drawable.image5,R.drawable.image6,
            R.drawable.image7,R.drawable.image22, R.drawable.image33,R.drawable.image44, R.drawable.image55,R.drawable.image66

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upa_tools);
        initRecyclerViews();
    }

    private void initRecyclerViews() {
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<AndroidVersion_thirtydays> av = prepareData();
        AndroidDataAdapter_thirty_days mAdapter = new AndroidDataAdapter_thirty_days(getApplicationContext(), av);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
                        switch (i) {
                            case 0:
                                Intent intent1 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","KX_pnMG-4RE");
                                startActivity(intent1);
                                break;
                            case 1:
                                Intent intent2 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","lx6Zr6lrTaI");
                                startActivity(intent2);
                                break;
                            case 2:
                                Intent intent3 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","M9VSpOiwwDU");
                                startActivity(intent3);
                                break;
                            case 3:
                                Intent intent4 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","Ug8OoFAFfZ0");
                                startActivity(intent4);
                                break;
                            case 4:
                                Intent intent5 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","C_xsXnRd_uc");
                                startActivity(intent5);
                                break;
                            case 5:
                                Intent intent6 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","q5m6tMjcF8k");
                                startActivity(intent6);
                                break;
                            case 6:
                                Intent intent7 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","JnhUmq0va4A");
                                startActivity(intent7);
                                break;
                            case 7:
                                Intent intent8 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","BUCYjed-3Jo");
                                startActivity(intent8);
                                break;
                            case 8:
                                Intent intent9 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","uhWr1jCXgKw");
                                startActivity(intent9);
                                break;
                            case 9:
                                Intent intent10 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","J69NF6aXY6s");
                                startActivity(intent10);
                                break;
                            case 10:
                                Intent intent11 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","ALRUelXygdE");
                                startActivity(intent11);
                                break;
                            case 11:
                                Intent intent12 = YouTubeStandalonePlayer.createVideoIntent(UpaTools.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","MLpb8ee3Ypc");
                                startActivity(intent12);
                                break;
                        }
                    }
                })
        );

    }

    private ArrayList<AndroidVersion_thirtydays> prepareData() {

        ArrayList<AndroidVersion_thirtydays> av = new ArrayList<>();
        for (int i = 0; i < recyclerViewTitleText.length; i++) {
            AndroidVersion_thirtydays mAndroidVersion = new AndroidVersion_thirtydays();
            mAndroidVersion.setAndroidVersionName(recyclerViewTitleText[i]);
            mAndroidVersion.setrecyclerViewImage(recyclerViewImages[i]);
            av.add(mAndroidVersion);
        }
        return av;
    }
}

