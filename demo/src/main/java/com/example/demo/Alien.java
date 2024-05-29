package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String name;
    private String tech;

    public void setAid(int aid) {
        this.aid = aid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    
    public int getAid() {
        return aid;
    }
    public String getName() {
        return name;
    }
    public String getTech() {
        return tech;
    }

    public void show(){
        System.out.println("Diddy did it");
    }


    
}
