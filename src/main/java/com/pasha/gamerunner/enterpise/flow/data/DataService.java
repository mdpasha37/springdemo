package com.pasha.gamerunner.enterpise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService{

    public List<Integer> retrieveData(){
        return Arrays.asList(1,2,3,4);
    }
    
}