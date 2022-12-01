package org.example;

import org.example.data.datasource.remote.PlanetInfoRemoteDataSource;
import org.example.data.datasource.remote.PlanetInfoRemoteDataSourceImpl;
import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.api.RetrofitClient;
import org.example.data.datasource.remote.mapper.PlanetMapper;
import org.example.data.datasource.remote.repository.PlanetInfoRepository;
import org.example.data.datasource.remote.repository.PlanetInfoRepositoryImpl;
import org.example.domian.usecase.GetPlanetInfoUseCasImpl;
import org.example.domian.usecase.GetPlanetInfoUseCase;
import org.example.presentation.PlanetScreen;

public class Application {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        PlanetInfoRemoteDataSource remoteDataSource = new PlanetInfoRemoteDataSourceImpl(apiService);
        PlanetMapper mapper = new PlanetMapper();
        PlanetInfoRepository repository = new PlanetInfoRepositoryImpl(remoteDataSource,mapper);
        GetPlanetInfoUseCase useCase = new GetPlanetInfoUseCasImpl(repository);
        PlanetScreen screen = new PlanetScreen(useCase);
        screen.start();
    }
}