package com.Ignas.Adform.model;

public class ReportData {

    private String[] columnHeaders;
    private String[][]  rows;
    private Integer[] totals;
    private Integer totalRowCount;
    private String correlationCode;

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

    public String getCorrelationCode() {
        return correlationCode;
    }

    public void setCorrelationCode(String correlationCode) {
        this.correlationCode = correlationCode;
    }
}
