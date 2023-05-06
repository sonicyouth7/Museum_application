package com.example.museum_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.museum_app.MenuActivity;


import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MapActivity extends AppCompatActivity {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        // Configure la carte
        Configuration.getInstance().load(this, getPreferences(MODE_PRIVATE));
        mapView = findViewById(R.id.mapView);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setMultiTouchControls(true);
        mapView.setBuiltInZoomControls(false);
        mapView.getController().setZoom(15.0);
        mapView.getController().setCenter(new GeoPoint(48.858093, 2.294694)); // Centre de la carte sur Paris

        // Ajoutez les marqueurs des musées
        addMuseumMarkers();

        MenuActivity.setupMenuButtons(this);

    }

    private void addMuseumMarkers() {
        // Ajoutez les marqueurs des musées ici en utilisant les coordonnées GPS (latitude, longitude)
        // Exemple :
        addMuseumMarker(new GeoPoint(48.860611, 2.337644), "Musée du Louvre");
    }

    private void addMuseumMarker(GeoPoint location, String title) {
        Marker marker = new Marker(mapView);
        marker.setPosition(location);
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        marker.setTitle(title);
        mapView.getOverlays().add(marker);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }
}