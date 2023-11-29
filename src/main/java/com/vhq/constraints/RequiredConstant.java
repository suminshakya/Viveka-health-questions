package com.vhq.constraints;

public interface RequiredConstant {

    interface URLConstant {
        String API_VERSION = "/api/v1";
    }

    interface FeatureAPIConstant {
        String REPORT_API = "/report";
    }

    interface SuccessfulMessage{
        String EXCEL_REPORT = "This is excel report";
        String PDF_REPORT = "This is pdf report";
        String WORD_REPORT = "This is word report";
    }

}
