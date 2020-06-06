package com.Ignas.Adform.logic;

import com.Ignas.Adform.model.report.ReportRequest;
import com.Ignas.Adform.utils.ReportRequestConstants;

public class ReportRequestFactory {

    public static ReportRequest createImpressionsReportRequest() {
        ReportRequestBuilder builder = new ReportRequestBuilder();
        return  builder.addMetric(ReportRequestConstants.METRIC_IMPRESSIONS)
                .addDimension(ReportRequestConstants.DIMENSION_DATE)
                .setFilterDate(ReportRequestConstants.FILTER_LAST_TWO_YEARS)
                .build();
    }

    public static ReportRequest createBidRequestReportRequest() {
        ReportRequestBuilder builder = new ReportRequestBuilder();
        return  builder.addMetric(ReportRequestConstants.METRIC_BID_REQUEST)
                .setFilterDate(ReportRequestConstants.FILTER_LAST_TWO_YEARS)
                .build();
    }

}
