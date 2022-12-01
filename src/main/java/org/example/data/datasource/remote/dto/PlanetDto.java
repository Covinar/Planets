package org.example.data.datasource.remote.dto;

import java.util.List;

public class PlanetDto {

    private  String name;
    private  int rotationPeriod;
    private  int orbitalPeriod;
    private  int diameter;
    private  String climate;
    private  String gravity;
    private  String terrain;
    private  int surfaceWater;
    private  String population;
    private  List<String> residents;
    private  List<String> films;

    public String getName() {
        return name;
    }

    public int getRotationPeriod() {
        return rotationPeriod;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getClimate() {
        return climate;
    }

    public String getGravity() {
        return gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public int getSurfaceWater() {
        return surfaceWater;
    }

    public String getPopulation() {
        return population;
    }

    public List<String> getResidents() {
        return residents;
    }

    public List<String> getFilms() {
        return films;
    }
}
