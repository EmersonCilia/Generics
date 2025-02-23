package Concessionarias;

import Fabrica.*;

public class BMW implements FabricaDeCarro {
    @Override
    public <T extends Automovel> T criaAutomovel(Class<T> tipo) {
        if (tipo.equals(Sedan.class)) {
            return tipo.cast(new Sedan(250, "Gasolina", "Branco"));
        } else if (tipo.equals(SUV.class)) {
            return tipo.cast(new SUV(300, "Diesel", "Cinza"));
        } else {
            throw new IllegalArgumentException("Tipo de carro não suportado: " + tipo.getName());
        }
    }
}

