package co.asterv.jokeandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public final static String JOKE_INTENT = "JOKE_INTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke = getIntent().getStringExtra (JOKE_INTENT);

        if (joke == null) {
            joke = "Oh no! Joke was null.";
        }

        TextView jokeTV = findViewById (R.id.jokeTextView);
        jokeTV.setText(joke);
    }
}
