package pl.urbanik.exercisethree.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.exercisethree.exception.ResourceNotFoundException;
import pl.urbanik.exercisethree.models.Buildings;
import pl.urbanik.exercisethree.repository.BuildingsRepository;
import pl.urbanik.exercisethree.service.BuildingService;

import java.util.List;

@Service
@AllArgsConstructor
public class BuildingServiceImpl implements BuildingService {

    private final BuildingsRepository buildingsRepository;

    @Override
    public List<Buildings> findAllBuildings() {
        return buildingsRepository.findAll();
    }

    @Override
    public Buildings saveBuilding(Buildings buildings) {
        return buildingsRepository.save(buildings);
    }

    @Override
    public Buildings findById(Long id) {
        return buildingsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Buildings not exist with id :" + id));
    }

    @Override
    public Buildings updateBuilding(Buildings buildingsDetails, Long id) {
        Buildings buildings = buildingsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Buildings not exist with id :" + id));

        buildings.setName(buildingsDetails.getName());
        buildings.setFloors(buildings.getFloors());
        return buildingsRepository.save(buildings);
    }

    @Override
    public void deleteBuilding(Long id) {
        buildingsRepository.deleteById(id);
    }
}
