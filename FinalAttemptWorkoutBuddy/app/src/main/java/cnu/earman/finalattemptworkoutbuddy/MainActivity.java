package cnu.earman.finalattemptworkoutbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String savedExtra = getIntent().getStringExtra("value1");
        TextView myText = (TextView) findViewById(R.id.savedWorkout);
        myText.setText(savedExtra);
    }

    public void onButtonClick(View view) {
        Intent myIntent = new Intent(getBaseContext(),   LogActivity.class);
        startActivity(myIntent);
    }
}
