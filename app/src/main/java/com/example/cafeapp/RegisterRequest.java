package com.example.cafeapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest{
    final static private String URL = "https://gaeun0215.cafe24.com/UserRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userName, String userPhoneNumber, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters=new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
        parameters.put("UserName",userName);
        parameters.put("UserPhoneNumber",userPhoneNumber);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
