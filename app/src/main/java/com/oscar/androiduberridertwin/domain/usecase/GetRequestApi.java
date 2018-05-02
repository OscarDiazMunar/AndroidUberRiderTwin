package com.oscar.androiduberridertwin.domain.usecase;

import com.google.android.gms.maps.model.LatLng;
import com.oscar.androiduberridertwin.data.respository.Repository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by oscar on 11/16/2017.
 */
public class GetRequestApi extends UseCase {
    private final Repository repository;

    /**
     * Instantiates a new Get request api.
     *
     * @param repository the repository
     */
    @Inject
    public GetRequestApi(Repository repository) {
        this.repository = repository;
    }

    @Override
    Observable buildUseCaseObservable(String destination, LatLng currentPosition) {
        return repository.getRequestApi(destination, currentPosition);
    }
}
