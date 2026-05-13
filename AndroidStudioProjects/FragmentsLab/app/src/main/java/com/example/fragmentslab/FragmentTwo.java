package com.example.fragmentslab;


import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    private TextView labelValeur;
    private SeekBar barreProgression;
    private int niveauActuel = 0;
    private static final String CLE_BARRE = "cle_barre";

    public FragmentTwo() {
        super(R.layout.fragment_two);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        labelValeur      = view.findViewById(R.id.labelValeur);
        barreProgression = view.findViewById(R.id.barreProgression);

        if (savedInstanceState != null) {
            niveauActuel = savedInstanceState.getInt(CLE_BARRE, 0);
            barreProgression.setProgress(niveauActuel);
            labelValeur.setText("Niveau : " + niveauActuel);
        }


        barreProgression.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar s, int valeur, boolean fromUser) {
                niveauActuel = valeur;
                labelValeur.setText("Niveau : " + valeur);
            }
            @Override public void onStartTrackingTouch(SeekBar s) {}
            @Override public void onStopTrackingTouch(SeekBar s) {}
        });
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(CLE_BARRE, niveauActuel);
    }
}