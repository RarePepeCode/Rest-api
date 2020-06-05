package com.Ignas.Adform.model;

public class ReportRequest {

    private  String[] dimensions;
    private  String filter;
    private Boolean includeRowCount;
    private Boolean includeTotals;
    private String[] metrics;
    private String paging;
    private String sort;

    public String[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(String[] dimensions) {
        this.dimensions = dimensions;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
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
