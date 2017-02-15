package com.example.android.tourguideapp_singapore;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ultrajustin22 on 13/2/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Attraction}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_title_text_view.
        TextView currentAttractionTitle = (TextView) listItemView.findViewById(R.id.attraction_title_text_view);
        // Get the title from the currentWord object and set this text on
        // the currentAttractionTitle.
        currentAttractionTitle.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID attraction_description_text_view.
        TextView currentAttractionDescription = (TextView) listItemView.findViewById(R.id.attraction_description_text_view);
        // Get the description from the currentAttraction
        currentAttractionDescription.setText(currentAttraction.getAttractionDescription());

        // Find the TextView in the list_item.xml layout with the ID attraction_description_text_view.
        TextView currentAttractionLocation = (TextView) listItemView.findViewById(R.id.attraction_location_text_view);
        // Get the description from the currentAttraction
        currentAttractionLocation.setText(currentAttraction.getAttractionLocation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAttraction.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
