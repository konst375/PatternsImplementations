package org.chirko.behavioral.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float latitude;
    private float longitude;
    private WeatherData weatherData;
    private LocationData locationData;

    public CurrentConditionsDisplay(WeatherData weatherData, LocationData locationData) {
        this.weatherData = weatherData;
        this.locationData = locationData;
        weatherData.attach(this);
        locationData.attach(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        latitude = locationData.getLatitude();
        longitude = locationData.getLongitude();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity at: "
                + latitude + "° + " + longitude + "°");
    }
}
