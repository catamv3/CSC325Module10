package org.example.factories;

import org.example.Garments;
import org.example.pants.Pants;
import org.example.pants.ProfessionalPants;
import org.example.shirts.ProfessionalShirt;
import org.example.shirts.Tops;
import org.example.shoes.PartyShoes;
import org.example.shoes.ProfessionalShoes;
import org.example.shoes.Shoes;

public class ProfessionalFactory implements Garments {
    @Override
    public Tops showShirt() {
        return new ProfessionalShirt();
    }

    @Override
    public Pants showPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes showShoes() {
        return new ProfessionalShoes();
    }
}
