package pl.urbanik.exercisethree.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.exercisethree.models.City;
import pl.urbanik.exercisethree.service.CityService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/city")
    public List<City> getAllCity() {
        return cityService.findAllCity();
    }

    @PostMapping("/city")
    public City createCity(@RequestBody City city) {
        return cityService.saveBuilding(city);
    }

    @GetMapping("/city/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) {
        City city = cityService.findById(id);
        return ResponseEntity.ok(city);
    }


    @PutMapping("/city/{id}")
    public ResponseEntity<City> updateCity(@PathVariable Long id, @RequestBody City cityDetails) {
        City city = cityService.updateCity(cityDetails, id);
        return ResponseEntity.ok(city);
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity<Object> deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
        return ResponseEntity.noContent().build();
    }
}