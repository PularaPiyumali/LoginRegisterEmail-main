package com.example.LoginRegisterEmail.repoistory;

import com.example.LoginRegisterEmail.entities.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy,Long> {
}
