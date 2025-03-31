/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event;

import java.util.EventListener;

public interface TimeModelListener extends EventListener {
    public void timeChanged(TimeModelEvent event);
}
