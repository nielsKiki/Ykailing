package com.goolge.ketang.ketang3;

public class UserList {
    private String name;
    private String passworrd;

    public UserList(String name, String passworrd) {
        this.name = name;
        this.passworrd = passworrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworrd() {
        return passworrd;
    }

    public void setPassworrd(String passworrd) {
        this.passworrd = passworrd;
    }
}
