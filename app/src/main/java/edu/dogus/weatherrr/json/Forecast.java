package edu.dogus.weatherrr.json;

import java.util.List;

/**
 * Created by alkimkallem on 1.11.2017.
 */


public class Forecast {
    private List<FiveWeathers> list;

    public Forecast(List<FiveWeathers> list) {
        this.list = list;
    }

    public List<FiveWeathers> getList() {
        return list;
    }
}
