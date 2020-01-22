package com.micahthor.songr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    Album rchpAlbum;

    String expectedStr;
    String actualStr;
    int expectedInt;
    int actualInt;

    @BeforeEach
    public void init() {
        rchpAlbum = new Album("Stadium Arcadium", "Red Hot Chili Peppers", 28, 7347, "https://upload.wikimedia.org/wikipedia/en/e/e6/Stadiumarcadium.jpg");
    }

    @Test
    void setTitle() {
        rchpAlbum.setTitle("bojangles");
        expectedStr = rchpAlbum.getTitle();
        actualStr = "bojangles";
        assertEquals(expectedStr, actualStr);
    }

    @Test
    void setArtist() {
        rchpAlbum.setArtist("bojangles");
        expectedStr = rchpAlbum.getArtist();
        actualStr = "bojangles";
        assertEquals(expectedStr, actualStr);
    }

    @Test
    void setSongCount() {
        rchpAlbum.setSongCount(44);
        actualInt = rchpAlbum.getSongCount();
        expectedInt = 44;
        assertEquals(expectedInt, actualInt);
    }

    @Test
    void setLength() {
        rchpAlbum.setLength(44);
        actualInt = rchpAlbum.getLength();
        expectedInt = 44;
        assertEquals(expectedInt, actualInt);
    }

    @Test
    void setImageURLString() {
        rchpAlbum.setArtist("bojangles");
        expectedStr = rchpAlbum.getArtist();
        actualStr = "bojangles";
        assertEquals(expectedStr, actualStr);
    }

    @Test
    void getTitle() {
        expectedStr = "Stadium Arcadium";
        actualStr = rchpAlbum.getTitle();
        assertEquals(expectedStr, actualStr);
    }

    @Test
    void getArtist() {
        expectedStr = "Red Hot Chili Peppers";
        actualStr = rchpAlbum.getArtist();
        assertEquals(expectedStr, actualStr);
    }

    @Test
    void getSongCount() {
        expectedInt = 28;
        actualInt = rchpAlbum.getSongCount();
        assertEquals(expectedInt, actualInt);
    }

    @Test
    void getLength() {
        expectedInt = 7347;
        actualInt = rchpAlbum.getLength();
        assertEquals(expectedInt, actualInt);
    }

    @Test
    void getImageURLString() {
        expectedStr = "https://upload.wikimedia.org/wikipedia/en/e/e6/Stadiumarcadium.jpg";
        actualStr = rchpAlbum.getImageURLString();
        assertEquals(expectedStr, actualStr);
    }
}