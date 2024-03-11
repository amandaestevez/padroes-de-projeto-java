package padroesprojetojava.Strategy;

import one.digitalinnovation.gof.strategy.Robo;
public class TestRobo {
    public static void main(String[] args) {

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
    }

}
