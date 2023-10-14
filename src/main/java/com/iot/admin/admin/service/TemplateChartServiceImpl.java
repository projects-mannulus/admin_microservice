package com.iot.admin.admin.service;

import com.iot.admin.admin.entity.TemplateChart;
import com.iot.admin.admin.repository.TemplateChartRepository;
import com.iot.admin.admin.service.interfaces.ITemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateChartServiceImpl implements ITemplateService {
    @Autowired
    private TemplateChartRepository templateChartRepository;
    @Override
    public List<TemplateChart> getTemplateByUser(String idUser) {
        return templateChartRepository.findAllByUserId(idUser);
    }

    @Override
    public TemplateChart getTemplateById(Long idTemplate) {
        return templateChartRepository.findById(idTemplate).orElse(null);
    }

    @Override
    public TemplateChart createTemplate(TemplateChart templateChart) {
        return templateChartRepository.save(templateChart);
    }

    @Override
    public TemplateChart updateTemplate(TemplateChart templateChart) {
        return templateChartRepository.save(templateChart);
    }

    @Override
    public boolean deleteTemplate(Long id) {
        return templateChartRepository.findById(id).map(templateChart -> {
            templateChartRepository.delete(templateChart);
            return true;
        }).orElse(false);
    }


}
