package org.example;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;


public class App 
{
    public static void main( String[] args ) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/api/users/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserService userService = retrofit.create(UserService.class);

        Call<Root> call = userService.listUsers(2);
        Response<Root> response = call.execute();
        System.out.println("Request GET");
        if (response.isSuccessful()){
            System.out.println("si");
            System.out.println(response.body());
            return;
        }
        System.out.println(response.errorBody());


        Datum user = new Datum();
        user.setFirst_name("jose");
        user.setLast_name("perez");
        Call<Datum> savePostCall = userService.createUser(user);
        Response<Datum> savePostResponse = savePostCall.execute();

        System.out.println("Request POST");
        System.out.println( savePostResponse.body());
    }
}
