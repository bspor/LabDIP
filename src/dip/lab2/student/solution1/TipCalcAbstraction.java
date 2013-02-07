/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author bspor
 */
public interface TipCalcAbstraction {

    public abstract ServiceQuality getServiceQuality();

    public abstract double getTip();

    public abstract void setServiceRating(ServiceQuality q);
    
}
