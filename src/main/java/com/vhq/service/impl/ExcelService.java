package com.vhq.service.impl;

import com.vhq.constraints.ReportType;
import com.vhq.constraints.RequiredConstant;
import com.vhq.service.ReportService;
import org.springframework.stereotype.Service;

@Service
public class ExcelService implements ReportService {

    @Override
    public ReportType getType() {
        return ReportType.EXCEL;
    }

    @Override
    public String execute() {
        return RequiredConstant.SuccessfulMessage.EXCEL_REPORT;
    }
}
