package com.fati.departementservice.service.serviceImp;

import com.fati.departementservice.dto.DepartementDto;
import com.fati.departementservice.entity.Departement;
import com.fati.departementservice.mapper.DepartementMapper;
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
        Departement departement =DepartementMapper.mapToDepartemnt(departementDto);
        Departement departementSaved = departementRepository.save(departement);

        DepartementDto savedDepartementDto =DepartementMapper.mapToDepartementDto(departementSaved);

        return savedDepartementDto;
    }

    @Override
    public DepartementDto getDepartementByCode(String departementCode) {
       Departement departement = departementRepository.findByDepartementCode(departementCode);

       DepartementDto departementDto = DepartementMapper.mapToDepartementDto(departement);
       return departementDto;
    }


}
