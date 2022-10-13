package pl.urbanik.exercisethree.service;

import org.springframework.stereotype.Service;
import pl.urbanik.exercisethree.models.City;

import java.util.List;

@Service
public interface CityService {
    List<City> findAllCity();

    City saveBuilding(City city);

    City findById(Long id);

    City updateCity(City cityDetails, Long id);

    void deleteCity(Long id);
}
