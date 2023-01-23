package com.First.testing.user;

public class SimplyUser {
    private String username;
    private String realName;
    public SimplyUser (String username) {
        this.username=username;
            }

            public SimplyUser(String username, String realName){
        this.username=username;
        this.realName=realName;
            }
    public String getUsername(){

        return username;
    }

    public String getRealName() {
        return realName;
    }
}
