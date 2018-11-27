package com.example.franky.ejemplo09_navigationdrawerfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.franky.ejemplo09_navigationdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class loginFragment extends Fragment {

    private Context contexto;
    private ImageView ivLogin;


    public loginFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);





    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }

}
