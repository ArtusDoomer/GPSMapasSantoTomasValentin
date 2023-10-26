package com.vcornejo.appgps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener, OnMapReadyCallback{

    EditText txtLatitud, txtLongitud;
    GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
        txtLatitud = findViewById(R.id.txt_latitud);
        txtLongitud = findViewById(R.id.txt_longitud);
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        LatLng ustTemuco = new LatLng(-38.73453333577549, -72.60196717479742);
        mMap.addMarker(new MarkerOptions().position(ustTemuco).title("UST TEMUCO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustTemuco));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                                          @Override
                                          public boolean onMarkerClick(@NonNull Marker marker) {
                                              Intent intent = new Intent(MainActivity.this, VideoSantoTomas.class);
                                              startActivity(intent);
                                              return false;
                                          }
                                      });
                LatLng ustIquique = new LatLng(-20.219034656393724, -70.1407316754921);
        mMap.addMarker(new MarkerOptions().position(ustIquique).title("UST IQUIQUE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustIquique));
        LatLng ustArica = new LatLng(-18.48320242531223, -70.31043977738248);
        mMap.addMarker(new MarkerOptions().position(ustArica).title("UST ARICA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustArica));
        LatLng ustAntofagasta = new LatLng(-23.634505413770412, -70.394149163746228);
        mMap.addMarker(new MarkerOptions().position(ustAntofagasta).title("UST ANTOFAGASTA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustAntofagasta));
        LatLng ustLaSerena = new LatLng(-29.90819661556879, -71.25590838105533);
        mMap.addMarker(new MarkerOptions().position(ustLaSerena).title("UST LA SERENA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustLaSerena));
        LatLng ustViña = new LatLng(-33.03750725579, -71.52212731124087);
        mMap.addMarker(new MarkerOptions().position(ustViña).title("UST VIÑA DEL MAR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustViña));
        LatLng ustSantiago = new LatLng(-33.44583459066271, -70.66078551732267);
        mMap.addMarker(new MarkerOptions().position(ustSantiago).title("UST SANTIAGO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustSantiago));
        LatLng ustTalca = new LatLng(-35.42765156551786, -71.67321420642772);
        mMap.addMarker(new MarkerOptions().position(ustTalca).title("UST TALCA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustTalca));
        LatLng ustConce = new LatLng(-36.826114362000354, -73.06161765159052);
        mMap.addMarker(new MarkerOptions().position(ustConce).title("UST CONCEPCIÓN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustConce));
        LatLng ustLA = new LatLng(-37.47190290283107, -72.35396271718672);
        mMap.addMarker(new MarkerOptions().position(ustLA).title("UST LOS ÁNGELES"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustLA));
        LatLng ustValdivia = new LatLng(-39.80361760721657, -73.23023085640892);
        mMap.addMarker(new MarkerOptions().position(ustValdivia).title("UST VALDIVIA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustValdivia));
        LatLng ustOsorno = new LatLng(-40.571668528177184, -73.13779030538899);
        mMap.addMarker(new MarkerOptions().position(ustOsorno).title("UST OSORNO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustOsorno));
        LatLng ustPmontt = new LatLng(-41.47211970268055, -72.92868260470748);
        mMap.addMarker(new MarkerOptions().position(ustPmontt).title("UST PUERTO MONTT"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ustPmontt));
    }
}