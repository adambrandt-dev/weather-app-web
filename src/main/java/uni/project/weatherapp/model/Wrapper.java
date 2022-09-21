package uni.project.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wrapper {


    private Weather[] weather;
    private Object main;
    private String name;

}
