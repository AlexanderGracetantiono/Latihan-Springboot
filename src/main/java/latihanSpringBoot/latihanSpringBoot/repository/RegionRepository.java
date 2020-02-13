/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanSpringBoot.latihanSpringBoot.repository;

import java.util.List;
import latihanSpringBoot.latihanSpringBoot.enitity.Countries;
import latihanSpringBoot.latihanSpringBoot.enitity.Regions;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dharta
 */
@Repository
public interface RegionRepository extends CrudRepository<Regions, Integer>{
    @Query(value = "SELECT * FROM Regions", nativeQuery = true)
    Iterable<Countries> findalll(); // Tidak bebas karna manggil ke entity
    
    @Query(value = "SELECT region_id FROM Regions", nativeQuery = true)
    List<Object[]> findallls();  // Buat object lbh bebas
    
    @Query(value = "SELECT * FROM Regions Where region_id = ?1", nativeQuery = true) // 1 urutan dari parameter keberapa dari Integer
    Regions findbyIde(Integer id);  // Buat object lbh bebas
    
    @Query(value = "INSERT INTO regions(region_id, region_name) Values(?,?)", nativeQuery = true)
    Regions save();
    
}
