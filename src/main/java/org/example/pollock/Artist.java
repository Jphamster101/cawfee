package org.example.pollock;

public class Artist {
    private final String artistName;
    private final int age;
    private final String placeOfOrigin;

    public Artist(String artistName, int age, String placeOfOrigin) {
        this.artistName = artistName;
        this.age = age;
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public String getPlaceOfOrigin() {
        return this.placeOfOrigin;
    }
}
