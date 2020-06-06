package com.Ignas.Adform.controllers.report;

import com.Ignas.Adform.model.FilterObject;
import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportRequest;
import com.Ignas.Adform.services.report.ReportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/report-data")
public class ReportDataController {

    @Autowired
    ReportDataService reportDataService;

    @GetMapping("/impressions")
    public String[][] getImpressions() throws IOException, InterruptedException {
        return reportDataService.getImpressionsReportData();
    }

    @GetMapping("/bid-request")
    public List<LocalDate> getBidRequest() throws IOException, InterruptedException {
        return reportDataService.getBidRequestReportData();
    }
}
