package org.example;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")  // Base route: /hello
public class HelloController {

    @Get("/")  // GET /hello
    public String index() {
        return "Hello from Micronaut!";
    }

    @Get("/{name}")  // GET /hello/{name}
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}

