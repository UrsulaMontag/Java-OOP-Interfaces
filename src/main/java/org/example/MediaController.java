package org.example;

public class MediaController {

    public void playMedia(Playable media) {
        media.play();
    }

    public void playMedia(Playable[] mediaArray) {
        for (Playable media : mediaArray) media.play();
    }
}
