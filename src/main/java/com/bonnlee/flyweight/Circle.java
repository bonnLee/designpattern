package com.bonnlee.flyweight;


public class Circle {
    private Double radius; //半径

    private Double perimeter; //周长

    private Double area; //面积

    public Circle(Double radius) {
        this.radius = radius;
        this.perimeter = Math.PI * 2 * radius;
        this.area = Math.PI * radius * radius;
    }


    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
