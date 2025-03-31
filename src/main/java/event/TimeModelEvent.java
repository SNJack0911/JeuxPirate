package event;

import java.time.LocalDateTime;
import java.util.EventObject;

public class TimeModelEvent extends EventObject {
    
    private final LocalDateTime time;
    
    public TimeModelEvent(Object source, LocalDateTime time) {
        super(source);
        this.time = time;
    }
    
    public LocalDateTime getTime() {
        return time;
    }
    
}
