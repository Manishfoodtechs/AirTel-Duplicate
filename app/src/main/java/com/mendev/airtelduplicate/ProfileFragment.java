package com.mendev.airtelduplicate;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Megi Fernanda on 01-Nov-17.
 */

public class ProfileFragment extends Fragment {

    LinearLayout lyAddfnf;


    public ProfileFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        lyAddfnf = (LinearLayout) view.findViewById(R.id.ly_addfnf);



        setButton();
        return view;
    }

    private void setButton() {

        lyAddfnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddfriendfamilyActivity.class);
                startActivity(intent);
            }
        });
    }


}
