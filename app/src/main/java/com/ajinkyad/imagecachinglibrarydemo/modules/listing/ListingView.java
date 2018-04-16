package com.ajinkyad.imagecachinglibrarydemo.modules.listing;


import com.ajinkyad.imagecachinglibrarydemo.entities.DetailsResponse;
import com.ajinkyad.imagecachinglibrarydemo.modules.common.CommonView;

import java.util.ArrayList;

/**
 * This interface is used to declare the Base Activity Functions to be used/implemented by the Activity.
 *
 * @author AjinkyaD
 * @version 1.0
 */
interface ListingView extends CommonView {

    void renderUserList(ArrayList<DetailsResponse> users);
}
