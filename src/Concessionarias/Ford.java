package Concessionarias;

import Fabrica.*;

public class Ford implements FabricaDeCarro {
    @Override
    public <T extends Automovel> T criaAutomovel(Class<T> tipo) {
        if (tipo.equals(Sedan.class)) {
            return tipo.cast(new Sedan(150, "Gasolina", "Azul"));
        } else if (tipo.equals(SUV.class)) {
            return tipo.cast(new SUV(200, "Diesel", "Preto"));
        } else if (tipo.equals(Caminhao.class)) {
            return tipo.cast(new Caminhao(500, "Diesel", "Amarelo"));
        }else {
            throw new IllegalArgumentException("Tipo de carro não suportado: " + tipo.getName());
        }
    }
}

