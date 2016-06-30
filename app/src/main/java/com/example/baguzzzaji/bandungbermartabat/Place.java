package com.example.baguzzzaji.bandungbermartabat;

/**
 * Created by baguzzzaji on 6/30/16.
 */
public class Place {

    private String placeName;
    private String placeInfo;

    private int placeImg;

    public Place(String name, String info, int image) {
        placeName = name;
        placeInfo = info;
        placeImg = image;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceInfo() {
        return placeInfo;
    }

    public int getPlaceImg() {
        return placeImg;
    }
}
