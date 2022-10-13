package pl.urbanik.exercisethree.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.exercisethree.models.Country;
import pl.urbanik.exercisethree.service.CountryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/country")
    public List<Country> getAllCountry() {
        return countryService.findAllCountry();
    }

    @PostMapping("/country")
    public Country createCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping("/country/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Long id) {
        Country country = countryService.findById(id);
        return ResponseEntity.ok(country);
    }


    @PutMapping("/country/{id}")
    public ResponseEntity<Country> updateCountry(@PathVariable Long id, @RequestBody Country countryDetails) {
        Country country = countryService.updateCountry(countryDetails, id);
        return ResponseEntity.ok(country);
    }

    @DeleteMapping("/country/{id}")
    public ResponseEntity<Object> deleteCity(@PathVariable Long id) {
        countryService.deleteCountry(id);
        return ResponseEntity.noContent().build();
    }
}
