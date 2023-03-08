package com.example.song.controller;
import org.springframework.web.bind.annotation.*;
import com.example.song.model.Song;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.example.song.service.SongJpaService;

@RestController
public class SongController {

   @Autowired
   public SongJpaService songService;

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs(){
        return songService.getAllSongs();
    }
    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songService.getSongById(songId);
    }
    @PostMapping("/songs")
     public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    } 
    @PutMapping("/songs/{songId}")
    public Song updateBookSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);

    } 
    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songService.deleteSong(songId);
    }
    


}