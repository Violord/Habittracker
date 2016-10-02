package com.yh.yhou5_habittracker;

import java.util.Date;

/**
 * Created by yhou5 on 10/1/16.
 */
public interface Habitable {
    public Date getDate();
    public String getName() throws HabitNameTooLongException;
    public String getDay();
    public int getTimes();
}
