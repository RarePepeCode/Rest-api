package com.Ignas.Adform.logic;

import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportRequest;

public class ReportRequestBuilder {


    private ReportRequest request;

    public ReportRequestBuilder() {
        this.request = new ReportRequest();

    }

    public ReportRequestBuilder addDimension(String dimension) {
        this.request.getDimensions().add(dimension);
        return this;
    }

    public ReportRequestBuilder addMetric(String metric) {
        this.request.getMetrics().add(metric);
        return this;
    }

    public ReportRequestBuilder setFilterDate(String date) {
        this.request.getFilter().setDate(date);
        return this;
    }

    public ReportRequestBuilder setIncludeRowCount(Boolean includeRowCount) {
        this.request.setIncludeRowCount(includeRowCount);
        return this;
    }

    public ReportRequestBuilder setIncludeTotal(Boolean includeTotal) {
        this.request.setIncludeTotals(includeTotal);
        return this;
    }

    public ReportRequestBuilder setSort(String sort) {
        this.request.setSort(sort);
        return this;
    }

    public ReportRequestBuilder setPaging(String paging) {
        this.request.setPaging(paging);
        return this;
    }


    public ReportRequest build() {
        return request;
    }
}
