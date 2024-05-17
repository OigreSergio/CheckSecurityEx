package com.example.SecurityExercise.NameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String getNormalName(String name) {
        return name;
    }
    public String getReverseName(StringBuilder name) {
        return String.valueOf(name.reverse());
    }
}