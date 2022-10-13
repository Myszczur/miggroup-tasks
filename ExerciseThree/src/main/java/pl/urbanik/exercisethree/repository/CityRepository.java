package pl.urbanik.exercisethree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.exercisethree.models.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
