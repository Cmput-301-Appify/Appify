package com.example.appify;

public abstract class Shape {
    private Integer x;
    private Integer y;
    public Shape(Integer x, Integer y)
    {
        String color = "RANDOM COLOR";
        this.x = x;
        this.y = y;
    };
    public Shape(){};
}
