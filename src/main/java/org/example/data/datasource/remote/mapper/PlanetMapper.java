package org.example.data.datasource.remote.mapper;

import org.example.data.datasource.remote.dto.PlanetDto;
import org.example.domian.entity.PlanetEntity;

public class PlanetMapper {
    public PlanetEntity map(PlanetDto dto){
        PlanetEntity entity = new PlanetEntity(dto.getName(),
                dto.getRotationPeriod(),
                dto.getOrbitalPeriod(),
                dto.getDiameter(),
                dto.getClimate(),
                dto.getGravity(),
                dto.getTerrain(),
                dto.getSurfaceWater(),
                dto.getPopulation(),
                dto.getResidents(),
                dto.getFilms()
        );
        return entity;
    }
}
