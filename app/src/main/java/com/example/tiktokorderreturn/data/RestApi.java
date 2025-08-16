package com.example.tiktokorderreturn.data;

import com.example.tiktokorderreturn.model.ResponseCheckOrderReturn;
import com.example.tiktokorderreturn.model.ResponseDetailOrder;
import com.example.tiktokorderreturn.model.ResponseSaveVideoPacking;
import com.example.tiktokorderreturn.model.ResponseOrderReturn;
import com.example.tiktokorderreturn.model.ResponseUploadDokumen;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RestApi {

    @GET("order/checkOrderReturn")
    Call<ResponseCheckOrderReturn> checkOrderReturn(
            @Query("tracking_number") String tracking_number
    );

    @GET("order/orderDetail")
    Call<ResponseDetailOrder> getDetailOrder(
            @Query("ids") String order_id
    );

    @FormUrlEncoded
    @POST("order/setOrderReturn")
    Call<ResponseOrderReturn> updateReturn(
            @Field("orderId") String order_id,
            @Field("itemList") String item_list
    );

    @Multipart
    @POST("order/updateOrderPacking")
    Call<ResponseSaveVideoPacking> saveVideoPacking(
            @Part("tracking_number") RequestBody tracking_number,
            @Part("video_packing") RequestBody video_packing
    );

    @Multipart
    @POST("order/uploadVideoPacking")
    Call<ResponseUploadDokumen> uploadVideoPacking(
            @Part MultipartBody.Part ax_file_input,
            @Part("ax-file-path") RequestBody ax_file_path,
            @Part("ax-allow-ext") RequestBody ax_allow_ext,
            @Part("ax-file-name") RequestBody ax_file_name,
            @Part("ax-max-file-size") RequestBody ax_max_file_size,
            @Part("ax-start-byte") RequestBody ax_start_byte,
            @Part("ax-last-chunk") RequestBody ax_last_chunk
    );



}