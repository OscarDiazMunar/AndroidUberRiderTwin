package com.oscar.androiduberridertwin.presentation.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.R;
import com.oscar.androiduberridertwin.di.BottomSheet.BottomSheetComponent;
import com.oscar.androiduberridertwin.di.BottomSheet.BottomSheetModule;
import com.oscar.androiduberridertwin.di.BottomSheet.DaggerBottomSheetComponent;
import com.oscar.androiduberridertwin.presentation.presenter.ButtomSheetPresenter.BottomSheetPresenter;
import com.oscar.androiduberridertwin.presentation.view.IBottomSheetView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by oscar on 12/5/2017.
 */
public class BottomSheetRiderFragment extends BottomSheetDialogFragment implements IBottomSheetView{
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
     * The Unbinder.
     */
    Unbinder unbinder;
    /**
     * The Txt rates.
     */
    @BindView(R.id.txtRates)
    TextView txtRates;

    private LatLng origin;
    private boolean isTapOnMap;

    @Inject
    BottomSheetPresenter presenter;

    /**
     * New instance bottom sheet rider fragment.
     *
     * @param location    the location
     * @param destination the destination
     * @param latLngLocation
     * @return the bottom sheet rider fragment
     */
    public static BottomSheetRiderFragment newInstance(String location,
                                                       String destination,
                                                       LatLng latLngLocation,
                                                       boolean isTapOnMap) {
        BottomSheetRiderFragment fragment = new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("location", location);
        args.putString("destination", destination);
        args.putParcelable("LatLngDestinitation", latLngLocation);
        args.putBoolean("isTapOnMap", isTapOnMap);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLocation = getArguments().getString("location");
            mDestination = getArguments().getString("destination");
            origin = getArguments().getParcelable("LatLngDestinitation");
            isTapOnMap = getArguments().getBoolean("isTapOnMap");
            Log.e("DESLAT", origin.toString());
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
        //setDataLabel();
        if (!isTapOnMap){
            seDatalabelAddress(mLocation, mDestination);
            presenter.setOnTapMap(false);
        }else {
            presenter.setOnTapMap(true);
        }
        presenter.getDirection(mDestination, origin);
    }

    @Override
    public void onAttach(Context context) {
        initializeDagger();
        presenter.setView(this);
        super.onAttach(context);
    }

    private void initializeDagger() {
        BottomSheetComponent bottomSheetComponent = DaggerBottomSheetComponent.builder()
                .bottomSheetModule(new BottomSheetModule()).build();
        bottomSheetComponent.inject(this);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void setDataLabelRate(String rateCalculated) {
        txtRates.setText(rateCalculated);
    }

    @Override
    public void seDatalabelAddress(String startAddress, String endAddress) {
        txtDestination.setText(endAddress);
        txtLocation.setText(startAddress);
    }
}
