package edu.iis.mto.time;

import java.time.LocalDateTime;

public interface FakeClock {
    LocalDateTime now();
    void changeHours(int hours);
}
