package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> soundList = new ArrayList<>();
        soundList.add(new Radio());
        soundList.add(new Parrot());
        soundList.add(new Firework());
        for (Sound sound : soundList) {
            sound.playSound();
        }

    }
}
