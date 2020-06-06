package com.Ignas.Adform.model.report;

import com.Ignas.Adform.model.FilterObject;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportRequest {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> dimensions;
    private FilterObject filter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeRowCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeTotals;
    private List<String> metrics;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paging;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;



    public ReportRequest() {
        this.dimensions = new ArrayList<>();
        this.metrics = new ArrayList<>();
        this.filter = new FilterObject();
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public FilterObject getFilter() {
        return filter;
    }

    public void setFilter(FilterObject filter) {
        this.filter = filter;
    }

    public Boolean getIncludeRowCount() {
        return includeRowCount;
    }

    public void setIncludeRowCount(Boolean includeRowCount) {
        this.includeRowCount = includeRowCount;
    }

    public Boolean getIncludeTotals() {
        return includeTotals;
    }

    public void setIncludeTotals(Boolean includeTotals) {
        this.includeTotals = includeTotals;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public String getPaging() {
        return paging;
    }

    public void setPaging(String paging) {
        this.paging = paging;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
