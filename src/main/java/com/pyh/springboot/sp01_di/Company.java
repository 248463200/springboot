package com.pyh.springboot.sp01_di;


import org.springframework.stereotype.Component;

@Component
public class Company {
    private String name;
    private int level;

    public Company() {
    }

    public Company(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
