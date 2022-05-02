package com.example.passwordmanager

import org.springframework.stereotype.Service

@Service
class PasswordService(var passwordRepository: PasswordRepository) {

    fun getPasswords(): List<PasswordModel> {
        return  passwordRepository.findAll()
    }

    fun savePassword(savePasswordRequest: SavePasswordRequest) : PasswordModel {
        val (username, password, url) =  savePasswordRequest
        return passwordRepository.save(PasswordModel(null, username, password, url))
    }
}