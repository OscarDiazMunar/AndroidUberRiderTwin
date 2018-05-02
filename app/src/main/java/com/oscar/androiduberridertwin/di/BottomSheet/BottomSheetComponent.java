package com.oscar.androiduberridertwin.di.BottomSheet;

import com.oscar.androiduberridertwin.presentation.ui.BottomSheetRiderFragment;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by oscar on 2/27/2018.
 */
@Singleton
@Component(modules = BottomSheetModule.class)
public interface BottomSheetComponent {
    void inject(BottomSheetRiderFragment bottomSheetRiderFragment);
}
