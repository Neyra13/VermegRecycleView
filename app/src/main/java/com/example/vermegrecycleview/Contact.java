package com.example.vermegrecycleview;

public class Contact {
    private int id;
    private String name;
    private String lastName;
    private String tel ;
    private int photo ;

    public Contact() {
    }

    public Contact(int id, String name, String lastName, String tel, int photo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.tel = tel;
        this.photo = photo;
    }

    public Contact(String name, String lastName, String tel, int photo) {
        this.name = name;
        this.lastName = lastName;
        this.tel = tel;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
