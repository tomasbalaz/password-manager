package com.example.passwordmanager

data class SavePasswordRequest(
    val username: String,
    val password: String,
    val url: String
)