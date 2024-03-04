package com.fati.departementservice.service;

import com.fati.departementservice.dto.DepartementDto;

public interface DepartementService {
    DepartementDto saveDepartement(DepartementDto departementDto);
    DepartementDto getDepartementByCode(String departementCode);

}
