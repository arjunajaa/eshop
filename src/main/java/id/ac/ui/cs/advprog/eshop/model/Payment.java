package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;

import java.util.Map;

@Getter
public class Payment {
    String id;
    String method;
    String status;
    Map<String, String> paymentData;

    public Payment(String id, String method, Map<String, String> paymentData) {
    }

    public Payment(String id, String method, Map<String, String> paymentData, String status) {
    }

    public void setStatus(String status) {
    }

    public void setPaymentData(Map<String, String> paymentData) {
    }
}