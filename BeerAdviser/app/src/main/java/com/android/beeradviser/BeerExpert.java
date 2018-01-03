package com.android.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cleiton on 01/01/2018.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Lager")) {
            brands.add("BUDWEISER");
            brands.add("STELLA ARTOIS");
        } else {
            brands.add("ANTARCTICA");
            brands.add("SKOL");
        }
        return brands;
    }
}
