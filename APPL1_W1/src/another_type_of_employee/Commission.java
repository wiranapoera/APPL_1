/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another_type_of_employee;

/**
 *
 * @author giust
 */
//********************************************************************
// Commission.java Author: Giusty Fadh Wiranapoera
//                         2B - D4 Teknik Informatika | Politeknik Negeri Bandung
//********************************************************************
public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
    }
    
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay(){
        double count = totalSales * commissionRate;
        totalSales = 0;
        return super.pay() + count;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}