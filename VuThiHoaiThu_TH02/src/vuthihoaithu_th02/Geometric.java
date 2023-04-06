/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuthihoaithu_th02;
import java.util.Date;
/**
 *
 * @author Vu Thi Hoai Thu 
 */
public abstract class Geometric {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    
    
    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends Geometric {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getDiameter(){
        return this.radius * 2;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return getDiameter() * Math.PI;
    }
    
}

class Rectangle extends Geometric{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    @Override
    public double getArea() {
        return (this.height + this.width) * 2;
    }

    @Override
    public double getPerimeter() {
        return this.height * this.width;
    }
    
}
