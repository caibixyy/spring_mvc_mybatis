package com.xyy.baen;

public class User {
    private int id;
    private String user_account;
    private String user_password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public User(int id, String user_account, String user_password) {
        this.id = id;
        this.user_account = user_account;
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_account='" + user_account + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }
}
