package ar.com.bbva.taller.validation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validation")
public class ValidationController{

    @RequestMapping(method=RequestMethod.GET)
    public String valid() throws Exception{
        return "OK";
    }

}