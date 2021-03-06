package com.example.admin123.smsams.request;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class GetAreaListRequest extends StringRequest {

    private static final String GET_AREA_LIST_URL = "http://smsams.bsitcapstone.com/smsams-android-script/get_area_list.php";
    //private static final String GET_AREA_LIST_URL = "http://smsams.bsitcapstone.com/smsams-android-script/get_area_list.php";
    private Map<String, String> params;

    public GetAreaListRequest(String user_id, String view_public, Response.Listener<String>listener) {
        super(Method.POST, GET_AREA_LIST_URL, listener, null);

        params = new HashMap<>();
        params.put("user_id", user_id);
        params.put("view_public", view_public);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
