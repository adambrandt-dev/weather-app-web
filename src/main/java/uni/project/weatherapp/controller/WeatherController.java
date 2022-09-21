package uni.project.weatherapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uni.project.weatherapp.controller.dto.WeatherResponseDto;
import uni.project.weatherapp.service.WeatherService;

import static uni.project.weatherapp.controller.mapper.WeatherMapper.mapWeatherToWeatherResponseDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("/weather")
public class WeatherController {

    WeatherService weatherService = new WeatherService();

    @GetMapping("/location")
    public ResponseEntity<WeatherResponseDto> getWeatherByLocation(@RequestParam String locationName) {
        return ResponseEntity.ok(mapWeatherToWeatherResponseDto(weatherService.getWeatherByLocation(locationName)));
    }

}
