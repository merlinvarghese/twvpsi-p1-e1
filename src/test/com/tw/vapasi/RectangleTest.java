package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void verifyAreaIs6ForInput2And3() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    void verifyAreaIs8ForInput2And4() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(8, rectangle.area());
    }

    @Test
    void verifyPerimeterIs12ForInput2And4() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(12, rectangle.perimeter());
    }

    @Test
    void verifyAreaIs4ForInput2() {
        Rectangle rectangle = new Rectangle(2);
        assertEquals(4, rectangle.area());
    }

    @Test
    void verifyPerimeterIs8ForInput2() {
        Rectangle rectangle = new Rectangle(2);
        assertEquals(8, rectangle.perimeter());
    }


}