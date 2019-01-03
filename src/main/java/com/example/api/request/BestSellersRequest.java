package com.example.api.request;

import com.onarinskyi.annotations.api.Get;
import com.onarinskyi.api.Request;

@Get(api = "nytimes", endpoint = "/lists/best-sellers/history.json")
public class BestSellersRequest extends Request {

    public int number;
    public String string;

    public BestSellersRequest withNumber(int number) {
        this.number = number;
        return this;
    }

    public BestSellersRequest withString(String string) {
        this.string = string;
        return this;
    }

    public BestSellersRequest() {
        this.parameters.put("api-key", "8aded16392704b52b2af33285cba06a2");

//        Overriding default config

//        this.requestSpecification = given()
//                .relaxedHTTPSValidation()
//                .auth().none()
//                .contentType("application/json");
    }
}