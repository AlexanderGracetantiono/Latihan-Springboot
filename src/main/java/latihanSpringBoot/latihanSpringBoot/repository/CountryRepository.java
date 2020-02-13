/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.repository;

import java.util.List;
import latihanSpringBoot.latihanSpringBoot.enitity.Countries;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dharta
 */
@Repository
public interface CountryRepository extends CrudRepository<Countries, String>{
    @Query(value = "SELECT * FROM countries", nativeQuery = true)
    Iterable<Countries> findallCount(); // Tidak bebas karna manggil ke entity
    
    @Query(value = "SELECT * FROM countries WHERE country_name = ?1", nativeQuery = true)
    List<Countries> findallid(String a);
    
    @Query(value = "SELECT * FROM countries WHERE country_id =?1", nativeQuery = true)
    Countries findbyidCount(String d);
    
    @Query(value = "INSERT INTO countries WHERE(country_id, country_name, region_id) Values(?,?,?)", nativeQuery = true)
    Countries save();
    
    
}