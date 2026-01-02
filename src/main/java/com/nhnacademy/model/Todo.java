package com.nhnacademy.model;


public class Todo {
    private static int Countid = 1;

    private int id;
    private String title;
    private int hour;
    private Category Enum;
    private Priority importance;



    public Todo(String title, int hour, int selEnum, int selimportance){
        this.id = Countid++;
        this.title = title;
        this.hour = hour;
        this.Enum = Category.fromCategory(selEnum);
        this.importance = Priority.fromlevel(selimportance);
    }

    public int getCountid() {
        return id;
    }

    public Category getEnum() {
        return this.Enum;
    }

    public int getHour() {
        return this.hour;
    }

    public Priority getImportance() {
        return this.importance;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

     public void sethour(int hour){
        this.hour = hour;
    }





    
}
