package com.example.serviceribbon.web;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    private HelloService helloService;

    /**
     * 在浏览器上多次访问http://localhost:8764/hi?name=forezp，浏览器交替显示：
     hi forezp,i am from port:8762
     hi forezp,i am from port:8763

     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
