package com.xenon.music;

public class MusicPlayer {

    private Music music;

    public MusicPlayer(){
        /* Empty constructor */
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing " + music.getSong());
    }
}
