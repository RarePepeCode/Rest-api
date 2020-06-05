package com.Ignas.Adform.utils;

import com.Ignas.Adform.model.ReportData;
import com.Ignas.Adform.model.Token;
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

    public static List<ReportData> deserializeJsonToReportData(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        return mapper.readValue(json, new TypeReference<>() {
        });
    }

}
