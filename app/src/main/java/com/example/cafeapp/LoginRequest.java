package com.example.cafeapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public  class LoginRequest extends StringRequest{


        final static private String URL = "https://gaeun0215.cafe24.com/UserLogin.php";
        private Map<String, String> parameters;

        public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
            super(Method.POST, URL, listener, null);
            parameters=new HashMap<>();
            parameters.put("userID",userID);
            parameters.put("userPassword",userPassword);
        }

    public LoginRequest(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }


    @Override
        public Map<String, String> getParams(){
            return parameters;
        }






}
