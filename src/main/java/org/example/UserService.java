package org.example;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface UserService {
    @GET("posts")
    Call<List<User>> listUsers();

    @POST("posts")
    Call<User> savePost(@Body User post);
}
