package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("******Flavors Before********");
        for (Flavor flvr : flavors) {
            System.out.println(flvr.getName());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        // TODO: Print the 'flavors' lists (in a clear manner) to verify the sorting.
        System.out.println("******Flavors After********");
        for (Flavor flvr : flavors) {
            System.out.println(flvr.getName());
        }

        System.out.println("******Cones Before********");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + "  " + cone.getCost());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("******Cones After********");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + "  " + cone.getCost());
        }

    }
}
