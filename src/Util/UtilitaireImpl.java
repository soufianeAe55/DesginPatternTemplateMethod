package Util;

public class UtilitaireImpl extends Utilitaire {
    @Override
    protected double filtre1(String str) {
        return Math.pow(str.length(),4);
    }

    @Override
    protected double filtre2(double d) {

        return  d*2;
    }
}
