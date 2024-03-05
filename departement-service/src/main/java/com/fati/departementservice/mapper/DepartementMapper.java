package com.fati.departementservice.mapper;

import com.fati.departementservice.dto.DepartementDto;
import com.fati.departementservice.entity.Departement;

public class DepartementMapper {
    public static DepartementDto mapToDepartementDto(Departement departement){
         DepartementDto departementDto = new DepartementDto(
                departement.getId(),
                departement.getDepartementName(),
                departement.getDepartementDescription(),
                departement.getDepartementCode()
        );
        return departementDto;
    }
    //convert Departement Dto to Departement Entity
    public static Departement mapToDepartemnt(DepartementDto departementDto){
        Departement departement = new Departement(
                departementDto.getId(),
                departementDto.getDepartementName(),
                departementDto.getDepartementDescription(),
                departementDto.getDepartementCode()
        );
        return departement;
    }
}
