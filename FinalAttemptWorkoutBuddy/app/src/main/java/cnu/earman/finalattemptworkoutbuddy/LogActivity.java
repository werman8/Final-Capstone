package cnu.earman.finalattemptworkoutbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogActivity extends AppCompatActivity {

    String workoutTypeString, workoutLengthString, workoutDateString, finalWorkout;
    EditText workoutTypeInput, workoutLengthInput, workoutDateInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        finalWorkout = "Last workout: ";
        workoutTypeInput = (EditText) findViewById(R.id.workoutType);
        workoutLengthInput = (EditText) findViewById(R.id.workoutLength);
        workoutDateInput = (EditText) findViewById(R.id.workoutDate);

        submitButton = (Button) findViewById(R.id.buttonLog);

        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                workoutTypeString = workoutTypeInput.getText().toString();
                workoutLengthString = workoutLengthInput.getText().toString();
                workoutDateString = workoutDateInput.getText().toString();
                if(workoutTypeString.length() != 0 ) {
                    finalWorkout += workoutTypeString;
                }
                if(workoutLengthString.length() != 0) {
                    finalWorkout += " for " + workoutLengthString + " minutes";
                }
                if(workoutDateString.length() != 0) {
                    finalWorkout += " on " + workoutDateString;
                }
                returnClick(v);
            }
        });
    }

    public void returnClick(View view) {
        Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
        myIntent.putExtra("value1", finalWorkout);
        startActivity(myIntent);
    }

}
