package pl.urbanik.exercisethree.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.urbanik.exercisethree.models.Country;
import pl.urbanik.exercisethree.repository.CountryRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskThreeController {

   private final CountryRepository countryRepository;

    @GetMapping("/get-country")
    public List<Country> getAllCountry() {
        return countryRepository.getAllCountryByPopulation();
    }

    @GetMapping("/get-all-name-country")
    public List<Country> getAllCountryWithoutBuildings() {
        return countryRepository.getAllCountryNamesByNoBuildings();
    }
}
