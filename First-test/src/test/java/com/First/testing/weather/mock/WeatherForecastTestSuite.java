package com.First.testing.weather.mock;

import com.First.testing.weather.stub.Temperatures;
import com.First.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;
import java.util.HashMap;                                                        // [6]
import java.util.Map;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    @Test
    void testCalculateForecastWithMock(){
       // Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        int quantityofSensors = weatherForecast.calculateForecast().size();

        Assertions.assertEquals(5,quantityofSensors);
    }
    @Test
    void testMidlTemp(){
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            double midlTemps = weatherForecast.midlTemp();
            Assertions.assertEquals(25.56, midlTemps);
    }
    @Test
    void testMedianTemp(){
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double medianlTemp = weatherForecast.medianTemp();
        Assertions.assertEquals(25.5, medianlTemp);
    }
}
