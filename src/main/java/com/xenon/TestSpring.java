package com.xenon;

import com.xenon.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /*Dependency Injection
            Music music = context.getBean("musicBean", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);
            musicPlayer.playMusic();
        */

        MusicPlayer music = context.getBean("musicPlayer", MusicPlayer.class);
        music.playMusic();



        context.close();
    }

}
