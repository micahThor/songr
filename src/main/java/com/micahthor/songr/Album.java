package com.micahthor.songr;


public class Album {

    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageURLString;

    public Album(String title, String artist, int songCount, int length, String imageURLString) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURLString = imageURLString;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageURLString() {
        return imageURLString;
    }
}
