package com.oscar.androiduberridertwin.presentation.presenter.HomeActivityPresenter;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.domain.model.ResponseFCM;
import com.oscar.androiduberridertwin.domain.model.SenderFCM;
import com.oscar.androiduberridertwin.domain.usecase.SendFCMNotification;
import com.oscar.androiduberridertwin.domain.usecase.UseCaseObserver;
import com.oscar.androiduberridertwin.presentation.presenter.Presenter;
import com.oscar.androiduberridertwin.presentation.ui.HomeActivity;
import com.oscar.androiduberridertwin.presentation.view.IHomeActivityView;

/**
 * Created by oscar on 12/5/2017.
 */
public class HomeActivityPresenter extends Presenter<IHomeActivityView> implements IHomeActivityPresenter{
    private HomeActivity homeActivity;
    private SendFCMNotification sendFCMNotification;

    /**
     * Instantiates a new Home activity presenter.
     *
     * @param homeActivity        the home activity
     * @param sendFCMNotification the send fcm notification
     */
    public HomeActivityPresenter(HomeActivity homeActivity, SendFCMNotification sendFCMNotification) {
        this.homeActivity = homeActivity;
        this.sendFCMNotification = sendFCMNotification;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void getDirection(String destination, LatLng currentPosition) {

    }

    @Override
    public void sendMessageNotification(SenderFCM senderFCM) {
        sendFCMNotification.execute(new GetSequestNotificationObserver(), senderFCM);
    }

    private class GetSequestNotificationObserver extends UseCaseObserver<ResponseFCM>{
        /**
         * The Value aux.
         */
        ResponseFCM valueAux;

        @Override
        public void onNext(ResponseFCM value) {
            super.onNext(value);
            valueAux = value;
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            Log.e("error", e.getMessage());
        }

        @Override
        public void onComplete() {
            super.onComplete();
            if (valueAux.getSuccess() == 1){
                getView().showToast("success");
            }else {
                getView().showToast("fail");
            }
        }
    }
}
