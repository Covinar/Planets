package org.example.data.datasource.remote;

import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.dto.PlanetDto;

import java.io.IOException;

public class PlanetInfoRemoteDataSourceImpl implements PlanetInfoRemoteDataSource {
    private final ApiService apiService;

    public PlanetInfoRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public PlanetDto getInformation(int number) {
        try {
            PlanetDto dto = apiService.getInformation(number).execute().body();
            return dto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
