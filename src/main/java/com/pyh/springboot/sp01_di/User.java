package com.pyh.springboot.sp01_di;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String id;
    private String name;
    private Date birth;
    private Company company;
    private List<String> books;
    private Map<String,String> cards;

    public User() {
    }

    public User(String id, String name, Date birth, Company company, List<String> books, Map<String, String> cards) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.company = company;
        this.books = books;
        this.cards = cards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", company=" + company +
                ", books=" + books +
                ", cards=" + cards +
                '}';
    }
}

