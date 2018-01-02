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
            brands.add("Cerveja 1");
            brands.add("Cerveja 2");
        } else {
            brands.add("Cerveja 3");
            brands.add("Cerveja 4");
        }
        return brands;
    }
}
