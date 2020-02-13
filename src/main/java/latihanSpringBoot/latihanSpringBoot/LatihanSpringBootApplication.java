package latihanSpringBoot.latihanSpringBoot;

import latihanSpringBoot.latihanSpringBoot.enitity.Countries;
import latihanSpringBoot.latihanSpringBoot.enitity.Regions;
import latihanSpringBoot.latihanSpringBoot.repository.RegionRepository;
import latihanSpringBoot.latihanSpringBoot.service.CountryService;
import latihanSpringBoot.latihanSpringBoot.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LatihanSpringBootApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;
    @Autowired
    private RegionService regionService;

    public static void main(String[] args) {
        SpringApplication.run(LatihanSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//            for (Countries countries : countryService.findAll()) {
//                System.out.println("Country Name " + countries.getCountryName());
//                System.out.println("Country ID " + countries.getCountryId());
//                System.out.println("Region ID " + countries.getRegionId().getRegionId());
//            }
//            for (Regions regions : regionService.findAll()) {
//                System.out.println("Region Name "+ regions.getRegionName());
//            }
//              System.out.println("Region Name " + regionService.findbyIde().getRegionName());
//              System.out.println("Region Name " + regionService.findbyIde(4).getRegionName());

//            System.out.println("Regions" + regionService.save(new Regions(2, "Asia")));
//            regionService.delete(1);

//            for (Countries countries : countryService.findAll()) { // Find all Country
//                System.out.println("Country Name " + countries.getCountryName());
//                System.out.println("Country ID " + countries.getCountryId());
//                System.out.println("Region ID " + countries.getRegionId().getRegionId());
//            }
//            System.out.println("Country Name " + countryService.findallid("Australia")); //Get By Name
//            System.out.println("Country Name By ID " + countryService.findbyidCount("AU").getCountryName()); // Get By ID
            System.out.println("Country " + countryService.save(new Countries("AU","Indonesia", new Regions(4)))); // Update & INSERT
//            countryService.delete("AU"); // Delete By String ID


        
    }
}
