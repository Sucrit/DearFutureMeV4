package com.example.dearfutureme.API

import com.example.dearfutureme.Model.Capsules
import com.example.dearfutureme.Model.LoginResponse
import com.example.dearfutureme.Model.LogoutResponse
import com.example.dearfutureme.Model.SignUpResponse
import com.example.dearfutureme.Model.User
import retrofit2.Call
import retrofit2.http.*



interface ApiService {

    @POST("register")
    fun registerUser(@Body request: User): Call<SignUpResponse>

    @POST("login") //
    fun loginUser(@Body user: User): Call<LoginResponse>


    @POST("logout") // Adjust the endpoint according to your API
    fun logout(): Call<LogoutResponse>

    @POST("capsules")
    fun createCapsule(@Body capsule: Capsules): Call<Capsules>

    @GET("capsules")
    fun getCapsuleList(): Call<List<Capsules>>

    @GET("capsules/{id}")
    fun getCapsuleById(@Path("id") id: Int): Call<Capsules>

    @DELETE("capsules/{id}")
    fun deleteCapsule(@Path("id") id: Int): Call<Void>

    @PUT("capsules/{id}")
    fun updateCapsule(@Path("id") id: Int, @Body capsule: Capsules): Call<Capsules>
}
