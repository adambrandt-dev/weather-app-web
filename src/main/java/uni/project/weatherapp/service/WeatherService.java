package uni.project.weatherapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import uni.project.weatherapp.model.Wrapper;

@Service
@RequiredArgsConstructor
public class WeatherService {

    WeatherClient weatherClient = new WeatherClient();

    public Wrapper getWeatherByLocation(String location) throws HttpClientErrorException {
        String url = weatherClient.getWeatherApi(location);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Wrapper.class);
    }
}
