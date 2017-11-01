package edu.dogus.weatherrr.json;

/**
 * Created by alkimkallem on 1.11.2017.
 */

public class Weather {
    WeatherResults weatherResults;

    public Weather(WeatherResults weatherResults){
        this.weatherResults = weatherResults;
    }

    public WeatherResults getWeatherResults() {
        return weatherResults;
    }
}
