package pl.urbanik.exercisethree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.urbanik.exercisethree.models.Country;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    @Query(value = "SELECT * FROM country WHERE 400 < ALL (SELECT population FROM city WHERE city_id = country_id)", nativeQuery = true)
    List<Country> getAllCountryByPopulation();

    @Query(value = "SELECT name FROM country WHERE 0 = (SELECT COUNT(1) FROM city JOIN building ON city = ci.CityID WHERE ci.CountryID = co.CountryID)", nativeQuery = true)
    List<Country> getAllCountryNamesByNoBuildings();
}
