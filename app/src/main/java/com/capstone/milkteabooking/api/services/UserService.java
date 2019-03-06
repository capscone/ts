package com.capstone.milkteabooking.api.services;

import com.capstone.milkteabooking.api.requestObj.LoginRequest;
import com.capstone.milkteabooking.api.requestObj.RegisterRequest;
import com.capstone.milkteabooking.api.responseObj.SuccessResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("api/login")
    Call<SuccessResponse> login(@Body LoginRequest requestObj);

    @POST("api/register")
    Call<SuccessResponse> register(@Body RegisterRequest requestObj);

}