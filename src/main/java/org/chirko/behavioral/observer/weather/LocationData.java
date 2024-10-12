package org.chirko.behavioral.observer.weather;

import lombok.Getter;

@Getter
public class LocationData implements Subject {
    private float latitude;
    private float longitude;
    private ChangeManager changeManager;

    public LocationData(ChangeManager changeManager) {
        this.changeManager = changeManager;
    }

    public void setLocation(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        notifyObservers();
    }

    public void setChangeManager(ChangeManager changeManager) {
        this.changeManager = changeManager;
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
