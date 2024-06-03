package org.example;

public class Main {
    public static void main(String[] args) {

        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();
        Playable[] myMediaPlayers = new Playable[]{musicPlayer, videoPlayer};
        MediaController mediaController = new MediaController();

        System.out.println("Play in single function call: ");
        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);
        System.out.println("Play in combined function call: ");
        mediaController.playMedia(myMediaPlayers);
    }
}