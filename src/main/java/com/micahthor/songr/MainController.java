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
