package com.hsoft.personapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hsoft.personapi.entities.Person;
import com.hsoft.personapi.dto.request.PersonDTO;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);
    PersonDTO toDTO(Person dto);
}
