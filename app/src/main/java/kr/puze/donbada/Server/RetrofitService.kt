package kr.puze.donbada.Server

import retrofit2.Call
import retrofit2.http.*
/**
 * Created by parktaejun on 2018. 1. 21..
 */
interface RetrofitService {


    @GET("/users/fb")
    fun facebook(@Query("token") token: String): Call<List<Schema.DeviceList>>

    @GET("/users/reg")
    fun register(@Query("token") host_id: String): Call<List<Schema.DeviceList>>

    @GET("/users/card")
    fun card(@Query("id") id: String, @Query("name") name: String, @Query("birth") birth: String, @Query("email") email: String, @Query("phone") phone: String): Call<Schema.DeviceList>

    @POST("/device")
    @FormUrlEncoded
    fun device_register(@Field("host_id") host_id: String, @Field("device_id") device_id: Int, @Field("name") name: String, @Field("description") description: String): Call<Schema.Device>

    @GET("/gesture")
    fun gesture_find(@Query("device_id") device_id: Int): Call<List<Schema.Gesture>>

    @POST("/gesture")
    @FormUrlEncoded
    fun gesture_register(@Field("device_id") device_id: Int, @Field("gesture") gesture: String, @Field("act") act: String): Call<Schema.Gesture>

    @POST("/gesture/act")
    @FormUrlEncoded
    fun gesture_act(@Field("gesture") gesture: Int): Call<Schema.Gesture>

    @GET("/host")
    fun host_find(): Call<List<Schema.Host>>

    @POST("/host")
    @FormUrlEncoded
    fun host_register(@Field("host_id") host_id: String): Call<Schema.Host>

}