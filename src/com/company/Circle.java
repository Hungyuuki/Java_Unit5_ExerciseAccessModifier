package com.company;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        double radius = 1.0;
        String color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        String color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
