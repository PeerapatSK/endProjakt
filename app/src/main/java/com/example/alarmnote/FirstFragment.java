package com.example.alarmnote;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {


    private Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button = (Button) button.findViewById(R.id.button_selectalarm_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectalarm(view);
            }
        });
    }

    public void openSelectalarm(View view){
        Intent intent = new Intent(view.getContext(), Selectalarm.class);
        startActivity(intent);
    }

}