package com.example.hello



class RegistrationResponse (
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
)

