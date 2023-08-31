package com.iot.admin.admin.service.interfaces;

import com.iot.admin.admin.entity.GridDashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGridDashbaord {
    public GridDashboard findByUserId(Long userId);
    public GridDashboard createAndUpdateGrid(GridDashboard gridDashboard);
}
