package org.example.domian.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlanetEntity {
    private final String name;
    @SerializedName("rotation_period")
    private final int rotationPeriod;
    @SerializedName("orbital_period")
    private final int orbitalPeriod;
    private final int diameter;
    private final String climate;
    private final String gravity;
    private final String terrain;
    @SerializedName("surface_water")
    private final int surfaceWater;
    private final String population;
    private final List<String> residents;
    private final List<String> films;

    public PlanetEntity(String name,
                        int rotationPeriod,
                        int orbitalPeriod,
                        int diameter, String climate, String gravity, String terrain,
                        int surfaceWater, String population, List<String> residents, List<String> films) {
        this.name = name;
        this.rotationPeriod = rotationPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surfaceWater = surfaceWater;
        this.population = population;
        this.residents = residents;
        this.films = films;
    }

    @Override
    public String toString() {
        return "PlanetEntity{" +
                "name='" + name + '\'' +
                ", rotationPeriod=" + rotationPeriod +
                ", orbitalPeriod=" + orbitalPeriod +
                ", diameter=" + diameter +
                ", climate='" + climate + '\'' +
                ", gravity='" + gravity + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surfaceWater=" + surfaceWater +
                ", population='" + population + '\'' +
                ", residents=" + residents +
                ", films=" + films +
                '}';
    }
}
