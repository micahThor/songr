package com.micahthor.songr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AlbumTest {

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
    public void testAlbum_Title() {
        expectedStr = "Stadium Arcadium";
        actualStr = rchpAlbum.getTitle();
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testAlbum_Artist() {
        expectedStr = "Red Hot Chili Peppers";
        actualStr = rchpAlbum.getArtist();
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testAlbum_SongCount() {
        expectedInt = 28;
        actualInt = rchpAlbum.getSongCount();
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testAlbum_SongLength() {
        expectedInt = 7347;
        actualInt = rchpAlbum.getLength();
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testAlbum_ImgURLString() {
        expectedStr = "https://upload.wikimedia.org/wikipedia/en/e/e6/Stadiumarcadium.jpg";
        actualStr = rchpAlbum.getImageURLString();
        assertEquals(expectedStr, actualStr);
    }
}
