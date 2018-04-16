package com.ajinkyad.imagecachinglibrarydemo.modules.details;


import com.ajinkyad.imagecachinglibrarydemo.entities.DetailsResponse;

/**
 * This interface is used to declare the Splash Activity Functions to be used/implemented by the Presenter.
 *
 * @author AjinkyaD
 * @version 1.0
 */
interface DetailsPresenter {

    void renderDetails(DetailsResponse currentData);
}
