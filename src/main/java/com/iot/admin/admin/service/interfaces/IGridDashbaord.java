package com.iot.admin.admin.service.interfaces;

import com.iot.admin.admin.entity.GridDashboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IGridDashbaord {
    List<GridDashboard> findByUserId(String userId);
    GridDashboard createAndUpdateGrid(GridDashboard gridDashboard);
}
