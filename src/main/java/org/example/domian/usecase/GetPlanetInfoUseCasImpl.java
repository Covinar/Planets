package org.example.domian.usecase;
import org.example.domian.entity.PlanetEntity;
import org.example.data.datasource.remote.repository.PlanetInfoRepository;

public class GetPlanetInfoUseCasImpl implements GetPlanetInfoUseCase {
    private final PlanetInfoRepository repository;

    public GetPlanetInfoUseCasImpl(PlanetInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public PlanetEntity getInformation(int number) {
        return repository.getInformation(number);
    }
}
