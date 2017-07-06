package com.example.luke.tourguideappgoogle;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/*
Used fragemnts from Miwok code and some external fragments from forums, such as stackoverflow, android library, udacity forum
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;


    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {

        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);
        View container = listItemView.findViewById(R.id.container);
        int colour = ContextCompat.getColor(getContext(), mColorResourceId);
        container.setBackgroundColor(colour);

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        infoTextView.setText(currentPlace.getInfo());

        TextView headingNameTextView = (TextView) listItemView.findViewById(R.id.name_view);
        headingNameTextView.setText(currentPlace.getName());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            image.setImageResource(currentPlace.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else image.setVisibility(View.GONE);

        return listItemView;
    }
}