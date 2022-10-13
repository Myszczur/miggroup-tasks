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

    @Query(value = "Select Country.name from Country Where Country.country_id NOT IN (Select DISTINCT Country.country_id from Country AS P Join City AS M on (P.country_id = M.city_id) join buildings AS B on (M.city_id = B.building_id))", nativeQuery = true)
    List<Country> getAllCountryNamesByNoBuildings();
}
