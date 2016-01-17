package ca.sayfe.sayfe;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SharedStoriesActivity extends AppCompatActivity {
    boolean isRecording = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_stories);

        final FloatingActionButton recordButton = (FloatingActionButton) findViewById(R.id.recordButton);
        //recordButton.setBackgroundTintList(ColorStateList.valueOf(38536));
        recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isRecording == false) {
                    recordButton.setBackgroundTintList(getResources().getColorStateList(R.color.recordingRed));
                    Snackbar.make(view, "Recording ...", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else {
                    recordButton.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
                    Snackbar.make(view, "Done!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                isRecording = !(isRecording);

            }
        });

        final TextView sharedStoriesActivitySharedStoriesListingsButton= (TextView) findViewById(R.id.sharedStoriesActivitySharedStoriesListingsButton);
        sharedStoriesActivitySharedStoriesListingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SharedStoriesActivity.this, SharedStoriesListingsActivity.class);
                startActivity(intent);

            }
        });
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
                builder.setMessage(R.string.aboutSharedStoriesActivity)
                        .setTitle("Shared Stories");
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
