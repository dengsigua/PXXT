package com.place.pojo;

import java.util.Date;

public class Place {
    private Long placeId;

    private String placeName;

    private String placeAddress;

    private String placeCompany;

    private Date placeStarttime;

    private Date placeEndtime;

    private String placeSize;

    private String placeState;

    private String placeContent;

    private String placeTel;

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress == null ? null : placeAddress.trim();
    }

    public String getPlaceCompany() {
        return placeCompany;
    }

    public void setPlaceCompany(String placeCompany) {
        this.placeCompany = placeCompany == null ? null : placeCompany.trim();
    }

    public Date getPlaceStarttime() {
        return placeStarttime;
    }

    public void setPlaceStarttime(Date placeStarttime) {
        this.placeStarttime = placeStarttime;
    }

    public Date getPlaceEndtime() {
        return placeEndtime;
    }

    public void setPlaceEndtime(Date placeEndtime) {
        this.placeEndtime = placeEndtime;
    }

    public String getPlaceSize() {
        return placeSize;
    }

    public void setPlaceSize(String placeSize) {
        this.placeSize = placeSize == null ? null : placeSize.trim();
    }

    public String getPlaceState() {
        return placeState;
    }

    public void setPlaceState(String placeState) {
        this.placeState = placeState == null ? null : placeState.trim();
    }

    public String getPlaceContent() {
        return placeContent;
    }

    public void setPlaceContent(String placeContent) {
        this.placeContent = placeContent == null ? null : placeContent.trim();
    }

    public String getPlaceTel() {
        return placeTel;
    }

    public void setPlaceTel(String placeTel) {
        this.placeTel = placeTel == null ? null : placeTel.trim();
    }
}