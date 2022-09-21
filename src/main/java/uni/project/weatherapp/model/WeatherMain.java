package uni.project.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherMain {

    private Object temp;
    private Object pressure;
    private Object humidity;
}
