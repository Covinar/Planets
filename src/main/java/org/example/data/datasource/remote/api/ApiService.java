package org.example.data.datasource.remote.api;

import org.example.data.datasource.remote.dto.PlanetDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/planets/{number}/?format=json")
    Call<PlanetDto> getInformation(@Path(value = "number", encoded = true) int number);
}
