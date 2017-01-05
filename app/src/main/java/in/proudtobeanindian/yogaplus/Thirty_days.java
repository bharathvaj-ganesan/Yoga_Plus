package in.proudtobeanindian.yogaplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import java.util.ArrayList;

public class Thirty_days extends AppCompatActivity {
    private final String recyclerViewTitleText[] = {"Day 1","Day 2","Day 3",
            "Day 4","Day 5","Day 6","Day 7","Day 8","Day 9","Day 10","Day 11","Day 12","Day 13",
            "Day 14","Day 15","Day 16","Day 17","Day 18","Day 19","Day 20","Day 21","Day 22","Day 23",
            "Day 24","Day 25","Day 26","Day 27","Day 28","Day 29","Day 30"};

    private final int recyclerViewImages[] = {
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays,
            R.drawable.thirtydays,R.drawable.thirtydays,R.drawable.thirtydays
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_days);
        initRecyclerViews();
    }
    private void initRecyclerViews()
    {
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
                            case 0 :
                                Intent intent1 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","oBu-pQG6sTY");
                                startActivity(intent1);
                                break;
                            case 1:
                                Intent intent2 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","TB2ISQZ5Mb0");
                                startActivity(intent2);
                                break;
                            case 2:
                                Intent intent3 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","FqGHWXjgn-M");
                                startActivity(intent3);
                                break;
                            case 3:
                                Intent intent4 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","gLQsM6geGzs");
                                startActivity(intent4);
                                break;
                            case 4:
                                Intent intent5 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","mHb71QonmXo");
                                startActivity(intent5);
                                break;
                            case 5:
                                Intent intent6 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","tWPpdP4IhEY");
                                startActivity(intent6);
                                break;
                            case 6:
                                Intent intent7 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","P1SvHXqenPs");
                                startActivity(intent7);
                                break;
                            case 7:
                                Intent intent8 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","UlW77conmAc");
                                startActivity(intent8);
                                break;
                            case 8:
                                Intent intent9 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","1erFYeJo_r4");
                                startActivity(intent9);
                                break;
                            case 9:
                                Intent intent10 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","8AakYeM23sI");
                                startActivity(intent10);
                                break;
                            case 10:
                                Intent intent11 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","6mDyGogsMtQ");
                                startActivity(intent11);
                                break;
                            case 11:
                                Intent intent12 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","PZwc6gWmOyQ");
                                startActivity(intent12);
                                break;
                            case 12:
                                Intent intent13 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","PZwc6gWmOyQ");
                                startActivity(intent13);
                                break;
                            case 13:
                                Intent intent14 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","4nbfvTXGSmA");
                                startActivity(intent14);
                                break;
                            case 14:
                                Intent intent15 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","q17VxeBtKeY");
                                startActivity(intent15);
                                break;
                            case 15:
                                Intent intent16 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","oifIkMgm40o");
                                startActivity(intent16);
                                break;
                            case 16:
                                Intent intent17 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","kYkWDrKlCfE");
                                startActivity(intent17);
                                break;
                            case 17:
                                Intent intent18 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","jMvX8EV_OlU");
                                startActivity(intent18);
                                break;
                            case 18:
                                Intent intent19 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","D-46IdZwYjE");
                                startActivity(intent19);
                                break;
                            case 19:
                                Intent intent20 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","0I8w5iAogaM");
                                startActivity(intent20);
                                break;
                            case 20:
                                Intent intent21 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","LP64pPFx8Mc");
                                startActivity(intent21);
                                break;
                            case 21:
                                Intent intent22 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","k-A6uxFleL0");
                                startActivity(intent22);
                                break;
                            case 22:
                                Intent intent23 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","7fR9Lamq0ms");
                                startActivity(intent23);
                                break;
                            case 23:
                                Intent intent24 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","pJUKw4LwkXM");
                                startActivity(intent24);
                                break;
                            case 24:
                                Intent intent25 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","FMZtaaGxzsc");
                                startActivity(intent25);
                                break;
                            case 25:
                                Intent intent26 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","cd46opJN00s");
                                startActivity(intent26);
                                break;
                            case 26:
                                Intent intent27 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","j5cE7h51nLQ");
                                startActivity(intent27);
                                break;
                            case 27:
                                Intent intent28 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","vljYUYebZtY");
                                startActivity(intent28);
                                break;
                            case 28:
                                Intent intent29 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","VIAM_cjkLyo");
                                startActivity(intent29);
                                break;
                            case 29:
                                Intent intent30 = YouTubeStandalonePlayer.createVideoIntent(Thirty_days.this,"AIzaSyAX3DliCjSXqkwulvM9G_zvxi0ASWXJVS8","3clA1GUh-0Q");
                                startActivity(intent30);
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
