package pl.urbanik.exercisethree.service;

import org.springframework.stereotype.Service;
import pl.urbanik.exercisethree.models.Buildings;

import java.util.List;

@Service
public interface BuildingService{
    List<Buildings> findAllBuildings();

    Buildings saveBuilding(Buildings buildings);

    Buildings findById(Long id);

    Buildings updateBuilding(Buildings buildingsDetails, Long id);

    void deleteBuilding(Long id);
}
