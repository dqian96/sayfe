package ca.sayfe.sayfe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define button by connecting it to the resource by id
        Button mainActivityFirstButton = (Button) findViewById(R.id.mainActivityFirstButton);
        //adding a listener
        mainActivityFirstButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionListActivity.class);
                startActivity(intent);
            }
        });

        //define button by connecting it to the resource by id
        Button mainActivitySecondButton = (Button) findViewById(R.id.mainActivitySecondButton);
        //adding a listener
        mainActivitySecondButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });


        //define button by connecting it to the resource by id
        Button mainActivityThirdButton = (Button) findViewById(R.id.mainActivityThirdButton);
        //adding a listener
        mainActivityThirdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, SupportActivity.class);
                //startActivity(intent);
            }
        });


    }
}
