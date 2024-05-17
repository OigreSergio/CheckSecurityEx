package com.example.SecurityExercise.Controllers;

import com.example.SecurityExercise.NameService.NameService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@Tag(name = "name API")
public class NameController {
    @Autowired
    NameService service;

    @Operation(summary = "Get the username", description = "Returns the name of the user")
    @GetMapping("/normal")
    public String name(@RequestParam @Parameter(name = "name", description = "The name of the user", example = "Sergio") String name) {
        return service.getNormalName(name);
    }

    @Operation(summary = "Get username reversed", description = "Returns the username, but reversed")
    @PostMapping("/reverse")
    public String reverseName(@RequestParam @Parameter(name = "name", description = "The name of the user", example = "Sergio") StringBuilder name) {
        return service.getReverseName(name);
    }
}