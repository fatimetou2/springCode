package com.fati.departementservice.service.serviceImp;

import com.fati.departementservice.dto.DepartementDto;
import com.fati.departementservice.entity.Departement;
import com.fati.departementservice.repository.DepartementRepository;
import com.fati.departementservice.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementServiceImp implements DepartementService {
    @Autowired
    DepartementRepository departementRepository;
    @Override
    public DepartementDto saveDepartement(DepartementDto departementDto) {
        Departement departement = new Departement(
                departementDto.getId(),
                departementDto.getDepartementName(),
                departementDto.getDepartementDescription(),
                departementDto.getDepartementCode()
        );
        Departement departementSaved = departementRepository.save(departement);

        DepartementDto savedDepartementDto = new DepartementDto(
                departementSaved.getId(),
                departementSaved.getDepartementName(),
                departementSaved.getDepartementDescription(),
                departementSaved.getDepartementCode()
        );

        return savedDepartementDto;
    }

    @Override
    public DepartementDto getDepartementByCode(String departementCode) {
       Departement departement = departementRepository.findByDepartementCode(departementCode);

       DepartementDto departementDto = new DepartementDto(
               departement.getId(),
               departement.getDepartementName(),
               departement.getDepartementDescription(),
               departement.getDepartementCode()
       );
       return departementDto;
    }

//    @Override
//    public DepartementDto getDepartementByCode(String departementCode) {
//        Departement departement = departementRepository.findByDepartementByCode(departementCode);
//        DepartementDto departementDto = new DepartementDto(
//                departement.getId(),
//                departement.getDepartementName(),
//                departement.getDepartementDescription(),
//                departement.getDepartementCode()
//        );
//        return departementDto;
//    }
}
