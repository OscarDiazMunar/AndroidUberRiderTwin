package com.oscar.androiduberridertwin.domain.usecase;


import com.google.android.gms.maps.model.LatLng;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by oscar on 10/19/2017.
 *
 * @param <T> the type parameter
 */
abstract class UseCase<T> {
    private final CompositeDisposable compositeDisposable;

    /**
     * Instantiates a new Use case.
     */
    UseCase() {
        this.compositeDisposable = new CompositeDisposable();
    }

    /**
     * Execute.
     *
     * @param disposableObserver the disposable observer
     */
    public void execute(DisposableObserver<T> disposableObserver, String destination, LatLng currentPosition){
        final Observable<T> observable = this.buildUseCaseObservable(destination, currentPosition)
                                        .subscribeOn(Schedulers.io())
                                        .observeOn(AndroidSchedulers.mainThread());

        DisposableObserver observer = observable.subscribeWith(disposableObserver);
        compositeDisposable.add(observer);
    }

    /**
     * Dispose.
     */
    public void dispose(){
        if (!compositeDisposable.isDisposed()){
            compositeDisposable.dispose();
        }
    }

    /**
     * Build use case observable observable.
     *
     * @return the observable
     */
    abstract Observable<T> buildUseCaseObservable(String destination, LatLng currentPosition);

}
