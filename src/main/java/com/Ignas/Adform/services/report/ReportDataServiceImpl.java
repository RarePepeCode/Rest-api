package com.Ignas.Adform.services.report;

import com.Ignas.Adform.model.ReportData;
import com.Ignas.Adform.model.ReportRequest;
import com.Ignas.Adform.utils.HttpUtils;
import com.Ignas.Adform.utils.JsonUtlils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class ReportDataServiceImpl implements ReportDataService {


    private static final String GET_REPORT_URL = "https://api.adform.com/v1/reportingstats/publisher/reportdata";

    @Override
    public List<ReportData> getReportData(ReportRequest requestParams) throws IOException, InterruptedException {
        HttpResponse<String> response = HttpUtils.sendPostRequest(GET_REPORT_URL, MediaType.APPLICATION_JSON_VALUE, JsonUtlils.serializeJSON(requestParams));
        return  JsonUtlils.deserializeJsonToReportData(response.body());

    }
}
