package rafael.lopes.descarteaqui;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import rafael.lopes.descarteaqui.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private CheckBox eletronicosCheckBox, pilhasCheckBox, oleoCheckBox, moveisCheckBox ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        eletronicosCheckBox = findViewById(R.id.eletronicos_check_box);
        pilhasCheckBox = findViewById(R.id.pilhas_check_box);
        oleoCheckBox = findViewById(R.id.oleo_check_box);
        moveisCheckBox = findViewById(R.id.moveis_check_box);


        eletronicosCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                marcar();
            }
        });
        pilhasCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                marcar();
            }
        });
        oleoCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                marcar();
            }
        });
        moveisCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                marcar();
            }
        });

    }

    public void marcar(){

        mMap.clear();
        if (eletronicosCheckBox.isChecked()) {

            LatLng eletronico1 = new LatLng(-30.049925974625395, -51.22804814687221 );
            mMap.addMarker(new MarkerOptions().position(eletronico1).title("Parceiro de ELETRONICO UM"));

            LatLng eletronico2 = new LatLng(-30.056849402571924, -51.19709937745629 );
            mMap.addMarker(new MarkerOptions().position(eletronico2).title("Parceiro de ELETRONICO DOIS"));

            LatLng eletronico3 = new LatLng(-30.061358323811817, -51.2067246351183 );
            mMap.addMarker(new MarkerOptions().position(eletronico3).title("Parceiro de ELETRONICO TRES"));

            LatLng eletronico4 = new LatLng( -30.104038882371004, -51.23659984511638);
            mMap.addMarker(new MarkerOptions().position(eletronico4).title("Parceiro de ELETRONICO QUATRO"));

            LatLng eletronico5 = new LatLng(-30.060452015031306, -51.21543470406683 );
            mMap.addMarker(new MarkerOptions().position(eletronico5).title("Parceiro de ELETRONICO CINCO"));
        }
        if (pilhasCheckBox.isChecked()) {

            LatLng pilhas1 = new LatLng(-30.033614617749063, -51.22841804798278 );
            mMap.addMarker(new MarkerOptions().position(pilhas1).title("Parceiro de PILHAS UM"));

            LatLng pilhas2 = new LatLng(-30.085260507876768, -51.21496263559218 );
            mMap.addMarker(new MarkerOptions().position(pilhas2).title("Parceiro de PILHAS DOIS"));

            LatLng pilhas3 = new LatLng(-30.088565361372, -51.226335201546895 );
            mMap.addMarker(new MarkerOptions().position(pilhas3).title("Parceiro de PILHAS TRES"));

            LatLng pilhas4 = new LatLng(-30.08893668632344, -51.23474660881905 );
            mMap.addMarker(new MarkerOptions().position(pilhas4).title("Parceiro de PILHAS QUATRO"));

            LatLng pilhas5 = new LatLng(-30.039998100140814, -51.20392297904551 );
            mMap.addMarker(new MarkerOptions().position(pilhas5).title("Parceiro de PILHAS CINCO"));
        }
        if (oleoCheckBox.isChecked()) {

            LatLng oleo1 = new LatLng(-30.044240707579704, -51.21769107504656 );
            mMap.addMarker(new MarkerOptions().position(oleo1).title("Parceiro de OLEO UM"));

            LatLng oleo2 = new LatLng(-30.09551619788244, -51.24598704954407);
            mMap.addMarker(new MarkerOptions().position(oleo2).title("Parceiro de OLEO DOIS"));

            LatLng oleo3 = new LatLng(-30.043150398968923, -51.22692504254587);
            mMap.addMarker(new MarkerOptions().position(oleo3).title("Parceiro de OLEO TRES"));

            LatLng oleo4 = new LatLng(-30.06736721560523, -51.23062722168605);
            mMap.addMarker(new MarkerOptions().position(oleo4).title("Parceiro de OLEO QUATRO"));

            LatLng oleo5 = new LatLng(-30.08270479334048, -51.24247058661717);
            mMap.addMarker(new MarkerOptions().position(oleo5).title("Parceiro de OLEO CINCO"));
        }
        if (moveisCheckBox.isChecked()) {

            LatLng moveis1 = new LatLng(-30.069232051867385, -51.21740165462109 );
            mMap.addMarker(new MarkerOptions().position(moveis1).title("Parceiro de MOVEIS UM"));

            LatLng moveis2 = new LatLng(-30.047710819013254, -51.185998216352345 );
            mMap.addMarker(new MarkerOptions().position(moveis2).title("Parceiro de MOVEIS DOIS"));

            LatLng moveis3 = new LatLng(-30.034576183338665, -51.23649351189558 );
            mMap.addMarker(new MarkerOptions().position(moveis3).title("Parceiro de MOVEIS TRES"));

            LatLng moveis4 = new LatLng(-30.065061291267803, -51.200133683138134 );
            mMap.addMarker(new MarkerOptions().position(moveis4).title("Parceiro de MOVEIS QUATRO"));

            LatLng moveis5 = new LatLng(-30.085730132498416, -51.20840139092164 );
            mMap.addMarker(new MarkerOptions().position(moveis5).title("Parceiro de MOVEIS CINCO"));

            LatLng moveis6 = new LatLng(-30.05324909122244, -51.222307336604246 );
            mMap.addMarker(new MarkerOptions().position(moveis6).title("Parceiro de MOVEIS SEIS"));
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

        // seta um ponto e da zoom em porto alegre
        LatLng portoAlegre = new LatLng(-30.033056,-51.230000 );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(portoAlegre));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(portoAlegre, 12.0f));



/*
        // faz a requisicao da permissao e testa se foi permitido
        ActivityCompat.requestPermissions(MapsActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);

        mMap.getUiSettings().setZoomControlsEnabled(true); // sinal + e - zoom
        mMap.getUiSettings().setMyLocationButtonEnabled(true); // vai para localizacao atual
        mMap.getUiSettings().setCompassEnabled(true); // bussola
        mMap.getUiSettings().setRotateGesturesEnabled(true); // permite girar com a mao
        mMap.getUiSettings().setAllGesturesEnabled(true);
*/


    }
}