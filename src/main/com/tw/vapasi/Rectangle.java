/* Defines a closed geometrical shape with four sides at an angle of 90 degree each */
package com.tw.vapasi;

class Rectangle extends Shape {
    private  double length;
    private  double width;

    Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
