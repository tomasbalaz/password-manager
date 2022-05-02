package com.example.passwordmanager

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/passwords")
class PasswordController(

    private var passwordService: PasswordService
) {

    @GetMapping
    fun getPasswords() = passwordService.getPasswords()

    @PostMapping
    fun savePassword(@RequestBody savePasswordRequest: SavePasswordRequest) =
        passwordService.savePassword(savePasswordRequest)
}