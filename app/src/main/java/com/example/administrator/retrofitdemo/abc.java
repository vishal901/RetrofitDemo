package com.example.administrator.retrofitdemo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 5/16/2016.
 */
public class abc {


    /**
     * id : 1
     * vendor_id : 2
     * category_id : 1
     * offer_name : buy 1 soap get 1 free
     * validity_from : 2016-02-20
     * validity_to : 2016-02-22
     * image : http://nearely.com/nearely/assets/uploads/offers/14556898122.jpg
     * terms : this is the test term
     * keywords : soap,sabu
     * status : active
     * created_time : 2016-02-26 18:37:48
     * updated_time : 0000-00-00 00:00:00
     * business_name : Khodiyar cassete
     * owner_name : Bharatbhai patel
     * address : tejendra avenue
     * area_id : 0
     * pincode : 382481
     * latitude : 65.9667
     * longitude : -18.5333
     * city_name : Ahmedabad
     * state_name : Gujarat
     * country_name : India
     * category_name : grocery
     */

    @SerializedName("offers")
    public List<OffersBean> offers;

    public static class OffersBean {
        @SerializedName("id")
        public String id;
        @SerializedName("vendor_id")
        public String vendorId;
        @SerializedName("category_id")
        public String categoryId;
        @SerializedName("offer_name")
        public String offerName;
        @SerializedName("validity_from")
        public String validityFrom;
        @SerializedName("validity_to")
        public String validityTo;
        @SerializedName("image")
        public String image;
        @SerializedName("terms")
        public String terms;
        @SerializedName("keywords")
        public String keywords;
        @SerializedName("status")
        public String status;
        @SerializedName("created_time")
        public String createdTime;
        @SerializedName("updated_time")
        public String updatedTime;
        @SerializedName("business_name")
        public String businessName;
        @SerializedName("owner_name")
        public String ownerName;
        @SerializedName("address")
        public String address;
        @SerializedName("area_id")
        public String areaId;
        @SerializedName("pincode")
        public String pincode;
        @SerializedName("latitude")
        public String latitude;
        @SerializedName("longitude")
        public String longitude;
        @SerializedName("city_name")
        public String cityName;
        @SerializedName("state_name")
        public String stateName;
        @SerializedName("country_name")
        public String countryName;
        @SerializedName("category_name")
        public String categoryName;
    }
}
