/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.controller;

import latihanSpringBoot.latihanSpringBoot.enitity.Regions;
import latihanSpringBoot.latihanSpringBoot.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Dharta
 */
@Controller
public class RegionController {

    @Autowired
    public RegionService regionService;

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("ObjSave", new Regions());

//            for(Regions regions : regionService.findAll()){
//                System.out.println("Region Id " + regions.getRegionId());
//            }
        return "index";
    }

    @GetMapping(value = "/data")
    public String data(Model model) {
        model.addAttribute("dataregion", regionService.findAll());
//        model.addAttribute("dataregion", regionService.findbyIde());
        return "data";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute Regions r) {
        regionService.save(r);
        return "redirect:/data";
    }
    
    
    @PostMapping(value = "/saveparam") // Get by param
    public String saveparam(@RequestParam("reqId") Integer Id, @RequestParam("reqName") String name) {
        regionService.save(new Regions(Id, name));
        return "redirect:/data";
    }

}
