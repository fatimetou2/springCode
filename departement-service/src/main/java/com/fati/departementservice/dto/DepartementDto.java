package com.fati.departementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartementDto {
    private Long id;
    private String departementName;
    private String departementDescription;
    private String departementCode;
}
