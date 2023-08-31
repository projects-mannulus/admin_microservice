package com.iot.admin.admin.repository;

import com.iot.admin.admin.entity.GridDashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GridDashboardRepository extends JpaRepository<GridDashboard, Long> {

    List<GridDashboard> findAllByUserId(Long userId);
}
