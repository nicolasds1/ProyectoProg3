package ar.edu.ub.parquesnacionales.controller;

import ar.edu.ub.parquesnacionales.Model.Encuesta;
import ar.edu.ub.parquesnacionales.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class EncuestaController {


    @Autowired
    EncuestaRepository repository;


    @GetMapping("/getAPISysdate")
    public String getAPISysdate(){
        return new Date().toString();
    }

    @PostMapping
    public String obtenerResultados(Model modelo, Encuesta encuesta){
        repository.save(encuesta);
        return "Encuesta";
    }





}
