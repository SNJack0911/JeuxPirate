/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import event.TimeModelEvent;
import event.TimeModelListener;
import java.time.LocalDateTime;
import javax.swing.Timer;
import javax.swing.event.EventListenerList;

/**
 *
 * @author acarayon
 */
public class TimeModel {

    private static final int UPDATE_RATE = 1000;
    private final EventListenerList listenerList;
    private final Timer timer;
    private LocalDateTime time;

    public TimeModel() {
        time = LocalDateTime.now();
        listenerList = new EventListenerList();
        timer = new Timer(UPDATE_RATE, (e) -> {
            fireTimeChangedEvent();
        });
        timer.start();
    }

    public void setTime(LocalDateTime time) {
        if (this.time != time) {
            this.time = time;
            fireTimeChangedEvent();
        }
    }

    public void addTimeModelListener(TimeModelListener listener) {
        listenerList.add(TimeModelListener.class, listener);
    }

    public void removeTimeModelListener(TimeModelListener listener) {
        listenerList.remove(TimeModelListener.class, listener);
    }

    private void fireTimeChangedEvent() {
        this.time = LocalDateTime.now();
        TimeModelEvent event = new TimeModelEvent(this,time);
        for (TimeModelListener listener : listenerList.getListeners(TimeModelListener.class)) {
            listener.timeChanged(event);
        }
    }

    public LocalDateTime getTime() {
        return time;
    }

}
