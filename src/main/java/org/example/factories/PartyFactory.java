package org.example.factories;

import org.example.Garments;
import org.example.pants.Pants;
import org.example.pants.PartyPants;
import org.example.pants.ProfessionalPants;
import org.example.shirts.PartyShirt;
import org.example.shirts.Tops;
import org.example.shoes.PartyShoes;
import org.example.shoes.Shoes;

public class PartyFactory implements Garments {
    @Override
    public Tops showShirt() {
        return new PartyShirt();
    }

    @Override
    public Pants showPants() {
        return new PartyPants();
    }

    @Override
    public Shoes showShoes() {
        return new PartyShoes();
    }
}
