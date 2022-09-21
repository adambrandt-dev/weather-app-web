package uni.project.weatherapp.controller.mapper;

import uni.project.weatherapp.controller.dto.WeatherResponseDto;
import uni.project.weatherapp.model.Wrapper;

public class WeatherMapper {

    public static WeatherResponseDto mapWeatherToWeatherResponseDto(Wrapper wrapper) {
        return new WeatherResponseDto(wrapper.getWeather(), wrapper.getMain().get("temp"), wrapper.getMain().get("pressure"),
                wrapper.getMain().get("humidity"), wrapper.getWind().get("speed"), wrapper.getName());
    }
}
