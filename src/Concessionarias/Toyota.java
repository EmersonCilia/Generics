package Concessionarias;

import Fabrica.*;

public class Toyota implements FabricaDeCarro {
    @Override
    public <T extends Automovel> T criaAutomovel(Class<T> tipo) {
        if (tipo.equals(Sedan.class)) {
            return tipo.cast(new Sedan(140, "Híbrido", "Vermelho"));
        } else if (tipo.equals(SUV.class)) {
            return tipo.cast(new SUV(180, "Gasolina", "Branco"));
        } else if (tipo.equals(Caminhao.class)) {
            return tipo.cast(new Caminhao(450, "Diesel", "Azul"));
        }else {
            throw new IllegalArgumentException("Tipo de carro não suportado: " + tipo.getName());
        }
    }
}
