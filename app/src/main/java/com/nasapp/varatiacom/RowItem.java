package com.nasapp.varatiacom;

import android.widget.ImageView;

public class RowItem {





        private String location,rent,rooms,for_gender,for_occupation,address,email,phone;
        private int image;

    public RowItem(int image,String location, String rent,String rooms,String gender,String oc,String ad,String e,String p) {

           this.image=image;
            this.location=location;
            this.rent=rent;
            this.rooms=rooms;
            this.for_gender=gender;
            this.for_occupation=oc;
            this.address=ad;
            this.email=e;
            this.phone=p;
        }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getFor_gender() {
        return for_gender;
    }

    public void setFor_gender(String for_gender) {
        this.for_gender = for_gender;
    }

    public String getFor_occupation() {
        return for_occupation;
    }

    public void setFor_occupation(String for_occupation) {
        this.for_occupation = for_occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


