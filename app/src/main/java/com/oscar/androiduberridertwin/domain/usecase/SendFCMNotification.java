package com.oscar.androiduberridertwin.domain.usecase;

import com.oscar.androiduberridertwin.data.respository.RepositoryFCMNotification;
import com.oscar.androiduberridertwin.domain.model.SenderFCM;

import io.reactivex.Observable;

/**
 * Created by oscar on 1/24/2018.
 */
public class SendFCMNotification extends UseCaseFCMNotification {
    private final RepositoryFCMNotification repository;

    /**
     * Instantiates a new Send fcm notification.
     *
     * @param repository the repository
     */
    public SendFCMNotification(RepositoryFCMNotification repository) {
        this.repository = repository;
    }

    @Override
    Observable buildUseCaseObservable(SenderFCM senderFCM) {
        return repository.sendFCMNotificationDriver(senderFCM);
    }
}
