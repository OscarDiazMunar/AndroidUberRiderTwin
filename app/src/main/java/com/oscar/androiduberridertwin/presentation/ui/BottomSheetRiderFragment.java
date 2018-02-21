package com.oscar.androiduberridertwin.presentation.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oscar.androiduberridertwin.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by oscar on 12/5/2017.
 */
public class BottomSheetRiderFragment extends BottomSheetDialogFragment {
    /**
     * The M location.
     */
    String mLocation, /**
     * The M deestination.
     */
    mDestination;
    /**
     * The Txt location.
     */
    @BindView(R.id.txtLocation)
    TextView txtLocation;
    /**
     * The Txt destination.
     */
    @BindView(R.id.txtDestination)
    TextView txtDestination;
    /**
     * The Txt taxes.
     */
    @BindView(R.id.txtTaxes)
    TextView txtTaxes;
    /**
     * The Unbinder.
     */
    Unbinder unbinder;

    /**
     * New instance bottom sheet rider fragment.
     *
     * @param location    the location
     * @param destination the destination
     * @return the bottom sheet rider fragment
     */
    public static BottomSheetRiderFragment newInstance(String location, String destination) {
        BottomSheetRiderFragment fragment = new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("location", location);
        args.putString("destination", destination);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLocation = getArguments().getString("location");
            mDestination = getArguments().getString("destination");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_rider, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        setDataLabel();
    }

    private void setDataLabel() {
        txtDestination.setText(mDestination);
        txtLocation.setText(mLocation);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
