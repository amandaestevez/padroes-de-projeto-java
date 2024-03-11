package padroesprojetojava.Strategy;

import padroesprojetojava.Strategy.Robo;
import padroesprojetojava.Strategy.ComportamentoAgressivo;
import padroesprojetojava.Strategy.ComportamentoDefensivo;
import padroesprojetojava.Strategy.ComportamentoNormal;

public class TestRobo {
    public static void main(String[] args) {

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();
    }

}
