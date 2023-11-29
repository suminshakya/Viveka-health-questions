package com.vhq.controller;

import com.vhq.constraints.RequiredConstant;
import com.vhq.service.impl.ReportFactoryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

import static com.vhq.constraints.RequiredConstant.*;

@RestController
@RequestMapping(RequiredConstant.URLConstant.API_VERSION + FeatureAPIConstant.REPORT_API)
@AllArgsConstructor
public class ReportController {

    private final ReportFactoryServiceImpl reportFactoryService;

    @GetMapping
    public ResponseEntity<String> getReport(@RequestParam String reportType) {
        return ResponseEntity.ok(reportFactoryService.getReport(reportType.toLowerCase(Locale.ROOT).trim()));
    }
}
