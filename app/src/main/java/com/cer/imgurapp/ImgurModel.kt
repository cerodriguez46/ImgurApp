package com.cer.imgurapp

import android.os.Parcel
import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

//get name, id, picture url, and comments if possible
@Parcelize
data class ImgurModel(
    @Json(name = "data")
    val data: @RawValue List<Data>,
    @Json(name = "status")
    val status: Int,
    @Json(name = "success")
    val success: Boolean
) : Parcelable

@Parcelize
data class Data(
    @Json(name = "id")
    val id: String?,
    @Json(name = "title")
    val title: String?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "datetime")
    val datetime: Int?,
    @Json(name = "cover")
    val cover: String?,
    @Json(name = "cover_width")
    val coverWidth: Int?,
    @Json(name = "cover_height")
    val coverHeight: Int?,
    @Json(name = "account_url")
    val accountUrl: String?,
    @Json(name = "account_id")
    val accountId: Int?,
    @Json(name = "privacy")
    val privacy: String?,
    @Json(name = "layout")
    val layout: String?,
    @Json(name = "views")
    val views: Int?,
    @Json(name = "link")
    val link: String?,
    @Json(name = "ups")
    val ups: Int?,
    @Json(name = "downs")
    val downs: Int?,
    @Json(name = "points")
    val points: Int?,
    @Json(name = "score")
    val score: Int?,
    @Json(name = "is_album")
    val isAlbum: Boolean?,
    @Json(name = "vote")
    val vote: String?,
    @Json(name = "favorite")
    val favorite: Boolean?,
    @Json(name = "nsfw")
    val nsfw: Boolean?,
    @Json(name = "comment_count")
    val commentCount: Int?,
    @Json(name = "topic")
    val topic: String?,
    @Json(name = "topic_id")
    val topicId: Int?,
    @Json(name = "images_count")
    val imagesCount: Int,
    @Json(name = "images")
    val images: @RawValue List<Image>?,
    @Json(name = "in_most_viral")
    val inMostViral: Boolean?
) : Parcelable

/*data class Data(
    @Json(name = "description")
    val description: String?,
    @Json(name = "id")
    val id: String?,
    val images: List<Image>?,
    val images_count: Int?
)*/
@Parcelize
data class Image(
    @Json(name = "id")
    val id: String?,
    @Json(name = "title")
    val title: String?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "datetime")
    val datetime: Int,
    @Json(name = "type")
    val type: String?,
    @Json(name = "animated")
    val animated: Boolean?,
    @Json(name = "width")
    val width: Int?,
    @Json(name = "height")
    val height: Int?,
    @Json(name = "size")
    val size: Int?,
    @Json(name = "views")
    val views: Int?,
    @Json(name = "deletehash")
    val deleteHash: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "section")
    val section: String?,
    @Json(name = "link")
    val link: String?,
    @Json(name = "gifv")
    val gifv: String?,
    @Json(name = "mp4")
    val mp4: String?,
    @Json(name = "mp4_size")
    val mp4Size: Int?,
    @Json(name = "looping")
    val looping: Boolean?,
    @Json(name = "favorite")
    val favorite: Boolean?,
    @Json(name = "nsfw")
    val nsfw: Boolean?,
    @Json(name = "vote")
    val vote: String,
    @Json(name = "in_gallery")
    val inGallery: Boolean
) : Parcelable

