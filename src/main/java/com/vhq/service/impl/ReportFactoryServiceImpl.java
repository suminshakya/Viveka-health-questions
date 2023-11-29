package com.vhq.service.impl;

import com.vhq.constraints.ReportType;
import com.vhq.service.ReportFactoryService;
import com.vhq.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ReportFactoryServiceImpl implements ReportFactoryService {

    private final List<ReportService> reportServices;

    private final HashMap<ReportType, ReportService> reports = new HashMap<>();

    public ReportFactoryServiceImpl(List<ReportService> reportServices) {
        this.reportServices = reportServices;
        reportServices.forEach(reportService -> reports.put(reportService.getType(), reportService));
    }


    public String getReport(String reportType){
        ReportService reportService = reports.get(ReportType.getType(reportType));
        return reportService.execute();
    }

}
