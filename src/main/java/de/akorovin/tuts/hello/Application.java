package de.akorovin.tuts.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by korovin on 3/18/2017.
 * creates a standalone application. You package everything in a single, executable JAR fil
 * and embed tomcat servlet container as http runtime
 * ---------------
 * @ Configuration tags the class as a source of bean definitions for the application context.
 * @ EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings
 *
 * NOTE: No web.xml (no need to deal with infrastructure)
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
