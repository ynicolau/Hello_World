package br.ong.generation.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController //Essa class se trata de um controle
@RequestMapping("/bsm")
public class BSMS {

    @GetMapping
    public ArrayList<String> bsm(){
        ArrayList<String> bsmList = new ArrayList<>();

        bsmList.add(" --- lista BSM's ---- ");
        bsmList.add("- Introdução às habilidades comportamentais e mentalidades");
        bsmList.add("- Mentalidade de crescimento");
        bsmList.add("- Persitência");
        bsmList.add("- Responsabilidade pessoal");
        bsmList.add("- Orientação ao futuro");
        bsmList.add("- Comunicação");
        bsmList.add("- Orientação ao Detalhes");

        return bsmList;
    }
}
