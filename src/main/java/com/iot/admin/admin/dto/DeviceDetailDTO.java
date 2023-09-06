package com.iot.admin.admin.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeviceDetailDTO implements Serializable {

    private long id;
    private long global_id;
    private String name;
    private String description;
    @JsonProperty("is_gateway")
    private boolean is_gateway;
    private Date created_at;
    private Date update_at;
    private long device_parent;

    /**
     * This field is used to show the device name and id in the same field.
     */
    @JsonProperty
    private String name_deviceId;
}
