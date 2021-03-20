package com.patterns.creational.prototype;


public class Rectangle extends Shape{

    private double width;
    private double height;

    // Constructores
    public Rectangle(){}
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    // Getters y Setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // método clone()
    public Rectangle (Rectangle rectclone) {
       this.setHeight(rectclone.getHeight());
       this.setWidth(rectclone.getWidth());
       this.setColor(rectclone.getColor());

    }

    // método area()
    @Override
    public Double area() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
