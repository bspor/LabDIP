package dip.lab2.student.solution1;
/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @bspor
 */
public class BaggageServiceTipCalculator implements TipCalcAbstraction {
    //Variables
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    private static final double baseTipPerBag = 0.5; //made this final 
    private int bagCount;
    private ServiceQuality serviceQuality;
    
    //Constructor 
    public BaggageServiceTipCalculator(ServiceQuality q, double bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);
    }

    //Method to be enforced via an interface
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(double bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = (int) bagCount; //Cast to int because you cant have fractions of a bag
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }
}
