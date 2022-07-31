package br.ong.generation.helloWorld.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa class se trata de um controle
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping
    public String hello() {
       return "Hello World";
    }

}
