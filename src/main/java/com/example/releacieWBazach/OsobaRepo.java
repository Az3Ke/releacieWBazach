package com.example.releacieWBazach;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface OsobaRepo extends JpaRepository <Osoba, Integer> {
}
