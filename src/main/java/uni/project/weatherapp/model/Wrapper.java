package uni.project.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wrapper {

    private Weather[] weather;
    private Map<String, Object> main = new HashMap<>();
    private Map<String, Object> wind;
    private String name;

}
