package com.iot.admin.admin.controller;

import com.iot.admin.admin.dto.GridDashboardDTO;
import com.iot.admin.admin.dto.TemplateChartDTO;
import com.iot.admin.admin.entity.TemplateChart;
import com.iot.admin.admin.mappers.GridDashbaordMapper;
import com.iot.admin.admin.mappers.TemplateMapper;
import com.iot.admin.admin.service.GridDashboardServiceImpl;
import com.iot.admin.admin.service.TemplateChartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("dashboard")
public class DashboardController {

    @Autowired
    private GridDashboardServiceImpl gridDashboardServiceImpl;

    @Autowired
    private TemplateChartServiceImpl templateChartServiceImpl;

    /**
     * obtiene la grilla de dashboard de un usuario.
     *
     * @return
     */
    @GetMapping("grid")
    public ResponseEntity<?> getGridByUser(@RequestHeader("idUser") String userid) {
        List<GridDashboardDTO> gridDashboard = gridDashboardServiceImpl.findByUserId(userid)
                .stream().map(GridDashbaordMapper.INSTANCE::toGridDashboardDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(gridDashboard, HttpStatus.OK);
    }

    /**
     * Guarda la informacion del panel de control de un usuario.
     * @param gridsterDashbaord
     * @return
     */
    @PutMapping("grid")
    public ResponseEntity<?> createTemplate(@RequestBody GridDashboardDTO gridsterDashbaord) {
        return new ResponseEntity<>(GridDashbaordMapper.INSTANCE.toGridDashboardDTO(
                gridDashboardServiceImpl.createAndUpdateGrid(GridDashbaordMapper.INSTANCE.toGridDashboard(gridsterDashbaord))
        ), HttpStatus.OK);
    }



    /**
     * obtiene todos los templates de un usuario.
     *
     * @param idUser id del usuario
     * @return
     */
    @GetMapping("template/all")
    public ResponseEntity<?> getAllTemplatesByUser(@RequestHeader("idUser") String idUser,
                                                   @RequestParam(value = "search", required = false) String search) {
        return new ResponseEntity<>(
                templateChartServiceImpl.getTemplateByUser(idUser).stream()
                        .map(TemplateMapper.INSTANCE::toTemplateChartDTO), HttpStatus.OK);
    }

    /**
     * obtiene un template por id.
     *
     * @param idTemplate id del template
     * @return
     */
    @GetMapping("template/{idTemplate}")
    public ResponseEntity<?> getTemplateByid(@PathVariable Long idTemplate) {
        TemplateChart template = templateChartServiceImpl.getTemplateById(idTemplate);
        if (template == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(
                    TemplateMapper.INSTANCE.toTemplateChartDTO(template), HttpStatus.OK);
        }
    }

    @PostMapping("template")
    public ResponseEntity<?> createTemplate(@RequestBody TemplateChartDTO templateChart) {
        return new ResponseEntity<>(templateChartServiceImpl.createTemplate(
                TemplateMapper.INSTANCE.toTemplateChart(templateChart)),
                HttpStatus.OK);
    }

    @PutMapping("template")
    public ResponseEntity<?> updateTemplate(@RequestBody TemplateChartDTO templateChart) {
        return new ResponseEntity<>(templateChartServiceImpl.updateTemplate(
                TemplateMapper.INSTANCE.toTemplateChart(templateChart)),
                HttpStatus.OK);
    }

    @DeleteMapping("template/{id}")
    public ResponseEntity<?> deleteTemplate(@PathVariable Long id) {
        return new ResponseEntity<>(templateChartServiceImpl.deleteTemplate(id),
                HttpStatus.OK);
    }
}
