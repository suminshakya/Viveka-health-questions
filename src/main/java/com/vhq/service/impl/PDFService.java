package com.vhq.service.impl;

import com.vhq.constraints.ReportType;
import com.vhq.constraints.RequiredConstant;
import com.vhq.service.ReportService;
import org.springframework.stereotype.Service;

@Service
public class PDFService implements ReportService {

    @Override
    public ReportType getType() {
        return ReportType.PDF;
    }

    @Override
    public String execute() {
        return RequiredConstant.SuccessfulMessage.PDF_REPORT;
    }
}
