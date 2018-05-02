package com.oscar.androiduberridertwin.presentation.view;

import com.oscar.androiduberridertwin.presentation.presenter.Presenter;

/**
 * Created by oscar on 2/27/2018.
 */

public interface IBottomSheetView extends Presenter.PView{
    void setDataLabelRate(String rateCalculated);
    void seDatalabelAddress(String startAddress, String endAddress);
}
