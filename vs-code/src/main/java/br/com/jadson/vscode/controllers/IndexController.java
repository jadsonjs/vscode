package br.com.jadson.vscode.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${application.name}")
	String name;

    @RequestMapping(path = "/")
    public String index(){
        System.out.println(name);
        return name;
    }
    
}
