package com.oscar.androiduberridertwin.presentation.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oscar.androiduberridertwin.R;

/**
 * Created by oscar on 12/5/2017.
 */
public class BottomSheetRiderFragment extends BottomSheetDialogFragment {
    /**
     * The M tag.
     */
    String mTag;

    /**
     * New instance bottom sheet rider fragment.
     *
     * @param tag the tag
     * @return the bottom sheet rider fragment
     */
    public static BottomSheetRiderFragment newInstance(String tag){
        BottomSheetRiderFragment fragment = new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("TAG", tag);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag = getArguments().getString("TAG");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_rider, container, false);
        return view;
    }
}
