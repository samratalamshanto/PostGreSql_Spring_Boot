package com.example.demopostgresql.controller;

import com.example.demopostgresql.service.TutorialService;
import com.example.demopostgresql.entity.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {
    @Autowired
    TutorialService tutorialService;
    @GetMapping("/tutorials")
    public List<Tutorial> getAllTutorials()
    {
        return tutorialService.getAllTutorials();
    }
    @GetMapping("tutorials/{id}")
    public Tutorial getTutorialById(@PathVariable("id") long id)
    {
        return tutorialService.getTutorialById(id);
    }

    @PostMapping("/tutorials")
    public void postTutorial(@RequestBody Tutorial t1)
    {
        tutorialService.createTutorial(t1);
    }
}
