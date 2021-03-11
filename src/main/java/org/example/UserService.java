package org.example;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface UserService {
    @GET("/users")
    Call<Root> listUsers(@Query("page")int page);

    @POST("/")
    Call<Datum> createUser(@Body Datum post);
}
