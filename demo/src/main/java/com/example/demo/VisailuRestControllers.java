package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Visailu;
import com.example.demo.Questions;

@RestController
public class VisailuRestControllers {

    String HelloWorld="Peli käynnistyy kanavalla localhost:8080/blondivisa. Blondivisassa" + 
    "on 5 kysymystä ja voit vastata niihin lisäämällä parametrin answer, esim localhost:8080/blondivisa?answer=a" +
    "";

    @GetMapping("/")
    public String Homepage(){
        return HelloWorld;
    }
    @GetMapping("/questions")
        public List<Visailu> getQuestions(){

        List <Visailu> questions =new ArrayList<>();
    
        questions.add(new Visailu(
            "Question 1: Kuinka pitkään kesti 100 vuoden sota?",
            "100 vuoden sota kesti 116 vuotta (1337-1453)",
            "116 vuotta",
            "99 vuotta",
            "100 vuotta",
            "150 vuotta"            
        ));
            questions.add(new Visailu(
            "Question 2: Missä maassa Panama-hattu keksittiin?",
            "Panama-hattu keksittiin Equadorissa",
            "Brasiliassa",
            "Chilessä",
            "Panamassa",
            "Equadorissa"           
        ));

        return questions;

    }

        @GetMapping("/blondivisaAll")
        public List<Visailu> getQuestionsList(){
            return Questions.blondivisa();
    }
        @GetMapping("/blondivisa")
    public String Answer(@RequestParam String answer){
        return "answer = " + answer;
    }
    
}
