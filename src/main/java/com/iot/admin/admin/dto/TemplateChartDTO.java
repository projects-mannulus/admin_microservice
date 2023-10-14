package com.iot.admin.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateChartDTO implements Serializable {
    private Long id;
    private String userId;
    private String name;
    private String data;
}
