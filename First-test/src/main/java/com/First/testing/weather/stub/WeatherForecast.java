package com.First.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures=temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();


        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue()+1.0);
        }

        return resultMap;
    }
    public double midlTemp () {
        double MidlTemp = 0;
        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){

            MidlTemp +=temperature.getValue();
        }
        return MidlTemp/temperatures.getTemperatures().size();
     }

     public double medianTemp () {
         List<Double> valuesTemp = new ArrayList<>();

         for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
             valuesTemp.add(temperature.getValue());
         }

         Collections.sort(valuesTemp);
         if (valuesTemp.size() % 2 == 0) {

             return (valuesTemp.get(valuesTemp.size()/2) + valuesTemp.get(valuesTemp.size()/2 - 1))/2;
         }else{
             return valuesTemp.get(valuesTemp.size()/2);
         }
     }
}
