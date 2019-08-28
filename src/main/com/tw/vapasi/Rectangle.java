/* Defines a closed geometrical shape with four sides at an angle of 90 degree each */
package com.tw.vapasi;

class Rectangle {
    private float length;
    private float width;

    Rectangle(float rectLength, float rectWidth) {
        length = rectLength;
        width = rectWidth;
    }

    float area() {
        return length * width;
    }
}
