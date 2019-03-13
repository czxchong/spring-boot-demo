package com.xchong.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class DemoController {

    @RequestMapping(value="/user", method= RequestMethod.GET)
    public String getUser(@PathVariable Long user) {
        // ...
        return "";
    }

    @RequestMapping(value="/customers", method=RequestMethod.GET)
    List<String> getUserCustomers(@PathVariable Long user) {
        // ...
        return new ArrayList<>();
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long user) {
        // ...
        return "";
    }
}
