package com.av.dev.pyurlifestylemanager.models.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.av.dev.pyurlifestylemanager.R;
import com.av.dev.pyurlifestylemanager.views.CircleTransform;
import com.av.dev.pyurlifestylemanager.views.Fonts;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by CodeSyaona on 14/09/2017.
 */

public class ActiveAdapter extends ArrayAdapter<String> {

        Context mContext;
        ArrayList<String> mData = new ArrayList<>();
        int mResId;
        int column;

public ActiveAdapter(Context context, int resource, ArrayList<String> data) {
        super(context, resource, data);
        this.mContext = context;
        this.mResId = resource;
        this.mData = data;
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
        //Inflate layout
        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        convertView = inflater.inflate(mResId, null);
//                convertView = inflater.inflate(R.layout.custom_row_pager, null);
        holder = new ViewHolder();

        holder.txtname = (TextView) convertView.findViewById(R.id.name);
        holder.txtbooking = (TextView) convertView.findViewById(R.id.booking);
        holder.imgprofile = (ImageView) convertView.findViewById(R.id.profilepic);
        holder.txtDetails = convertView.findViewById(R.id.details);

        convertView.setTag(holder);
        } else {
        holder = (ViewHolder) convertView.getTag();
        }

//        JSONObject row = mData.get(position);
//
//        try {
//
//            if (row != null){
//
//
//            }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }


        holder.txtname.setText(mData.get(position));

        Picasso.with(getContext())
        .load(R.drawable.ic_logo)
        .transform(new CircleTransform())
        .into(holder.imgprofile);

        holder.txtbooking.setText("Flight Booking");
        Drawable img = getContext().getResources().getDrawable( R.drawable.ic_flight );
        img.setBounds( 0, 0, 60, 60 );
        holder.txtbooking.setCompoundDrawables( img, null, null, null );

        holder.txtname.setTypeface(Fonts.latoRegular);
        holder.txtbooking.setTypeface(Fonts.latoRegular);
        holder.txtDetails.setTypeface(Fonts.latoItalic);

        return convertView;
        }

class ViewHolder {
    TextView txtname;
    TextView txtbooking;
    TextView txtDetails;
    ImageView imgprofile;
}
}