package com.oscar.androiduberridertwin.presentation.presenter;

/**
 * Created by oscar on 10/11/2017.
 *
 * @param <T> the type parameter
 */
public class Presenter<T extends Presenter.PView> {

    private T view;

    /**
     * Gets view.
     *
     * @return the view
     */
    public T getView() {
        return view;
    }

    /**
     * Sets view.
     *
     * @param view the view
     */
    public void setView(T view) {
        this.view = view;
    }

    /**
     * Initialize.
     */
    public void initialize(){

    }

    /**
     * Terminate.
     */
    public void terminate(){

    }

    /**
     * The interface P view.
     */
    public interface PView{

    }
}
