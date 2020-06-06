package com.Ignas.Adform.services.report;

import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportRequest;

import java.io.IOException;
import java.util.List;

public interface ReportDataService {


    ReportData getReportData() throws IOException, InterruptedException;
}
