package com.oscar.androiduberridertwin.domain.usecase;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by oscar on 10/19/2017.
 *
 * @param <T> the type parameter
 */


public abstract class UseCaseObserver<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T value) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
