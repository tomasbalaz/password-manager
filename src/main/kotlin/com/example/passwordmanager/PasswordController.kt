package com.example.passwordmanager

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/passwords")
class PasswordController {

    @GetMapping
    fun getPasswords() : String {
        return "password"
    }
}