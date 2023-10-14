package com.iot.admin.admin.mappers;

import com.iot.admin.admin.dto.TemplateChartDTO;
import com.iot.admin.admin.entity.TemplateChart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TemplateMapper {
    TemplateMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(TemplateMapper.class);
    TemplateChart toTemplateChart(TemplateChartDTO templateChartDTO);

    TemplateChartDTO toTemplateChartDTO(TemplateChart templateChart);

}
