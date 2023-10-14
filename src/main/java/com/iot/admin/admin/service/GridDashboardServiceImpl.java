package com.iot.admin.admin.service;

import com.iot.admin.admin.dto.GridDashboardDTO;
import com.iot.admin.admin.entity.GridDashboard;
import com.iot.admin.admin.repository.GridDashboardRepository;
import com.iot.admin.admin.service.interfaces.IGridDashbaord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GridDashboardServiceImpl implements IGridDashbaord {

    @Autowired
    private GridDashboardRepository gridDashboardRepository;

    @Override
    public List<GridDashboard> findByUserId(String userId) {
        return gridDashboardRepository.findAllByUserId(userId);
    }

    @Override
    public GridDashboard createAndUpdateGrid(GridDashboard gridDashboard) {
        return gridDashboardRepository.save(gridDashboard);
    }
}
