package pl.urbanik.exercisethree.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.exercisethree.exception.ResourceNotFoundException;
import pl.urbanik.exercisethree.models.City;
import pl.urbanik.exercisethree.repository.CityRepository;
import pl.urbanik.exercisethree.service.CityService;

import java.util.List;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public List<City> findAllCity() {
        return cityRepository.findAll();
    }

    @Override
    public City saveBuilding(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City not exist with id :" + id));
    }

    @Override
    public City updateCity(City cityDetails, Long id) {
        City city = cityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City not exist with id :" + id));

        city.setName(cityDetails.getName());
        city.setPopulation(cityDetails.getPopulation());
        city.setCountryList(cityDetails.getCountryList());
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}
