package org.example.presentation;

import org.example.domian.usecase.GetPlanetInfoUseCase;

public class PlanetScreen {
    private final GetPlanetInfoUseCase useCase;

    public PlanetScreen(GetPlanetInfoUseCase useCase) {
        this.useCase = useCase;
    }
    public void start(){
        System.out.println(useCase.getInformation(4));
    }
}
