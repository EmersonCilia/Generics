package Concessionarias;

import Fabrica.*;

public class BMW implements FabricaDeCarro {
    @Override
    public Carro createSedan() {
        return new Sedan(250, "Gasolina", "Branco");
    }

    @Override
    public Carro createSUV() {
        return new SUV(300, "Diesel", "Cinza");
    }
}

