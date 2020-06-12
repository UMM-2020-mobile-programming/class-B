package com.example.androidstudio;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class PengaturanFragment extends Fragment {
    Button bl,b2;
    Switch switchs;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pengaturan, container, false);
        bl = v.findViewById(R.id.keluar);
        b2 = v.findViewById(R.id.info);
        switchs = v.findViewById(R.id.switc);

        switchs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    Toast.makeText(getActivity(), "Aktif", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getActivity(), "Tidak Aktif", Toast.LENGTH_LONG).show();
                }
            }
        });

        SwipeButton swipeButton = v.findViewById(R.id.swipe);
        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Toast.makeText(getActivity(), "Berhasil di Sync", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getActivity(),BerandaActivity.class));
            }
        });


        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),FullActivity.class));
            }
        });

        return v;
    }
}
