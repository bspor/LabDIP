/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author bspor
 */
public interface Tip {

    ServiceQuality getServiceQuality();

    double getTip();

    void setServiceRating(ServiceQuality q);
    
}
