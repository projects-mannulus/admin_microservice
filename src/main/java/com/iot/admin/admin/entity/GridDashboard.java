package com.iot.admin.admin.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class GridDashboard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    private String data;

}
