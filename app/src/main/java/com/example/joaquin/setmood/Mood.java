package com.example.joaquin.setmood;

public class Mood {

    private String mood;
    private String song;
    private String image;
    private String trackLength;
    private String rating;

    public Mood(String mood, String song, String image, String trackLength, String rating) {

        this.mood = mood;
        this.song = song;
        this.image = image;
        this.trackLength = trackLength;
        this.rating = rating;

    }

    public String getMood() {
        return mood;
    }

    public String getSong() {
        return song;
    }

    public String getImage() {
        return image;
    }

    public String getTrackLength() {
        return trackLength;
    }

    public String getRating() {
        return rating;
    }

}
