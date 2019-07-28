package com.cer.imgurapp

//get name, id, picture url, and comments if possible

data class ImgurModel(
    val `data`: List<Data>,
    val status: Int,
    val success: Boolean
)

data class Data(
    val account_id: Int,
    val account_url: String,
    val ad_config: AdConfig,
    val ad_type: Int,
    val ad_url: String,
    val animated: Boolean,
    val bandwidth: Int,
    val comment_count: Int,
    val cover: String,
    val cover_height: Int,
    val cover_width: Int,
    val datetime: Int,
    val description: String,
    val downs: Int,
    val edited: Int,
    val favorite: Boolean,
    val favorite_count: Int,
    val gifv: String,
    val has_sound: Boolean,
    val height: Int,
    val hls: String,
    val id: String,
    val images: List<Image>,
    val images_count: Int,
    val in_gallery: Boolean,
    val in_most_viral: Boolean,
    val include_album_ads: Boolean,
    val is_ad: Boolean,
    val is_album: Boolean,
    val layout: String,
    val link: String,
    val looping: Boolean,
    val mp4: String,
    val mp4_size: Int,
    val nsfw: Boolean,
    val points: Int,
    val privacy: String,
    val processing: Processing,
    val score: Int,
    val section: String,
    val size: Int,
    val tags: List<Any>,
    val title: String,
    val topic: String,
    val topic_id: Int,
    val type: String,
    val ups: Int,
    val views: Int,
    val vote: Any,
    val width: Int
)

data class Processing(
    val status: String
)

data class Image(
    val account_id: Any,
    val account_url: Any,
    val ad_type: Int,
    val ad_url: String,
    val animated: Boolean,
    val bandwidth: Int,
    val comment_count: Any,
    val datetime: Int,
    val description: Any,
    val downs: Any,
    val edited: String,
    val favorite: Boolean,
    val favorite_count: Any,
    val has_sound: Boolean,
    val height: Int,
    val id: String,
    val in_gallery: Boolean,
    val in_most_viral: Boolean,
    val is_ad: Boolean,
    val link: String,
    val nsfw: Any,
    val points: Any,
    val score: Any,
    val section: Any,
    val size: Int,
    val tags: List<Any>,
    val title: Any,
    val type: String,
    val ups: Any,
    val views: Int,
    val vote: Any,
    val width: Int
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
