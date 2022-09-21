package uni.project.weatherapp.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WeatherClient {

    String WEATHER_API = "https://api.openweathermap.org/data/2.5/weather";
    String API_KEY = "a4820f1f05c953c5ee600d7b59d17ed3";

    public String getWeatherApi(String locationKey) {
        return new StringBuilder(WEATHER_API)
                .append("?q=")
                .append(locationKey)
                .append("&appid=")
                .append(API_KEY)
                .append("&units=metric")
                .toString();
    }
}
