package com.iot.admin.admin.repository;

import com.iot.admin.admin.entity.TemplateChart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TemplateChartRepository extends JpaRepository<TemplateChart, Long> {

    List<TemplateChart> findAllByUserId(Long userId);

}
