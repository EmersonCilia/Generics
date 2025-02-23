package Concessionarias;

import Fabrica.*;

public class Tesla implements FabricaDeCarro {

    @Override
    public <T extends Automovel> T criaAutomovel(Class<T> tipo) {
        if (tipo.equals(Sedan.class)) {
            return tipo.cast(new Sedan(300, "Elétrico", "Prata"));
        } else if (tipo.equals(SUV.class)) {
            return tipo.cast(new SUV(350, "Elétrico", "Preto"));
        } else {
            throw new IllegalArgumentException("Tipo de carro não suportado: " + tipo.getName());
        }
    }
}