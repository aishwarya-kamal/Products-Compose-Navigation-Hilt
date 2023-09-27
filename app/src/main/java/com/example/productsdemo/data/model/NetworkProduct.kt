package com.example.productsdemo.data.model

data class ProductResponse(
    @SerializedName("products") val products: List<ProductRemote>,
)

data class ProductRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("price") val price: Long,
    @SerializedName("discountPercentage") val discountPercentage: Float,
    @SerializedName("rating") val rating: Float,
    @SerializedName("stock") val stock: Long,
    @SerializedName("brand") val brand: String,
    @SerializedName("category") val category: String,
    @SerializedName("thumbnail") val thumbnail: String,
    @SerializedName("images") val images: List<String>,
)

fun ProductRemote.toProduct(): Product = Product(
    id = id,
    title = title,
    price = price,
    brand = brand,
    thumbnail = thumbnail,
)

fun ProductRemote.toProductDetail(): ProductDetail = ProductDetail(
    id = id,
    title = title,
    description = description,
    price = price,
    discountPercentage = discountPercentage,
    rating = rating,
    brand = brand,
    thumbnail = thumbnail,
)
