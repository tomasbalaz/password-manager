package com.example.passwordmanager

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/passwords")
class PasswordController {

    private val passwords: MutableList<String> = mutableListOf();

    @GetMapping
    fun getPasswords() : List<String> {
        return passwords
    }
    @PostMapping
    fun savePasswords(@RequestBody password: String)  {
        passwords.add(password)
    }
}