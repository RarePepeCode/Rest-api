package com.Ignas.Adform.model.report;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportData {

    private String[] columnHeaders;
    private String[][]  rows;
    private Integer[] totals;
    private Integer totalRowCount;


    public String[] getColumnHeaders() {
        return columnHeaders;
    }

    public void setColumnHeaders(String[] columnHeaders) {
        this.columnHeaders = columnHeaders;
    }

    public String[][] getRows() {
        return rows;
    }

    public void setRows(String[][] rows) {
        this.rows = rows;
    }

    public Integer[] getTotals() {
        return totals;
    }

    public void setTotals(Integer[] totals) {
        this.totals = totals;
    }

    public Integer getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(Integer totalRowCount) {
        this.totalRowCount = totalRowCount;
    }
}
