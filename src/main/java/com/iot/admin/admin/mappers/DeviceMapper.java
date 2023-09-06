package com.iot.admin.admin.mappers;

import com.iot.admin.admin.dto.DeviceDetailDTO;
import com.iot.admin.admin.entity.Device;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DeviceMapper {
    DeviceMapper INSTANCE = Mappers.getMapper(DeviceMapper.class);

    @Mapping(target = "name_deviceId", expression = "java(device.getName() + \" - \" + device.getId())")
    DeviceDetailDTO toDeviceDetailDTO(Device device);
}
