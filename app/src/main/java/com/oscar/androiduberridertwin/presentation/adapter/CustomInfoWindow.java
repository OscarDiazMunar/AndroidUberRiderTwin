package com.oscar.androiduberridertwin.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.oscar.androiduberridertwin.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by oscar on 12/5/2017.
 */
public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {
    /**
     * The My view.
     */
    View myView;
    /**
     * The Txt pickup info.
     */
    @BindView(R.id.txtPickupInfo)
    TextView txtPickupInfo;
    /**
     * The Txt pickup snippet.
     */
    @BindView(R.id.txtPickupSnippet)
    TextView txtPickupSnippet;

    /**
     * Instantiates a new Custom info window.
     *
     * @param context the context
     */
    public CustomInfoWindow(Context context) {
        myView = LayoutInflater.from(context)
                .inflate(R.layout.custom_rider_info_window, null);
        ButterKnife.bind(this,myView);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        txtPickupInfo.setText(marker.getTitle());
        txtPickupSnippet.setText(marker.getSnippet());
        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
