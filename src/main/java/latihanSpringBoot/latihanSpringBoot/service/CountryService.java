/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.service;

import java.util.List;
import latihanSpringBoot.latihanSpringBoot.enitity.Countries;
import latihanSpringBoot.latihanSpringBoot.interfaces.CountryServiceInterface;
import latihanSpringBoot.latihanSpringBoot.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dharta
 */
@Service
public class CountryService implements CountryServiceInterface {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Iterable<Countries> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public List<Countries> findallid(String a) {
        return countryRepository.findallid(a);
    }

    @Override
    public Countries findbyidCount(String d) {
        return countryRepository.findbyidCount(d);
    }

    @Override
    public Countries save(Countries a) {
        return countryRepository.save(a);
    }
    public void delete(String Id){
        countryRepository.deleteById(Id);
        }

}
