package com.example.graduate.pojo;

public class UserInfo {
    private Integer uer_id;
    private String user_name;
    private String password;

    @Override
    public String toString() {
        return "UserInfo{" +
                "uer_id=" + uer_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getUer_id() {
        return uer_id;
    }

    public void setUer_id(Integer uer_id) {
        this.uer_id = uer_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String username) {
        this.user_name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
