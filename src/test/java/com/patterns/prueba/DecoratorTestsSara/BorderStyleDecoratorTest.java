package com.patterns.prueba.DecoratorTestsSara;

import com.patterns.structural.decorator.BorderStyleDecorator;
import com.patterns.structural.decorator.Circle;
import com.patterns.structural.decorator.Rectangle;
import com.patterns.structural.decorator.Shape;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Tag("database")
class BorderStyleDecoratorTest {

    @Test
    void draw() {
        Shape decoratedShape = new Circle();
        decoratedShape.draw();
        Shape decoratedShape2 = new Rectangle();
        decoratedShape2.draw();
        assertNotEquals(decoratedShape2,decoratedShape);

    }

    @Ignore("Falta implementación")
    @Test
    void resize() {
        Shape decoratedShape = new Circle();
        decoratedShape.resize();
        fail();

    }

    @Test
    void description() {
        Shape circulo = new Circle();
        String style ="sólido";
        Shape circuloBordeDecorado = new BorderStyleDecorator(circulo, style);
        assertEquals("Hey there! I'm using Decorator! decorated with border style: "+style, circuloBordeDecorado.description());
    }

    @Test
    void isHide() {
        Shape circulo = new Circle();
        Shape circuloBordeDecorado = new BorderStyleDecorator(circulo, "2px");
        assertEquals(false, circuloBordeDecorado.isHide());
    }
}