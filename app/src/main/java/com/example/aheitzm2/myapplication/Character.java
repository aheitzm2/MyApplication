package com.example.aheitzm2.myapplication;

public class Character {
    private int uid;
    private String firstName;
    private String familyName;
    private String weburl;
    private float latitude;
    private float longitude;
    private String bmppath;

    public Character(String firstName, String familyName, String weburl, float latitude, float longitude, String bmppath) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.weburl = weburl;
        this.latitude = latitude;
        this.longitude = longitude;
        this.bmppath = bmppath;
    }

    public Character(int uid, String firstName, String familyName, String weburl, float latitude, float longitude, String bmppath) {
        this.uid = uid;
        this.firstName = firstName;
        this.familyName = familyName;
        this.weburl = weburl;
        this.latitude = latitude;
        this.longitude = longitude;
        this.bmppath = bmppath;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getBmppath() {
        return bmppath;
    }

    public void setBmppath(String bmppath) {
        this.bmppath = bmppath;
    }
}
