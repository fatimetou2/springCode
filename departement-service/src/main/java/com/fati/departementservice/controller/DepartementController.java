package com.fati.departementservice.controller;

import com.fati.departementservice.dto.DepartementDto;
import com.fati.departementservice.service.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Departement")
public class DepartementController {
    @Autowired
    private DepartementService departementService;
    @PostMapping
    public ResponseEntity<DepartementDto>saveDepartement(@RequestBody DepartementDto departementDto){
       DepartementDto savedDepartement= departementService.saveDepartement(departementDto);
       return new ResponseEntity<>(savedDepartement, HttpStatus.CREATED);
    }
    @GetMapping("{departement-code}")
    public ResponseEntity<DepartementDto> getDepartement(@PathVariable("departement-code") String departementCode){
        DepartementDto departementDto = departementService.getDepartementByCode(departementCode);
        return new ResponseEntity<>(departementDto,HttpStatus.OK);
    }


}
