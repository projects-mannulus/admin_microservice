package com.iot.admin.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class GridDashboardDTO implements Serializable {
    private Long id;
    private Long userId;
    private String data;
}
