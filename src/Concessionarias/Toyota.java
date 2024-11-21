package Concessionarias;

import Fabrica.*;

public class Toyota implements FabricaDeCarro {
    @Override
    public Carro createSedan() {
        return new Sedan(140, "Híbrido", "Vermelho");
    }

    @Override
    public Carro createSUV() {
        return new SUV(180, "Gasolina", "Branco");
    }
}
