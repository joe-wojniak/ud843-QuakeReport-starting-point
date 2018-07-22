package com.example.android.quakereport;

// Example code adapted from androidhive
// https://www.androidhive.info/2016/01/android-working-with-recycler-view/
//

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends RecyclerView.Adapter<EarthquakeAdapter.MyViewHolder> {

    private List<Earthquake> earthquakeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView magnitude, city, date;

        public MyViewHolder(View view) {
            super(view);
            magnitude=(TextView) view.findViewById(R.id.textMagnitude);
            city=(TextView) view.findViewById(R.id.textCity);
            date=(TextView) view.findViewById(R.id.textDate);
        }
    }

    public EarthquakeAdapter(List<Earthquake> earthquakeList) {
        this.earthquakeList = earthquakeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Earthquake earthquake = earthquakeList.get(position);
        holder.magnitude.setText(earthquake.getMagnitude());
        holder.city.setText(earthquake.getCity());
        holder.date.setText(earthquake.getDate());
    }

    @Override
    public int getItemCount(){
        return earthquakeList.size();
    }
}
