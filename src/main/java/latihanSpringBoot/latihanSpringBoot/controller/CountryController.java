/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.controller;

import latihanSpringBoot.latihanSpringBoot.enitity.Countries;
import latihanSpringBoot.latihanSpringBoot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Dharta
 */
@Controller
public class CountryController {
    @Autowired
    public CountryService countryService;
    
//        @GetMapping(value = "/")
//        public String index(){
//            for(Countries countries : countryService.findAll()){
//                System.out.println("Country Id " + countries.getRegionId());
//            }
//            return "index";
//        }
}
