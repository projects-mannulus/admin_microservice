package com.iot.admin.admin.service.interfaces;

import com.iot.admin.admin.entity.TemplateChart;

import java.util.List;

public interface ITemplateService {
    List<TemplateChart> getTemplateByUser(String userId);

    TemplateChart getTemplateById(Long idTemplate);

    TemplateChart createTemplate(TemplateChart templateChart);

    TemplateChart updateTemplate(TemplateChart templateChart);

    boolean deleteTemplate(Long id);
}
