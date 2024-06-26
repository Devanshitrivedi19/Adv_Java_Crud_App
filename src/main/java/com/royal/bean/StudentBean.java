package com.royal.bean;

import java.util.ArrayList;

public class StudentBean {
    
    private int rno;
    private String name;
    private String std;
    private int marks;
    private String[] hobbies;
    
    public StudentBean() {
        
    }
    
    public StudentBean(int rno, String name, String std, int marks, String[] hobbies) {
        this.rno = rno;
        this.name = name;
        this.std = std;
        this.marks = marks;
        this.hobbies = hobbies;
    }
    
    public int getRno() {
        return rno;
    }
    
    public void setRno(int rno) {
        this.rno = rno;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getStd() {
        return std;
    }
    
    public void setStd(String std) {
        this.std = std;
    }
    
    public int getMarks() {
        return marks;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    public String[] getHobbies() {
        return hobbies;
    }
    
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
 
}
