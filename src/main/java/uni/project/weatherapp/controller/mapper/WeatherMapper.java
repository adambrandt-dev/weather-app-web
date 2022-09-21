package uni.project.weatherapp.controller.mapper;

import uni.project.weatherapp.controller.dto.WeatherResponseDto;
import uni.project.weatherapp.model.Wrapper;

public class WeatherMapper {

    public static WeatherResponseDto mapWeatherToWeatherResponseDto(Wrapper wrapper){

        return new WeatherResponseDto(wrapper.getWeather(), wrapper.getMain(), wrapper.getWind(), wrapper.getName());
    }
}
