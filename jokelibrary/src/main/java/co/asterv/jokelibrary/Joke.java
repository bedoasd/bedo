package co.asterv.jokelibrary;

import java.util.Random;

public class Joke {
    private String[] jokes;

    public Joke() {
        jokes = new String[5];
        jokes[0] = "I have this joke about paper. Nevermind, it's tear-able.";
        jokes[1] = "What's the best thing about Switzerland? I don't know, but their flag is a huge plus.";
        jokes[2] = "Did you hear about the restaurant on the moon? Great food, no atmosphere.";
        jokes[3] = "Why did the eagle fail his test? He figured he could wing it.";
        jokes[4] = "What do you call a father who is a professional dancer? A step father.";
    }

    public String getRandomJoke() {
        return jokes[new Random().nextInt (jokes.length)];
    }
}
