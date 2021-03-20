package com.patterns.creational.prototype;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Clonar
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        final Logger log = LogManager.getLogger(Main.class);
        final Logger log2 = LogManager.getLogger(Main.class);
        final Logger log3 = LogManager.getLogger(Main.class);
        Shape rectangle = new Rectangle("negro", 200, 400);
        Shape pieza = rectangle.clone();
        log.debug(rectangle);
        log2.debug(pieza);


        Rectangle rectangle2 = new Rectangle("negro", 200, 400);
        Rectangle pieza2 =  new Rectangle(rectangle2);
        log3.debug(pieza2);
    }
}
