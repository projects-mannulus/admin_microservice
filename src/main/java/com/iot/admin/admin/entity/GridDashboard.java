package com.iot.admin.admin.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "grid_dashboard")
@AllArgsConstructor
@NoArgsConstructor
public class GridDashboard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * nombre del panel de control.
     */
    @Column(name = "NAME")
    private String name;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "DATA")
    private String data;

}
