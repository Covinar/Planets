package org.example.data.datasource.remote;

import org.example.data.datasource.remote.dto.PlanetDto;

public interface PlanetInfoRemoteDataSource {
    PlanetDto getInformation(int number);
}
