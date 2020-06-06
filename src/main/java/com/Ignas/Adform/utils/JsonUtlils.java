package com.Ignas.Adform.utils;

import com.Ignas.Adform.model.report.ReportData;
import com.Ignas.Adform.model.report.ReportWrapper;
import com.Ignas.Adform.model.token.Token;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonUtlils {

    public static  <T> String serializeJSON(T object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString(object);
    }

    public static Token deserializeJsonToToken(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference <>() {
        });
    }

    public static ReportWrapper deserializeJsonToReportData(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<ReportWrapper>() {
        });
    }

}
