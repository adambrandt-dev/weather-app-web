package uni.project.weatherapp.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponseDto {

    private Object weather;
    private Object weatherDetails;
    private String weatherLocation;

}
