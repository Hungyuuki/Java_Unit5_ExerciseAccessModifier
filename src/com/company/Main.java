package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        circle.getArea();
        System.out.println("Đường tròn có bán kính "+circle.getRadius()+" diện tích "+circle.getArea());
    }
}

