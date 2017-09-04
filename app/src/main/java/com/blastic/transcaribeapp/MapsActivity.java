package com.blastic.transcaribeapp;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.widget.Toast;

import com.blastic.transcaribeapp.data.model.Station;
import com.blastic.transcaribeapp.data.model.Stations;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener {

    private GoogleMap mMap;
    private File file;
    public static final String PREFS_NAME = "CoordenadasFile";
    public static final ArrayMap<LatLng, String> stations = new ArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Restore preferences
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("coord", "");
        // Commit the edits!
        editor.commit();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mapFragment.getView().setClickable(true);
    }

    private void loadStationsMarkers() {
        Stations stations = new Stations();
        for (Station station : stations.getStations()) {
            mMap.addMarker(new MarkerOptions()
                    .position(station.getCoord())
                    .title(station.getName())
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            );
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMapClickListener(this);

        loadStationsMarkers();

        // Add a marker in Cartagena-Bolivar and move the camera
        LatLng center = new LatLng(10.407795, -75.511273);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center));
    }

    @Override
    public void onMapClick(LatLng latLng) {
        ArrayList<LatLng> points = new ArrayList<>();
        points.add(new LatLng(10.396773319629565, -75.47219775617123));
        points.add(new LatLng(10.397230052741575, -75.4725031927228));
        points.add(new LatLng(10.39739230001117, -75.47267485409975));
        points.add(new LatLng(10.39742428777592, -75.47282036393881));
        points.add(new LatLng(10.397434510669116, -75.47291927039623));
        points.add(new LatLng(10.3974328618154, -75.47299973666668));
        points.add(new LatLng(10.397419011443814, -75.47307349741459));
        points.add(new LatLng(10.397403512217746, -75.47314792871475));
        points.add(new LatLng(10.397368556513575, -75.47323845326902));
        points.add(new LatLng(10.397246871060027, -75.47361362725496));
        points.add(new LatLng(10.396790137972623, -75.47458291053772));
        points.add(new LatLng(10.396577765103716, -75.47513477504253));
        points.add(new LatLng(10.396509832136909, -75.47527994960546));
        points.add(new LatLng(10.396196219074277, -75.47615300863981));
        points.add(new LatLng(10.395901402721899, -75.47684334218502));
        points.add(new LatLng(10.395349033527266, -75.4779527708888));
        points.add(new LatLng(10.395318694414842, -75.47803726047277));

        for (int i = 0; i < points.size(); i++) {
            LatLng startCoord = points.get(i);
            if ((i + 1) < points.size()) {
                LatLng endCoord = points.get((i + 1));
                Polyline line = mMap.addPolyline(new PolylineOptions()
                        .add(startCoord, endCoord)
                        .width(5)
                        .color(Color.RED));
            }
        }

        // We need an Editor object to make preference changes.
        // All objects are from android.context.Context
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        String coordSaved = settings.getString("coord", "");
        editor.putString("coord", coordSaved + "\n" + latLng);

        // Commit the edits!
        editor.commit();

        mMap.addMarker(new MarkerOptions().position(latLng).title("Point"));
    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}
