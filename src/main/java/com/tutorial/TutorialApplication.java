package com.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * In Java, annotations are a form of metadata that provide data
 * about a program but are not part of the program itself.
 * They can be added to Java declarations, such as classes,
 * methods, fields, parameters, and packages, to convey information
 * to the compiler, runtime, or other tools.
 */
@SpringBootApplication
public class TutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

}
