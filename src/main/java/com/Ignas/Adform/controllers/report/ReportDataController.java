package com.Ignas.Adform.controllers.report;

import com.Ignas.Adform.model.ReportData;
import com.Ignas.Adform.services.report.ReportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/report-data")
public class ReportDataController {

    @Autowired
    ReportDataService reportDataService;

    @GetMapping()
    public List<ReportData> xd() throws IOException, InterruptedException {
        return reportDataService.getReportData(null);
    }
}
