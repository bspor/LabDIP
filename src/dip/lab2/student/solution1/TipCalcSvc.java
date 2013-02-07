package dip.lab2.student.solution1;

/**
 *
 * @author bspor
 */
//Do I even need this class?
public class TipCalcSvc {
    private TipCalcAbstraction tipCalc;
    

    public TipCalcSvc(TipCalcAbstraction tipCalc) {
        this.tipCalc = tipCalc;
    }

    public double getTip () {
        return tipCalc.getTip();
    }
}
