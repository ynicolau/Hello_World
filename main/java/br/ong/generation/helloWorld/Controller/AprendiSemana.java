package br.ong.generation.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

    @RestController //Essa class se trata de um controle
    @RequestMapping("/aprendizado")
    public class AprendiSemana {

        @GetMapping
        public ArrayList<String> semana(){
            ArrayList<String> semanaList = new ArrayList<>();

            semanaList.add(" --- Aprendizado da Semana --- ");
            semanaList.add("- MySql");
            semanaList.add("- Spring tool");
            semanaList.add("- Kahoot");
            semanaList.add("Pesquisar no google");
            semanaList.add("Ter impatia");
            semanaList.add("Se colocar no lugar do próximo");

            return semanaList;
        }
    }
