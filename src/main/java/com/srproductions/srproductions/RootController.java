package com.srproductions.srproductions;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RootController {
    
    @GetMapping(value="/")
    public ResponseEntity<?> root(){
        return ResponseEntity.status(HttpStatus.OK).body("SR productions started v1.0");
    }
}
