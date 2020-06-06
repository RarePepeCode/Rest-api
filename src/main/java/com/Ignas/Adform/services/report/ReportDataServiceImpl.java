package com.Ignas.Adform.services.report;

import com.Ignas.Adform.logic.ReportRequestFactory;
import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportRequest;
import com.Ignas.Adform.utils.HttpUtils;
import com.Ignas.Adform.utils.JsonUtlils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportDataServiceImpl implements ReportDataService {

    @Autowired
    private HttpUtils httpUtils;


    private static final String GET_REPORT_URL = "https://api.adform.com/v1/reportingstats/publisher/reportdata";

    @Override
    public String[][] getImpressionsReportData() throws IOException, InterruptedException {
        return sendReportDataRequest(ReportRequestFactory.createImpressionsReportRequest()).getRows();
    }

    @Override
    public List<LocalDate> getBidRequestReportData() throws IOException, InterruptedException {
        ReportData data = sendReportDataRequest(ReportRequestFactory.createBidRequestReportRequest());
        return findBidRequstAnomalies(data);
    }

    private ReportData sendReportDataRequest(ReportRequest requestParams) throws IOException, InterruptedException {
        HttpResponse<String> response = httpUtils.sendPostRequest(GET_REPORT_URL, MediaType.APPLICATION_JSON_VALUE, JsonUtlils.serializeJSON(requestParams));
        return  JsonUtlils.deserializeJsonToReportData(response.body()).getReportData();
    }

    private List<LocalDate> findBidRequstAnomalies(ReportData data) {
        List<LocalDate> anomalies = new ArrayList<>();
        Integer lastBid, bid;
        if (data != null && data.getRows().length > 1) {
            lastBid = Integer.parseInt(data.getRows()[0][1]);
            for (int i = 1; i < data.getRows().length; i++) {
                bid = Integer.parseInt(data.getRows()[i][1]);
                if (bid / lastBid >= 3 || lastBid / bid >= 3) {
                    anomalies.add(LocalDate.parse(data.getRows()[i][0], DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                }
                lastBid = bid;
            }
        }
        return anomalies;
    }
}
