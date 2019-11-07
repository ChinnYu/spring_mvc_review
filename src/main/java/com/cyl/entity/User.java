package com.cyl.entity;

/**
 * @author : Liu
 * @Date : 2019/11/6 上午 11:41
 * @Description :
 */

public class User {
    private int id;
    private String username;
    private String password;
    private Card card;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
