package com.oscar.androiduberridertwin.di.BottomSheet;

import com.oscar.androiduberridertwin.data.rest.GoogleMapsApiClient;
import com.oscar.androiduberridertwin.domain.usecase.GetRequestApi;
import com.oscar.androiduberridertwin.presentation.presenter.ButtomSheetPresenter.BottomSheetPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oscar on 2/27/2018.
 */
@Module
public class BottomSheetModule {
    /**
     * Provide get request api get request api.
     *
     * @return the get request api
     */
    @Provides
    public GetRequestApi provideGetRequestApi(){
        return new GetRequestApi(GoogleMapsApiClient.getInstance());
    }

    /**
     * Provide buttom sheet presenter buttom sheet presenter.
     *
     * @param getRequestApi the get request api
     * @return the buttom sheet presenter
     */
    @Provides
    public BottomSheetPresenter provideButtomSheetPresenter(GetRequestApi getRequestApi){
        return new BottomSheetPresenter(getRequestApi);
    }
}
