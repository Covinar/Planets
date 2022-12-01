package org.example.data.datasource.remote.repository;

import org.example.domian.entity.PlanetEntity;

public interface PlanetInfoRepository {
    PlanetEntity getInformation(int number);
}
