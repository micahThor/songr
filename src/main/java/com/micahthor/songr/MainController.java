package com.micahthor.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @PostMapping("/albums")
    public RedirectView postAlbums(String title, String artist, int songCount, int length, String imageURLString) {
        Album newAlbum = new Album(title, artist, songCount, length, imageURLString);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String albums(Model m) {

        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albumList", albums);

        return "albums";
    }

    @GetMapping("/albums/{id}")
    public String displaySongsInAlbumByID(@PathVariable Long id, Model m) {

        // Get album that user clicked on and add to model
        Album album = albumRepository.getOne(id);
        m.addAttribute("album", album);

        // get song list
        List<Song> songs = songRepository.findByAlbum(album);
        m.addAttribute("songList", songs);

        return "songs";
    }

    @PostMapping("/albums/{id}")
    public RedirectView postSongToAlbum(@PathVariable Long id, String title, int length, int trackNumber) {

        Album albumToAddSongs = albumRepository.getOne(id);
        Song newSong = new Song(title, length, trackNumber);

        newSong.setAlbum(albumToAddSongs);

        songRepository.save(newSong);
        return new RedirectView("/albums/{id}");
    }

    @GetMapping("/allsongs")
    public String allSongs(Model m) {

        List<Song> songList = songRepository.findAll();
        m.addAttribute("songList", songList);

        return "allsongs";
    }

    /*
            OTHER ROUTES UNRELATED TO SONGR
     */
    @GetMapping("/")
    public String splashPage() {
        return "index";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping("/capitalize/{wordToUpperCase}")
    public String capitalize(@PathVariable String wordToUpperCase, Model m) {
        m.addAttribute("wordToUpperCase", wordToUpperCase.toUpperCase());
        return "capitalized";
    }
}
