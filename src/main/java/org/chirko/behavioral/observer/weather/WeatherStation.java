package org.chirko.behavioral.observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        ChangeManager changeManager = new SimpleChangeManager();
        WeatherData weatherData = new WeatherData(changeManager);
        LocationData locationData = new LocationData(changeManager);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData, locationData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f, 10);
        System.out.println();
        locationData.setLocation(41.40338f, 2.17403f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.4f, 12);
        System.out.println();
        locationData.setLocation(41.40438f, 2.17303f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f, 20);
        System.out.println();
        locationData.setLocation(41.40538f, 2.17103f);
    }
}
