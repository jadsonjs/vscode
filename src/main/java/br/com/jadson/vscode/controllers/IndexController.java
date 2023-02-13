package br.com.jadson.vscode.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${application.name}")
	String name;

    @GetMapping(path = "/")
    
    public String index(){
        return "wellcome to :"+name;
    }
    
}