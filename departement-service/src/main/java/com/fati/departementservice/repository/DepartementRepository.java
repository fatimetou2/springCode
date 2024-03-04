package com.fati.departementservice.repository;

import com.fati.departementservice.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Long> {

 Departement findByDepartementCode(String departementCode);
}
