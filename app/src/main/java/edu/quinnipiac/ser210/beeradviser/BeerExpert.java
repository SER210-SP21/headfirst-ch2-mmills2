package edu.quinnipiac.ser210.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Mouse");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }

}
