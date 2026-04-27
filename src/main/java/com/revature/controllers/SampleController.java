package com.revature.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("sample")
public class SampleController {

    Set<String> nameSet = new HashSet<>();

    @GetMapping("/connect")
    public String getSampleMessage(){
        return "You've hit the Server!";
    }


    @PostMapping("/{sampleName}")
    public String addedName(@PathVariable String sampleName){
        nameSet.add(sampleName);
        return "You've added " + sampleName + " to the list!";
    }

    @GetMapping
    public Set<String> getNameSet(){
        return nameSet;
    }
}
