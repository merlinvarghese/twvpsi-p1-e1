package com.tw.vapasi;

class Square extends Shape {
    private double side;

    Square(float side) {
        this.side=side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

}