package com.example.productsdemo.data.network

import com.example.productsdemo.data.model.ProductRemote
import com.example.productsdemo.data.model.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {

    @GET("products/")
    suspend fun getProducts(): ProductResponse

    @GET("products/{id}")
    suspend fun getProductDetail(
        @Path("id") id: Int
    ): ProductRemote
}