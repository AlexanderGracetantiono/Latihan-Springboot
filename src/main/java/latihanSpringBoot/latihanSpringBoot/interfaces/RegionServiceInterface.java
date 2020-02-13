/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.interfaces;

import latihanSpringBoot.latihanSpringBoot.enitity.Regions;

/**
 *
 * @author Dharta
 */
public interface RegionServiceInterface {

    Iterable<Regions> findAll();

    Regions findbyIde();

//    Regions findbyIde(Integer Id);
    Regions save(Regions r);
    
    void delete(Integer Id);
}
