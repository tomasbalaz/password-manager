package com.example.passwordmanager

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PasswordRepository: JpaRepository<PasswordModel, Long> {
}