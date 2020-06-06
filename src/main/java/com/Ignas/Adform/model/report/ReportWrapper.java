package com.Ignas.Adform.model.report;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ReportWrapper {

    private ReportData reportData;
    private String correlationCode;

    public ReportData getReportData() {
        return reportData;
    }

    public void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }

    public String getCorrelationCode() {
        return correlationCode;
    }

    public void setCorrelationCode(String correlationCode) {
        this.correlationCode = correlationCode;
    }
}
