package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FooResource controller
 */
@RestController
@RequestMapping("/api/foo")
public class FooResource {

    private final Logger log = LoggerFactory.getLogger(FooResource.class);

    /**
     * GET categorycontroller
     */
    @GetMapping("/categorycontroller")
    public String categorycontroller() {
        return "categorycontroller";
    }

    /**
     * GET add
     */
    @GetMapping("/add")
    public String add() {
        return "add";
    }

    /**
     * GET hy
     */
    @GetMapping("/hy")
    public String hy() {
        return "hy";
    }
}
