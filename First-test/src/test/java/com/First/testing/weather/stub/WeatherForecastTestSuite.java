package com.First.testing.weather.stub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class WeatherForecastTestSuite {
    @Test
    void testCalculateForecatWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testMidlTemp(){
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        double midlTemps = weatherForecast.midlTemp();
        Assertions.assertEquals(25.56, midlTemps);
    }
    @Test
    void testMedianTemp(){
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        double medianlTemp = weatherForecast.medianTemp();
        Assertions.assertEquals(25.5, medianlTemp);
    }
}
