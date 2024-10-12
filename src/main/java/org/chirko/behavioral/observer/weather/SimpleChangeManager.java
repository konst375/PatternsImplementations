package org.chirko.behavioral.observer.weather;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Simple implementation of ChangeManager and it always updates all observers of each subject
 */
public class SimpleChangeManager implements ChangeManager {
    Map<Subject, Set<Observer>> subjectObserverMap = new HashMap<>();

    @Override
    public void registerObserver(Subject subject, Observer observer) {
        if (subjectObserverMap.containsKey(subject)) {
            HashSet<Observer> newSet = new HashSet<>(subjectObserverMap.get(subject));
            newSet.add(observer);
            subjectObserverMap.put(subject, newSet);
        } else {
            subjectObserverMap.put(subject, Set.of(observer));
        }
    }

    @Override
    public void removeObserver(Subject subject, Observer observer) {
        if (subjectObserverMap.containsKey(subject)) {
            subjectObserverMap.get(subject).remove(observer);
        }
    }

    @Override
    public void notifyObservers(Subject subject) {
        subjectObserverMap.get(subject).forEach(Observer::update);
    }
}
