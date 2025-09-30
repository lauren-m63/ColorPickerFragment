package com.example.colorpicker;

public class Web {
    public String name;
    public String url;

    // Constructor inside the class
    public Web(String name, String url) {
        this.name= name;
        this.url = url;
    }

    @Override
    public String toString(){
        return name;
    }


}// last bracket
