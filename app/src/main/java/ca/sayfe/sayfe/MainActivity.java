package ca.sayfe.sayfe;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Homepage for the application
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Defining elements on activity
        //Button to go to Questions Activity
        //define button by connecting it to the resource by id
        Button mainActivityQuestionsButton = (Button) findViewById(R.id.mainActivityQuestionsButton);
        //adding a listener
        mainActivityQuestionsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionListActivity.class);
                startActivity(intent);
            }
        });

        //Button to go to map/unsafe activity
        Button mainActivityMapButton = (Button) findViewById(R.id.mainActivityMapButton);
        mainActivityMapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        //Button to go to support activity
        Button mainActivitySupportButton = (Button) findViewById(R.id.mainActivitySupportButton);
        mainActivitySupportButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, SupportActivity.class);
                //startActivity(intent);
            }
        });

        TextView mainActivityTitleText = (TextView) findViewById(R.id.mainActivityTitleText);


        //Fonts
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Regular.ttf");
        mainActivityTitleText.setTypeface(font);
        mainActivityQuestionsButton.setTypeface(font);
        mainActivityMapButton.setTypeface(font);
        mainActivitySupportButton.setTypeface(font);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.aboutActivityActionBar:
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                // 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage(R.string.aboutMainActivity)
                        .setTitle("Mission Statement");
                // 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
                dialog.show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
