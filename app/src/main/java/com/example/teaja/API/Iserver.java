package com.example.teaja.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Iserver {
    @GET("getProductAndroid45")
    Call<List<Product>> getProduct();
}
