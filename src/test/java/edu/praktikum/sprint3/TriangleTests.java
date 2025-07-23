package edu.praktikum.sprint3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @ParameterizedTest(name = "Периметр треугольника со сторонами {0}, {1}, {2} равен {3}")
    @MethodSource("data")
    public void perimeterTest(int a, int b, int c, int expectedResult) {
        Triangle triangle = new Triangle(a, b, c);

        assertEquals(expectedResult, triangle.perimeter(), "Периметр вычисляется неверно");
    }

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2, 3, 5, 10),
                Arguments.of(1, 3, 2, 6),
                Arguments.of(30, 42, 38, 110)
        );
    }

    @Test
    public void squareTest() {
        Triangle triangle = new Triangle(3, 3, 4);

        assertEquals(4, triangle.square(), "Площадь вычисляется неверно");
    }

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(2, 7, 5);

        assertEquals(7, triangle.maxSide(), "Максимальная сторона вычисляется неверно");
    }
}
