package in.proudtobeanindian.yogaplus;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by G.BHARATHVAJ on 05-01-2017.
 */

public class AndroidDataAdapter_thirty_days extends RecyclerView.Adapter<AndroidDataAdapter_thirty_days.ViewHolder> {
    private ArrayList<AndroidVersion_thirtydays> arrayList;
    private Context mcontext;

    public AndroidDataAdapter_thirty_days(Context context, ArrayList<AndroidVersion_thirtydays> android) {
        this.arrayList = android;
        this.mcontext = context;
    }

    @Override
    public void onBindViewHolder(AndroidDataAdapter_thirty_days.ViewHolder holder, int i) {

        holder.textView.setText(arrayList.get(i).getrecyclerViewTitleText());
        holder.imageView.setImageResource(arrayList.get(i).getrecyclerViewImage());
    }

    @Override
    public AndroidDataAdapter_thirty_days.ViewHolder onCreateViewHolder(ViewGroup vGroup, int i) {

        View view = LayoutInflater.from(vGroup.getContext()).inflate(R.layout.row_layout_thirty_days, vGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        public ViewHolder(View v) {
            super(v);

            textView = (TextView) v.findViewById(R.id.text);
            imageView = (ImageView) v.findViewById(R.id.image);
        }
    }

}
