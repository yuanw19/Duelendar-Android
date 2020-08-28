package com.example.duelendar_version1.Model;

public class Event {
    private String name;
    //category could have multiple values: "subjects and other"
    private String category;
    private String memo;
    private String notify;
    private String dueDate;
    private String foreignCountry;
    private String locatedCountry;
    //status could have two values: "completed and incomplete"
    private String status;
    private int idInDatabase;

    //customized constructor
    public Event(String name, String category, String memo, String notify, String dueDate,
                 String foreignCountry, String locatedCountry, String status, int idInDatabase) {
        this.name = name;
        this.category = category;
        this.memo = memo;
        this.notify = notify;
        this.dueDate = dueDate;
        this.foreignCountry = foreignCountry;
        this.locatedCountry = locatedCountry;
        this.status = status;
        this.idInDatabase = idInDatabase;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getMemo(){
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getNotify(){
        return notify;
    }
    public void setNotify(String notify){
        this.notify = notify;
    }
    public String getDueDate(){
        return dueDate;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public String getForeignCountry(){
        return foreignCountry;
    }
    public void setForeignCountry(String foreignCountry){
        this.foreignCountry = foreignCountry;
    }
    public String getLocatedCountry(){
        return locatedCountry;
    }
    public void setLocatedCountry(String locatedCountry){
        this.locatedCountry = locatedCountry;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public int getIdInDatabase(){
        return idInDatabase;
    }
    public void setIdInDatabase(int idInDatabase){
        this.idInDatabase = idInDatabase;
    }
}
