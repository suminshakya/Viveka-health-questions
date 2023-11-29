package com.vhq.constraints;

import com.vhq.exception.ReportException;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

public enum ReportType {
    PDF("pdf"),
    EXCEL("excel"),
    WORD("word");

    private String recordType;

    ReportType(String recordType) {
        this.recordType = recordType;
    }

    public static ReportType getType(String type){
     return Arrays.stream(ReportType.values()).filter(val -> val.recordType.equals(type))
                .findFirst()
                .orElseThrow(() -> new ReportException("Not able to find Services....", HttpStatus.BAD_REQUEST));
    }
}
