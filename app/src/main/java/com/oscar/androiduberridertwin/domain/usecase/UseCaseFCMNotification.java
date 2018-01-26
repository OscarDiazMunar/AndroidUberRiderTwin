package com.oscar.androiduberridertwin.domain.usecase;


import com.oscar.androiduberridertwin.domain.model.SenderFCM;

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
abstract class UseCaseFCMNotification<T> {
    private final CompositeDisposable compositeDisposable;

    /**
     * Instantiates a new Use case.
     */
    UseCaseFCMNotification() {
        this.compositeDisposable = new CompositeDisposable();
    }

    /**
     * Execute.
     *
     * @param disposableObserver the disposable observer
     * @param senderFCM          the sender fcm
     */
    public void execute(DisposableObserver<T> disposableObserver, SenderFCM senderFCM){
        final Observable<T> observable = this.buildUseCaseObservable(senderFCM)
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
     * @param senderFCM the sender fcm
     * @return the observable
     */
    abstract Observable<T> buildUseCaseObservable(SenderFCM senderFCM);

}
