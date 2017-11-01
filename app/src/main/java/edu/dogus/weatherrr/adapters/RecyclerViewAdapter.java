package edu.dogus.weatherrr.adapters;

/**
 * Created by Esra on 1.11.2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.dogus.weatherrr.R;
import edu.dogus.weatherrr.entity.WeatherObject;
import java.util.List;
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List<WeatherObject> dailyWeather;
    protected Context context;
    public RecyclerViewAdapter(Context context, List<WeatherObject> dailyWeather) {
        this.dailyWeather = dailyWeather;
        this.context = context;
    }
    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolders viewHolder = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_daily_list, parent, false);
        viewHolder = new RecyclerViewHolders(layoutView);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.dayOfWeek.setText(dailyWeather.get(position).getDayOfWeek());
        holder.weatherIcon.setImageResource(dailyWeather.get(position).getWeatherIcon());
        double mTemp = Double.parseDouble(dailyWeather.get(position).getWeatherResult());
        holder.weatherResult.setText(String.valueOf(Math.round(mTemp)) + "°");
        holder.weatherResultSmall.setText(dailyWeather.get(position).getWeatherResultSmall());
        holder.weatherResultSmall.setVisibility(View.GONE);
    }
    @Override
    public int getItemCount() {
        return 5;
    }

}
