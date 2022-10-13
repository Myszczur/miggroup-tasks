package pl.urbanik.exercisethree.service;

import org.springframework.stereotype.Service;
import pl.urbanik.exercisethree.models.Country;

import java.util.List;

@Service
public interface CountryService {
    List<Country> findAllCountry();

    Country saveCountry(Country country);

    Country findById(Long id);

    Country updateCountry(Country countryDetails, Long id);

    void deleteCountry(Long id);
}
