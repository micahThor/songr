package com.micahthor.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @GetMapping("/")
    public String splashPage() {
        return "index";
    }

    @GetMapping("/albums")
    public String albums(Model m) {

        Album[] albumList = new Album[3];
        albumList[0] = new Album("Stadium Arcadium", "Red Hot Chili Peppers", 28, 7347, "https://upload.wikimedia.org/wikipedia/en/e/e6/Stadiumarcadium.jpg");
        albumList[1] = new Album("The Division Bell", "Pink Floyd", 11, 3983, "https://upload.wikimedia.org/wikipedia/en/6/6e/Pink_Floyd_-_Division_Bell.jpg");
        albumList[2] = new Album("El Camino", "The Black Keys", 11, 2289, "https://upload.wikimedia.org/wikipedia/en/9/92/The_Black_Keys_El_Camino_Album_Cover.jpg");

        m.addAttribute(albumList);

        return "albums";
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
