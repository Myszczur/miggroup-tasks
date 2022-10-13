package pl.urbanik.exercisethree.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Buildings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buildingId;
    private String name;
    private int floors;
    @OneToMany
    private List<City> cityList = new ArrayList<>();
}
