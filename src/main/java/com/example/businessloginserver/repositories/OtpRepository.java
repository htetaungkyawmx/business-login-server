package com.example.businessloginserver.repositories;

import com.example.businessloginserver.entities.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepository extends JpaRepository<Otp,Integer> {
    Optional<Otp> findOtpByUsername(String username);
}
