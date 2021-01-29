package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.dto.SomeDto;
import com.example.mapstructdemo.model.SomeModel;
import org.mapstruct.Mapper;

@Mapper
public interface SomeMapper {
    SomeDto map(SomeModel someModel);
    SomeModel map(SomeDto someDto);
}
