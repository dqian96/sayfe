package ca.sayfe.sayfe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Homepage for the application
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
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


    }
}
