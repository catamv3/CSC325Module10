package org.example;

import org.example.factories.CasualFactory;
import org.example.factories.PartyFactory;
import org.example.factories.ProfessionalFactory;
import org.example.pants.Pants;
import org.example.shirts.Tops;
import org.example.shoes.Shoes;

public class Main {
    public static void main(String[] args) {
        Garments partyFactory = new PartyFactory();
        displayFactory(partyFactory);

        Garments professionalFactory = new ProfessionalFactory();
        displayFactory(professionalFactory);

        Garments casualFactory = new CasualFactory();
        displayFactory(casualFactory);

    }


    public static void displayFactory(Garments garments){
        Tops tops = garments.showShirt();
        Pants pants = garments.showPants();
        Shoes shoes = garments.showShoes();

        tops.printShirtInfo();
        pants.showPantsInfo();
        shoes.showShoeInformation();
    }
}