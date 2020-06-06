package com.Ignas.Adform.model.report;

import com.Ignas.Adform.model.FilterObject;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ReportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String[] dimensions;
    private FilterObject filter;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeRowCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeTotals;
    private String[] metrics;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paging;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;

    public ReportRequest(String[] dimensions, FilterObject filter, Boolean includeRowCount, Boolean includeTotals, String[] metrics, String paging, String sort) {
        this.dimensions = dimensions;
        this.filter = filter;
        this.includeRowCount = includeRowCount;
        this.includeTotals = includeTotals;
        this.metrics = metrics;
        this.paging = paging;
        this.sort = sort;
    }

    public String[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(String[] dimensions) {
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

    public String[] getMetrics() {
        return metrics;
    }

    public void setMetrics(String[] metrics) {
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
