package pl.urbanik.exercisethree.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.exercisethree.exception.ResourceNotFoundException;
import pl.urbanik.exercisethree.models.Country;
import pl.urbanik.exercisethree.repository.CountryRepository;
import pl.urbanik.exercisethree.service.CountryService;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not exist with id :" + id));
    }

    @Override
    public Country updateCountry(Country countryDetails, Long id) {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not exist with id :" + id));

        country.setName(countryDetails.getName());
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
