package org.example.data.datasource.remote.repository;

import org.example.data.datasource.remote.PlanetInfoRemoteDataSource;
import org.example.data.datasource.remote.dto.PlanetDto;
import org.example.data.datasource.remote.mapper.PlanetMapper;
import org.example.domian.entity.PlanetEntity;

public class PlanetInfoRepositoryImpl implements PlanetInfoRepository{
    private final PlanetInfoRemoteDataSource remoteDataSource;
    private final PlanetMapper mapper;

    public PlanetInfoRepositoryImpl(PlanetInfoRemoteDataSource remoteDataSource, PlanetMapper mapper) {
        this.remoteDataSource = remoteDataSource;
        this.mapper = mapper;
    }

    @Override
    public PlanetEntity getInformation(int number) {
        PlanetDto dto = remoteDataSource.getInformation(number);
        return mapper.map(dto);
    }
}
