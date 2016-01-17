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

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        //Button to go to SharedStoriesActivity
        Button supportActivitySharedStoriesButton = (Button) findViewById(R.id.sharedStoriesReplayButton);
        supportActivitySharedStoriesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SupportActivity.this, SharedStoriesActivity.class);
                startActivity(intent);
            }
        });

        //Button to go to Options Activity
        Button supportActivityOptionsButton = (Button) findViewById(R.id.supportActivityOptionsButton);
        supportActivityOptionsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SupportActivity.this, OptionsActivity.class);
                startActivity(intent);
            }
        });

        Button supportActivityQuestionsButton = (Button) findViewById(R.id.supportActivityQuestionsButton);
        //Go to Questions Page
        supportActivityQuestionsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SupportActivity.this, QuestionListActivity.class);
                startActivity(intent);
            }
        });

        //findViewById simply returns the View by does not return its subclass TextView (specific type of View)
        //e.g. a dog is an animal, so a dog is automatically of type animal, this function would return the dog
        //as type animal (which it is) but we need to cast it to dog
        TextView supportActivityTitleTextView = (TextView) findViewById(R.id.supportActivityTitleTextView);
        //Fonts
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Regular.ttf");
        supportActivityTitleTextView.setTypeface(font);
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
                builder.setMessage(R.string.aboutSupportActivity)
                        .setTitle("I Want Support");
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
