package com.oscar.androiduberridertwin.presentation.presenter.ButtomSheetPresenter;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.domain.model.RequestGoogleApi;
import com.oscar.androiduberridertwin.domain.usecase.GetRequestApi;
import com.oscar.androiduberridertwin.domain.usecase.UseCaseObserver;
import com.oscar.androiduberridertwin.presentation.presenter.Presenter;
import com.oscar.androiduberridertwin.presentation.view.IBottomSheetView;
import com.oscar.androiduberridertwin.utils.Methods;

/**
 * Created by oscar on 2/27/2018.
 */

public class BottomSheetPresenter extends Presenter<IBottomSheetView> implements IBottomSheetPresenter {
    private GetRequestApi getRequestApi;
    private boolean isOnTapMap;

    public BottomSheetPresenter(GetRequestApi getRequestApi) {
        this.getRequestApi = getRequestApi;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void getDirection(String destination, LatLng currentPosition) {
        getRequestApi.execute(new GetRequestObserver() ,destination, currentPosition);
    }

    @Override
    public void setOnTapMap(boolean isTaped) {
        isOnTapMap = isTaped;
    }

    private class GetRequestObserver extends UseCaseObserver<RequestGoogleApi> {
        /**
         * The Value aux.
         */
        RequestGoogleApi valueAux;
        @Override
        public void onNext(RequestGoogleApi value) {
            super.onNext(value);
            Log.e("valueAux",value.toString());
            Log.e("distance" ,value.getRoutes().get(0).getLegs().get(0).getDistance().getText());
            Log.e("duration" ,value.getRoutes().get(0).getLegs().get(0).getDuration().getText());
            Log.e("start address" ,value.getRoutes().get(0).getLegs().get(0).getStartAddress());
            Log.e("end address" ,value.getRoutes().get(0).getLegs().get(0).getEndAddress());
            Log.e("legs", value.getRoutes().get(0).getLegs().get(0).toString());
            valueAux = value;
            /*customerCallActivity.setInformationNotification(value.getRoutes().get(0).getLegs().get(0).getDistance().getText(),\
                    value.getRoutes().get(0).getLegs().get(0).getDuration().getText(),
                    value.getRoutes().get(0).getLegs().get(0).getEndAddress());*/
            // adjustBounds(decodePoly(valueAux.getRoutes().get(0).getOverview_polyline().getPoints()));
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            Log.e("error request ", e.getMessage());
        }

        @Override
        public void onComplete() {
            super.onComplete();
            if (valueAux != null){
                Double distanceValue = Double.parseDouble(
                        valueAux.getRoutes().get(0).getLegs().get(0).getDistance().getText().replaceAll("[^0-9\\\\.]+",""));
                Integer timeValue = Integer.parseInt(
                        valueAux.getRoutes().get(0).getLegs().get(0).getDuration().getText().replaceAll("\\D", ""));
                String rateCalculated = String.format("%s + %s = $%.2f", valueAux.getRoutes().get(0).getLegs().get(0).getDistance().getText(),
                        valueAux.getRoutes().get(0).getLegs().get(0).getDuration().getText(),
                        Methods.getPrice(distanceValue, timeValue));
                getView().setDataLabelRate(rateCalculated);
                if (isOnTapMap){
                    getView().seDatalabelAddress(
                            valueAux.getRoutes().get(0).getLegs().get(0).getStartAddress(),
                            valueAux.getRoutes().get(0).getLegs().get(0).getEndAddress()
                    );
                }

                /*getView().setInformationNotification(valueAux.getRoutes().get(0).getLegs().get(0).getDistance().getText(),
                        valueAux.getRoutes().get(0).getLegs().get(0).getDuration().getText(),
                        valueAux.getRoutes().get(0).getLegs().get(0).getEndAddress());*/
            }

        }
    }
}
