package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void expectAreaIs4ForInput2() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    void expectPerimeterIs20ForInput5() {
        Square square = new Square(5);
        assertEquals(8, square.perimeter());
    }
}
