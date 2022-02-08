package com.iit.blockmedic.network

import com.iit.blockmedic.model.Doctor
import com.iit.blockmedic.model.LoginRequest
import com.iit.blockmedic.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


interface APIInterface {

    @POST("api/login")
    fun login(@Header("Authorization") authorization: String, @Body loginRequest: LoginRequest): Call<User>

    @GET("api/doctors")
    fun getDoctors(@Header("Authorization") authorization: String): Call<ArrayList<Doctor>>

    @POST("api/doctor")
    fun addDoctor(@Header("Authorization") authorization: String, @Body doctor: Doctor): Call<Doctor>

}

