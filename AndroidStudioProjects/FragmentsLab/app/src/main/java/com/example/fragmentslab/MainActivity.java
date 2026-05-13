package com.example.fragmentslab;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnVueUn, btnVueDeux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVueUn  = findViewById(R.id.btnVueUn);
        btnVueDeux = findViewById(R.id.btnVueDeux);

        // Charger la première vue au lancement
        if (savedInstanceState == null) {
            chargerFragment(new FragmentOne(), false);
        }

        btnVueUn.setOnClickListener(v  -> chargerFragment(new FragmentOne(), true));
        btnVueDeux.setOnClickListener(v -> chargerFragment(new FragmentTwo(), true));
    }

    private void chargerFragment(Fragment fragment, boolean ajouterPile) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.conteneur_vue, fragment);

        if (ajouterPile) {
            ft.addToBackStack(null);
        }

        ft.commit();
    }
}