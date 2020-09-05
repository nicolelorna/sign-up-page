package com.example.hello.api

import com.example.hello.models.CoursesResponse
import com.example.hello.models.LoginResponse
import com.example.hello.models.RegCourse
import com.example.hello.models.RegistrationResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST("register")
    fun registerStudent(@Body requestBody: RequestBody): Call<RegistrationResponse>


    @POST("login")
    fun loginStudent(@Body requestBody: RequestBody): Call<LoginResponse>

    @POST("login")
    fun regCourse(
        @Body requestBody: RequestBody,
        @Header("Authorization") accessToken: String
    ): Call<RegCourse>

    @GET("courses")
    fun getCourses(@Header("Authorization") accessToken: String): Call<CoursesResponse>
}