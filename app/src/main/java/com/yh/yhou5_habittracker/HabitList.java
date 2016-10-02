package com.yh.yhou5_habittracker;

import java.util.ArrayList;

/**
 * Created by yhou5 on 10/1/16.
 */
public class HabitList {

    private ArrayList<Habit> habits = new ArrayList<Habit>();

    public HabitList(){}

    public Habit getHabit(int index){
        return habits.get(index);
    }

    public boolean hasHabit(Habit habit){return habits.contains(habit);}

    public void addHabit(Habit habit){
        if(habits.contains(habit)){
            throw new IllegalArgumentException();
        }else{
            habits.add(habit);
        }
    }

    public ArrayList getComplete(){
        ArrayList<Habit> completeList = new ArrayList<Habit>();
        for(int i=0;i<habits.size();i++){
            if(habits.get(i).completed()){
                completeList.add(habits.get(i));
            }
        }
        return completeList;
    }

    public void delete(Habit habit){
        habits.remove(habit);
    }

    public void complete(Habit habit) throws HabitNameTooLongException {
        if(habits.contains(habit)){}else{
            habits.add(habit);
        }
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName() == habit.getName()){break;}
        }
        habits.get(index).setTimes(habits.get(index).getTimes() + 1);
    }

    public void clearCompletion(){
        for(int i=0;i<habits.size();i++){
            habits.get(i).setTimes(0);
        }
    }

    public int getTimes(Habit habit) throws HabitNameTooLongException {
        if(habits.contains(habit)){
            int index;
            for(index=0;index<habits.size();index++){
                if(habits.get(index).getName() == habit.getName()){break;}
            }
            return habits.get(index).getTimes();
        }else{
            throw new IllegalAccessError();
        }
    }
}
