/* Defines a closed geometrical shape with four sides at an angle of 90 degree each */
package com.tw.vapasi;

class Rectangle {
    private float length;
    private float width;

    Rectangle(float rectLength, float rectWidth) {
        length = rectLength;
        width = rectWidth;
    }

    Rectangle(float side) {
        length = side;
        width = side;
    }

    float area() {
        return length * width;
    }

    float perimeter() {
        return 2 * (length + width);
    }
}
