package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    public static List <Visailu> blondivisa(){
        List <Visailu> questionList = new ArrayList<>(); 

    questionList.add(new Visailu(
        "Question 1: Kuinka pitkään kesti 100 vuoden sota?",
        "100 vuoden sota kesti 116 vuotta (1337-1453)",
        "116 vuotta",
        "99 vuotta",
        "100 vuotta",
        "150 vuotta",
        "A"
    ));

    questionList.add(new Visailu(
        "Question 2: Missä maassa Panama-hattu keksittiin?",
        "Panama-hattu keksittiin Equadorissa",
        "Brasiliassa",
        "Chilessä",
        "Panamassa",
        "Equadorissa",
        "D"
    ));
    
    questionList.add(new Visailu(
        "Question 3: Missä kuussa venäläiset juhlivat lokakuun vallankumousta?",
        "Lokakuun vallankumousta juhlitaan marraskuussa",
        "Tammikuussa",
        "Syyskuussa",
        "Lokakuussa",
        "Marraskuussa",
        "D"
    ));
        
    questionList.add(new Visailu(
        "Question 4: Mikä oli kuningas George IV:nnen nimi?",
        "Kuningas George IV:nnen oikea nimi oli Albert",
        "Albert",
        "George",
        "Manuel",
        "Jonas",
        "A"
    ));

    questionList.add(new Visailu(
        "Question 5: Mistä eläimestä saivat Kanariansaaret nimensä?",
        "Kanariansaaret sai nimensä hylkeistä . Canaria latinaksi tarkoittaa \"hylkeiden (=merikoirat) saari\"",
        "Kanarialinnusta",
        "Kengurusta",
        "Rotasta",
        "Hylkeestä",
        "D"
    ));
    return questionList;
    }

}
