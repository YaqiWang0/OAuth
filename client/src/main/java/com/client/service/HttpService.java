package com.client.service;

import com.client.domain.Patient;
import com.oracle.javafx.jmx.json.JSONException;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public interface HttpService {
    JSONObject getToken(String authCode) throws IOException, JSONException;
    List<Patient> getResource(String token) throws IOException;
    List<Patient> responseParser(CloseableHttpResponse response) throws IOException,JSONException;
    String getPublicInfo() throws IOException;

}
