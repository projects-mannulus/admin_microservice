package com.iot.admin.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Template de los usuarios para el dashboard de la arquitectura.
 */
@Data
@Entity
@Table(name = "template_chart")
@AllArgsConstructor
@NoArgsConstructor
public class TemplateChart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_ID")
    private String userId;

    /**
     * nombre del template
     */
    @Column
    private String name;

    /**
     * configuracion del template
     */
    @Column
    private String data;
}
