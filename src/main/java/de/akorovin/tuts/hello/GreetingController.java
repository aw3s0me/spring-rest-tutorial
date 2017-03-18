package de.akorovin.tuts.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by korovin on 3/18/2017.
 * This code uses Spring 4’s new @RestController annotation,
 * which marks the class as a controller where every method returns a domain object instead of a view
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.
     * -----------------
     * The above example does not specify GET vs. PUT, POST, and so forth,
     * because @RequestMapping maps all HTTP operations by default.
     * Use @RequestMapping(method=GET) to narrow this mapping.
     * @param name
     * @return
     */
    @RequestMapping("/greeting")
    // @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        // The object data will be written directly to the HTTP response as JSON.
        // Because Jackson 2 is on the classpath, Spring’s MappingJackson2HttpMessageConverter is automatically chosen to convert
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
