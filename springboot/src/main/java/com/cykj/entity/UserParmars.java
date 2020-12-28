package com.cykj.entity;

import org.springframework.stereotype.Component;

@Component
public class UserParmars {
    private int id;
    private String UserParmars;
    private int StateID;

    public UserParmars() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserParmars() {
        return UserParmars;
    }

    public void setUserParmars(String userParmars) {
        UserParmars = userParmars;
    }

    public int getStateID() {
        return StateID;
    }

    public void setStateID(int stateID) {
        StateID = stateID;
    }
}
