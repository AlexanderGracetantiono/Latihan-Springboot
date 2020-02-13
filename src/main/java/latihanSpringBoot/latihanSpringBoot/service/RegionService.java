/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.service;

import latihanSpringBoot.latihanSpringBoot.enitity.Regions;
import latihanSpringBoot.latihanSpringBoot.interfaces.RegionServiceInterface;
import latihanSpringBoot.latihanSpringBoot.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dharta
 */

@Service
public class RegionService implements RegionServiceInterface {
    
    @Autowired
    private RegionRepository regionRepository;
    
    @Override
    public Iterable<Regions> findAll() {
        return regionRepository.findAll();
    }
    
//    @Override
//    public Regions findbyIde(Integer id){
//        return regionRepository.findbyIde(id);
//    }
    
    @Override
    public Regions findbyIde(){
        return regionRepository.findbyIde(4);
    }
    
    @Override
    public Regions save(Regions r){
        return regionRepository.save(r);
    }
    @Override
    public void delete(Integer Id){
        regionRepository.deleteById(Id);
    }
    
    
}
