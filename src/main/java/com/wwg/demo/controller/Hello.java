package com.wwg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RequestMapping(value = "/hello")
@RestController
public class Hello {

    @RequestMapping(value = "/say/{name}",method = RequestMethod.GET)
    public String getHello(@PathVariable String name){
        String mess = "hello : " + name;
        return mess;
    }

}
