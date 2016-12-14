package com.chawki.masonrylayout.api;

import com.chawki.masonrylayout.model.DataResult;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Chawki on 12/14/2016.
 */

public interface Services {

    @GET("/playtime/ws/getDateUpdate")
    Call<DataResult> getData();
}
