package com.iot.admin.admin.mappers;

import com.iot.admin.admin.dto.GridDashboardDTO;
import com.iot.admin.admin.entity.GridDashboard;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GridDashbaordMapper {
    GridDashbaordMapper INSTANCE = Mappers.getMapper(GridDashbaordMapper.class);

    GridDashboardDTO toGridDashboardDTO(GridDashboard gridDashboard);

    GridDashboard toGridDashboard(GridDashboardDTO gridDashboardDTO);
}
