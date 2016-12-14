package com.chawki.masonrylayout.api;

import com.chawki.masonrylayout.global.Constant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Chawki on 12/14/2016.
 */

public class ApiAdapter {

    private static Retrofit sharedInstance = null;

    public static HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    public static OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(logging)
            .build();

    public static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public static Retrofit getInstance() {
        if (sharedInstance == null) {

            sharedInstance = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return sharedInstance;
    }

    private static final Services service = getInstance().create(Services.class);

    public static Services getService() {
        return service;
    }
}
