package pl.urbanik.exercisethree.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.exercisethree.models.Buildings;
import pl.urbanik.exercisethree.service.BuildingService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BuildingsController {

    private final BuildingService buildingService;

    @GetMapping("/buildings")
    public List<Buildings> getAllBuildings() {
        return buildingService.findAllBuildings();
    }

    @PostMapping("/buildings")
    public Buildings createBuildings(@RequestBody Buildings buildings) {
        return buildingService.saveBuilding(buildings);
    }

    @GetMapping("/buildings/{id}")
    public ResponseEntity<Buildings> getBuildingsById(@PathVariable Long id) {
        Buildings buildings = buildingService.findById(id);
        return ResponseEntity.ok(buildings);
    }


    @PutMapping("/buildings/{id}")
    public ResponseEntity<Buildings> updateBuildings(@PathVariable Long id, @RequestBody Buildings buildingsDetails) {
        Buildings updatedBuilding = buildingService.updateBuilding(buildingsDetails, id);
        return ResponseEntity.ok(updatedBuilding);
    }

    @DeleteMapping("/buildings/{id}")
    public ResponseEntity<Object> deleteBuilding(@PathVariable Long id) {
        buildingService.deleteBuilding(id);
        return ResponseEntity.noContent().build();
    }
}
