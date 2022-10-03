package com.example.demopostgresql.service;

import com.example.demopostgresql.entity.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demopostgresql.repository.TutorialRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService {
    @Autowired
    TutorialRepository tutorialRepository;

    public List<Tutorial> getAllTutorials(){

            List<Tutorial> tutorials = new ArrayList<>();

            //double colon parameter: Using Lambda expression ----> <Class name>::<method name>
            tutorialRepository.findAll().forEach(tutorials::add);


            return tutorials;
    }

    public Tutorial getTutorialById(long id)
    {
        Tutorial tutorial = new Tutorial();
        if(tutorialRepository.findById(id).isPresent())
        {
            tutorial = tutorialRepository.findById(id).get();
        }
//        else {
//            return HttpStatus.NOT_FOUND;####
//        }



        return tutorial;
    }

    public void createTutorial(Tutorial t1)
    {
        tutorialRepository.save(t1);
    }
}
