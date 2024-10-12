package org.chirko.behavioral.observer.weather;

import lombok.Getter;

@Getter
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private float windSpeed;
    private ChangeManager changeManager;

//    Used when there is only one Subject (Observable) and there is no need for ChangeManager
//    private final List<Observer> observers = new ArrayList<>();


    public WeatherData(ChangeManager changeManager) {
        this.changeManager = changeManager;
    }

    public void setMeasurements(float temperature, float humidity, float pressure, float windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        measurementChange();
    }

    public void setChangeManager(ChangeManager changeManager) {
        this.changeManager = changeManager;
    }

    public void measurementChange() {
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        changeManager.registerObserver(this, observer);
    }

    @Override
    public void detach(Observer observer) {
        changeManager.removeObserver(this, observer);
    }

    @Override
    public void notifyObservers() {
        changeManager.notifyObservers(this);
    }
}
