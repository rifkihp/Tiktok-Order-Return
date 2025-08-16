package com.example.tiktokorderreturn.model;
import com.google.gson.annotations.SerializedName;

public class ResponseCheckOrderReturn {

    @SerializedName("success")
    private boolean success;

    @SerializedName("message")
    private String message;

    @SerializedName("order_id")
    private String orderId;

    public boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getOrderId() {
        return orderId;
    }

}
