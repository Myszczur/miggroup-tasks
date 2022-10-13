package pl.urbanik.exercisethree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.exercisethree.models.Buildings;

@Repository
public interface BuildingsRepository extends JpaRepository<Buildings, Long> {
}
