package com.example.farmerconnect.api;

import com.example.farmerconnect.model.Customer;
import com.example.farmerconnect.model.Farmer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("/farmers")
    Call<List<Farmer>> getFarmers();

    @POST("/farmers/add")
    Call<Farmer> addFarmer(@Body Farmer farmer);

    @POST("/customers/add")
    Call<Customer> addCustomer(@Body Customer customer);
}
