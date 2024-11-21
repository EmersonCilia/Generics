package Concessionarias;

import Fabrica.*;

public class Tesla implements FabricaDeCarro {
    @Override
    public Carro createSedan() {
        return new Sedan(300, "Elétrico", "Prata");
    }

    @Override
    public Carro createSUV() {
        return new SUV(350, "Elétrico", "Preto");
    }
}

