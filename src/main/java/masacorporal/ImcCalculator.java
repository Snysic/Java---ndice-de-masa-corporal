package masacorporal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ImcCalculator {
     public double imcCalc(CorporalMass corporalMass){

        double kg = corporalMass.getKilograms();
        double hg = corporalMass.getHeight();

        Double calcImc= kg/ Math.pow(hg, hg);
        BigDecimal bigDecimal = new BigDecimal(calcImc);
        BigDecimal roundUp = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        return roundUp.doubleValue();
    }
}
