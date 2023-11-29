package com.vhq.service;

import com.vhq.constraints.ReportType;

public interface ReportService {

    ReportType getType();
    String execute();
}
