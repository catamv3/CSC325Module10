package org.example.factories;

import org.example.Garments;
import org.example.pants.CasualPants;
import org.example.pants.Pants;
import org.example.shirts.CasualShirt;
import org.example.shirts.Tops;
import org.example.shoes.CasualShoes;
import org.example.shoes.Shoes;

public class CasualFactory implements Garments{
    @Override
    public Tops showShirt() {
        return new CasualShirt();
    }

    @Override
    public Pants showPants() {
        return new CasualPants();
    }

    @Override
    public Shoes showShoes() {
        return new CasualShoes();
    }
}
