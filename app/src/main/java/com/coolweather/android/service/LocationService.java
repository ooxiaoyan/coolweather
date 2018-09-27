package com.coolweather.android.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LocationService {

    @GET("china/")
    Call<ResponseBody> getProvinceList();

    @GET("china/{provinceCode}")
    Call<ResponseBody> getCityList(@Path("provinceCode") int provinceCode);

    @GET("china/{provinceCode}/{cityCode}")
    Call<ResponseBody> getCountyList(@Path("provinceCode") int provinceCode, @Path("cityCode") int cityCode);
}
