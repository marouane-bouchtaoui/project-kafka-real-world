package com.bouchtaouimarouane.repository;

import com.bouchtaouimarouane.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {
}
