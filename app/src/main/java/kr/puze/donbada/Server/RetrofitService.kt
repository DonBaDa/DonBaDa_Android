package kr.puze.donbada.Server

import retrofit2.Call
import retrofit2.http.*
/**
 * Created by parktaejun on 2018. 1. 21..
 */
interface RetrofitService {


    @GET("/users/fb")
    fun user_facebook(@Query("token") token: String): Call<Schema.User>

    @GET("/users/reg")
    fun user_register(@Query("token") host_id: String): Call<Schema.User>

    @GET("/users/card")
    fun user_card(@Query("id") id: String, @Query("card_number")card_number: String, @Query("expiry")expiry: String, @Query("birth") email: String, @Query("pw") phone: String): Call<Schema.User>

    @POST("/room")
    @FormUrlEncoded
    fun room(@Field("creditor") host_id: String, @Field("debtor") device_id: Int, @Field("title") name: String, @Field("D_day") D_day: String, @Field("amount") amount: String): Call<Schema.Room>

    @POST("/pay")
    @FormUrlEncoded
    fun pay(@Field("id") id: String): Call<Schema.Room>

    @POST("/facebook")
    @FormUrlEncoded
    fun facebook(@Field("id") id: Int, @Field("message") message: String, @Field("act") act: String): Call<Schema.User>

    @POST("/gps")
    @FormUrlEncoded
    fun gps(@Field("id") id: Int, @Field("message") message: String, @Field("act") act: String): Call<Schema.User>

    @POST("/lock")
    @FormUrlEncoded
    fun facebook(@Field("id") id: Int): Call<Schema.User>

    @POST("/sound")
    @FormUrlEncoded
    fun sound(@Field("id") id: Int): Call<Schema.User>

    @POST("/flash")
    @FormUrlEncoded
    fun flash(@Field("id") id: Int): Call<Schema.User>

}