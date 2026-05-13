package com.example.fragmentslab;


import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FragmentOne extends Fragment {

    private TextView labelMessageUn;
    private Button btnSaluer;

    public FragmentOne() {
        super(R.layout.fragment_one);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        labelMessageUn = view.findViewById(R.id.labelMessageUn);
        btnSaluer      = view.findViewById(R.id.btnSaluer);

        btnSaluer.setOnClickListener(v ->
                labelMessageUn.setText("Salut ! Fragment 1 actif.")
        );
    }


    @Override
    public void onResume() {
        super.onResume();
        android.util.Log.d("FragmentOne", "onResume() — Vue 1 visible");
    }


    @Override
    public void onPause() {
        super.onPause();
        android.util.Log.d("FragmentOne", "onPause() — Vue 1 en pause");
    }
}