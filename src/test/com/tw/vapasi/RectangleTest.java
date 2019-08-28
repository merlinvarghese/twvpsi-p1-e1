package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void expectAreaIs6ForInput2And3() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void expectAreaIs8ForInput2And4() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(8, rectangle.area());
    }

    @Test
    void expectPerimeterIs12ForInput2And4() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(12, rectangle.perimeter());
    }




}