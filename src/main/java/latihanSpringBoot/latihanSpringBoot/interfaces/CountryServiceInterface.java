/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.interfaces;

import java.util.List;
import latihanSpringBoot.latihanSpringBoot.enitity.Countries;

/**
 *
 * @author Dharta
 */
public interface CountryServiceInterface {
    
    Iterable<Countries> findAll();
    List<Countries> findallid(String a);
    Countries findbyidCount(String d);
    Countries save(Countries a);
    void delete(String Id);

}
