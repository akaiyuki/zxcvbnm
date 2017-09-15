package com.av.dev.pyurlifestylemanager.models.fragment;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.av.dev.pyurlifestylemanager.R;
import com.av.dev.pyurlifestylemanager.models.activity.MainActivity;
import com.av.dev.pyurlifestylemanager.views.Fonts;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    @BindView(R.id.txtuser)
    TextView txtuser;
    @BindView(R.id.txtlifestyle)
    TextView txtlifestyle;
    @BindView(R.id.editemail)
    EditText editemail;
    @BindView(R.id.editpassword)
    EditText editpassword;
    @BindView(R.id.btnlogin)
    Button btnlogin;
    @BindView(R.id.txtforgot)
    TextView txtforgot;
    @BindView(R.id.requestaccess)
    TextView requestaccess;



    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        ButterKnife.bind(this,view);

        changeFont();

        changeSelection();

        return view;
    }

    @OnClick(R.id.btnlogin)
    public void onClick(){

        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().finish();

    }

    private void changeFont(){
        txtuser.setTypeface(Fonts.latoRegular);
        txtlifestyle.setTypeface(Fonts.latoRegular);
        editemail.setTypeface(Fonts.latoRegular);
        editpassword.setTypeface(Fonts.latoRegular);
        btnlogin.setTypeface(Fonts.latoRegular);
        txtforgot.setTypeface(Fonts.latoRegular);
        requestaccess.setTypeface(Fonts.latoRegular);

    }

    private void changeSelection(){


            txtuser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtuser.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.ic_rounded_bronze));
                    txtlifestyle.setBackgroundColor(Color.parseColor("#"+Integer.toHexString(ContextCompat.getColor(getContext(),R.color.colorBackground))));

                }
            });

            txtlifestyle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtlifestyle.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.ic_rounded_bronze));
                    txtuser.setBackgroundColor(Color.parseColor("#"+Integer.toHexString(ContextCompat.getColor(getContext(),R.color.colorBackground))));

//                    roundWay.setTextColor(Color.parseColor("#"+Integer.toHexString(ContextCompat.getColor(getContext(),R.color.colorWhiteText))));
//                    oneWay.setTextColor(Color.parseColor("#"+Integer.toHexString(ContextCompat.getColor(getContext(),R.color.colorEditText))));

                }
            });


    }

}
