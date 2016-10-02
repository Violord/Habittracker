package com.yh.yhou5_habittracker;

import java.util.Date;

/**
 * Created by yhou5 on 10/1/16.
 */
public class Habit implements Habitable{

    private Date date;
    private String name;
    private String day;
    private int times;

    public Habit(String name){
        this.name = name;
        this.date = new Date();
        this.day = new String();
        this.times = 0;
    }

    public boolean completed(){
        return (times>0);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() throws HabitNameTooLongException{
        if(name.length() > 60){
            throw new HabitNameTooLongException();
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}
