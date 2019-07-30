package com.cer.imgurapp

import com.squareup.moshi.Json

//get name, id, picture url, and comments if possible

data class ImgurModel(
    @Json(name = "data")
    val data: List<Data>,
    @Json(name = "status")
    val status: Int,
    @Json(name = "success")
    val success: Boolean
)

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
    val images: List<Image>?,
    @Json(name = "in_most_viral")
    val inMostViral: Boolean?
)

/*data class Data(
    @Json(name = "description")
    val description: String?,
    @Json(name = "id")
    val id: String?,
    val images: List<Image>?,
    val images_count: Int?
)*/

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
    @Json(name = "bandwidth")
    val bandwidth: Int?,
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
)


/*
public class Data {

    @Json(name = "id")
    private String id;
    @Json(name = "title")
    private String title;
    @Json(name = "description")
    private Object description;
    @Json(name = "datetime")
    private Integer datetime;
    @Json(name = "cover")
    private String cover;
    @Json(name = "account_url")
    private String accountUrl;
    @Json(name = "account_id")
    private Integer accountId;
    @Json(name = "privacy")
    private String privacy;
    @Json(name = "layout")
    private String layout;
    @Json(name = "views")
    private Integer views;
    @Json(name = "link")
    private String link;
    @Json(name = "ups")
    private Integer ups;
    @Json(name = "downs")
    private Integer downs;
    @Json(name = "points")
    private Integer points;
    @Json(name = "score")
    private Integer score;
    @Json(name = "is_album")
    private Boolean isAlbum;
    @Json(name = "vote")
    private Object vote;
    @Json(name = "comment_count")
    private Integer commentCount;
    @Json(name = "images_count")
    private Integer imagesCount;
    @Json(name = "images")
    private List<Image> images = null;


    public class Example {

        @Json(name = "data")
        private Data data;
        @Json(name = "success")
        private Boolean success;
        @Json(name = "status")
        private Integer status;


        public class Image {

            @Json(name = "id")
            private String id;
            @Json(name = "title")
            private Object title;
            @Json(name = "description")
            private Object description;
            @Json(name = "datetime")
            private Integer datetime;
            @Json(name = "type")
            private String type;
            @Json(name = "animated")
            private Boolean animated;
            @Json(name = "width")
            private Integer width;
            @Json(name = "height")
            private Integer height;
            @Json(name = "size")
            private Integer size;
            @Json(name = "views")
            private Integer views;
            @Json(name = "bandwidth")
            private Integer bandwidth;
            @Json(name = "link")
            private String link;*/
