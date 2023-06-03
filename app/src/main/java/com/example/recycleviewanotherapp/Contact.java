package com.example.recycleviewanotherapp;

public class Contact {

    private int sno;
    private String phoneNumber;
    private String name;

    public Contact(int sno, String phoneNumber, String name) {
        this.sno = sno;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
