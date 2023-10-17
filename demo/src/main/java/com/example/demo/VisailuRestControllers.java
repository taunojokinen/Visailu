package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VisailuRestControllers {

    String HelloWorld="Peli käynnistyy kanavalla localhost:8080/question. Blondivisassa" + 
    "on 5 kysymystä ja voit vastata niihin lisäämällä parametrin answer sivulle answer, esim localhost:8080/answer?answer=a" +
    "sivu näyttää oikean vastauksen välittömästi, kun olet vastannut. Tämän jälkeen voit hakea uuden kysymyksen sivulta localhost:8080/question";

    int status = 1;
    int correctAnswers = 0;

    @GetMapping("/")
    public String Homepage(){
        return HelloWorld;
    }
    @GetMapping("/question")
        public String nextQuestion(){

        Visailu questionObj = Questions.blondivisa().get(status-1);
        //tässä on muotoilu - sori siitä.
        String question = questionObj.getQuestion() + "<br></br>" + 
        questionObj.getChoiceA() + "<br></br>" + 
        questionObj.getChoiceB() + "<br></br>" + 
        questionObj.getChoiceC() + "<br></br>" + 
        questionObj.getChoiceD();

        return question;

    }

        @GetMapping("/blondivisaAll")
        public List<Visailu> getQuestionsList(){
            return Questions.blondivisa();
    }
        @GetMapping("/blondivisa")
    public String Answer(@RequestParam String answer){
        String vastaus=Questions.blondivisa().get(status-1).getAnswer();
        String oikeaVastaus=Questions.blondivisa().get(status-1).getCorrectChoice();
        System.out.println(oikeaVastaus);
        System.out.println(answer);
        if (oikeaVastaus.equalsIgnoreCase(answer)){
            correctAnswers ++;
        }
        status ++;
        if (status == 6){
            vastaus=vastaus + "<br></br>" + "Sait visailussa " + correctAnswers + " oikeaa vastausta";
            status=1;
            correctAnswers = 0;
        }
        return vastaus;
    }
    
}
