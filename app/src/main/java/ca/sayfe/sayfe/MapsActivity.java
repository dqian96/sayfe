package ca.sayfe.sayfe;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        // Retrieve the PlaceAutocompleteFragment.
        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.autocomplete_fragment);
        autocompleteFragment.setHint("My location is ...");
        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                Log.i("Place Search ", "Place: " + place.getName());
                Log.i("Place Search ", "Place: " + place.getLatLng());

                LatLng searchLocation = new LatLng( place.getLatLng().latitude, place.getLatLng().longitude);
                mMap.moveCamera(CameraUpdateFactory.zoomTo(13));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(searchLocation));
            }

            @Override
            public void onError(Status status) {
                Log.i("Place Search ", "An error occurred: " + status);
            }
        });

        //Radius selection SeekBar
        //Bind the SeekBar element on the Viewer to SeekBar Java Object on the controller by ID
        final SeekBar radiusSeekBar = (SeekBar) findViewById(R.id.RadiusSeekBar);
        final TextView RadiusTextView = (TextView) findViewById(R.id.RadiusTextView);
        //Set an listener/event handler to to the event that the SeekBar is changed by passing in
        //an anonymous callback function (OnSeekBarChangeListener) to run when the event is detected
        //as part of the event handling
        radiusSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                RadiusTextView.setText(radiusSeekBar.getProgress()+" km");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

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
                builder.setMessage(R.string.aboutMapsActivity)
                        .setTitle("I want immediate help");
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

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    //Callback to be executed when map is ready (when map is ready, this function is executing given
    //the map object that is ready as an argument
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //move to starting location
        LatLng startLocation = new LatLng(45.4214, -75.6919);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(13));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(startLocation));
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));






        //TODO: DEMO IMPLEMENTATION FOR MARKERS
        //add http pull data using new help center object and properties etc.
        //add default markers
        //create a new marker object and reference it to the map (e.g. an array of marker objects in googleMap keeps
        //track of the markers associated with the map
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.653226, -79.383184))
                .title("Toronto Rape Crisis Centre"));

        //in actual implementation, there should be a help center class
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.6635475, -79.384294))
                .title("Assaulted Women's Help Line"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(42.308596, -85.164287))
                .title("Sexual Assault & Domestic Violence Care Centre at the Women’s College Hospital"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(35.598315, -82.540534))
                .title("Barbra Schlifer Commemorative Clinic"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.653548, -79.398037))
                .title("Kids Help Phone"));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            //the caller passes the marker clicked as a parameter when calling the callback function (function passed
            //as a param to be called in the event handling, such that the callback function has a reference to the marker
            @Override
            public boolean onMarkerClick(Marker marker) {
                String message = "";
                if (marker.getTitle().equals("Toronto Rape Crisis Centre")) {
                    message =
                            "416-597-1171 (main line), 416-597-8808 (counselling line)\n" +
                            "Offers legal support, referrals, a 24-hour crisis line, support groups and in-person counselling for victims of sexual assault.\n" +
                            "Mon-Fri, 9:30am-5pm. " +
                            "More information at http://www.trccmwar.ca/.\n";
                }
                else if (marker.getTitle().equals("Assaulted Women's Help Line")) {
                    message =
                            "416-863-0511, toll-free in Ontario at 1-866-863-0511 , or 416-323-6040 if assaulted in last 72 hours\n" +
                            "Call-in only.\n" +
                            "Emergency help line for women that have been assaulted. Anonymous, accessible 24 hours a day. " +
                            "More information at http://www.awhl.org/.";
                }
                else if (marker.getTitle().equals("Kids Help Phone")) {
                    message =
                            "416-863-0511, toll-free in Ontario at 1-866-863-0511 , or 416-323-6040 if assaulted in last 72 hours\n" +
                                    "Call-in only.\n" +
                                    "Emergency help line for women that have been assaulted. Anonymous, accessible 24 hours a day. " +
                                    "More information at http://www.kidshelp.org/.";
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(MapsActivity.this);
                builder.setMessage(message)
                        .setTitle(marker.getTitle());
                AlertDialog dialog = builder.create();
                dialog.show();
                return false;
            }
        });

    }
}
