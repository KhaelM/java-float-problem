/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatproblem;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author miker
 */
public class FloatProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigDecimal a = new BigDecimal(140.75);
        BigDecimal b = new BigDecimal(4.41);
        System.out.println(a.multiply(b).setScale(2, RoundingMode.HALF_UP));
    }
    
}
