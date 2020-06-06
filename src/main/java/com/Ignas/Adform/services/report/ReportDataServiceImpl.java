package com.Ignas.Adform.services.report;

import com.Ignas.Adform.logic.ReportRequestFactory;
import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportRequest;
import com.Ignas.Adform.utils.HttpUtils;
import com.Ignas.Adform.utils.JsonUtlils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class ReportDataServiceImpl implements ReportDataService {

    @Autowired
    private HttpUtils httpUtils;


    private static final String GET_REPORT_URL = "https://api.adform.com/v1/reportingstats/publisher/reportdata";

    @Override
    public ReportData getReportData() throws IOException, InterruptedException {
        ReportRequest requestParams = ReportRequestFactory.createImpressionsReportRequest();
        HttpResponse<String> response = httpUtils.sendPostRequest(GET_REPORT_URL, MediaType.APPLICATION_JSON_VALUE, JsonUtlils.serializeJSON(requestParams));
        return  JsonUtlils.deserializeJsonToReportData(response.body()).getReportData();

    }
}
