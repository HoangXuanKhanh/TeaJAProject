package com.example.teaja.API;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClientServer {

    static String BASE_URL = "https://demo9500803.mockable.io/";
    static Iserver iserver;
    static Retrofit retrofit = null;

    public static Iserver getInstance(){
        if(iserver == null){
            OkHttpClient okHttpClient = new OkHttpClient();
            Retrofit restAdapter = newRetrofitInstance(BASE_URL, okHttpClient);
            iserver = restAdapter.create(Iserver.class);
        }

        return iserver;
    }

    private static Retrofit newRetrofitInstance(String endPoint, OkHttpClient okHttpClient){
        return new Retrofit.Builder().baseUrl(endPoint)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient).build();
    }
}
