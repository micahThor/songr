package com.micahthor.songr;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    // Jerome showed me this method
    List<Song> findByAlbum(Album album);
}
