package com.Ignas.Adform.services.report;

import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportRequest;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface ReportDataService {


    String[][] getImpressionsReportData() throws IOException, InterruptedException;

    List<LocalDate> getBidRequestReportData() throws IOException, InterruptedException;
}
