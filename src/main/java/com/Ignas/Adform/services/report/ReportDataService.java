package com.Ignas.Adform.services.report;

import com.Ignas.Adform.model.ReportData;
import com.Ignas.Adform.model.ReportRequest;

import java.io.IOException;
import java.util.List;

public interface ReportDataService {


    List<ReportData> getReportData(ReportRequest requestParams) throws IOException, InterruptedException;
}
