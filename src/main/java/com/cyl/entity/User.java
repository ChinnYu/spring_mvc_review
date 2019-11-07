package com.cyl.entity;

/**
 * @author : Liu
 * @Date : 2019/11/6 上午 11:41
 * @Description :
 */

public class User {

    private String username;
    private String password;
    private Card card;

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
