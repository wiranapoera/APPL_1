package another_type_of_employee;
//********************************************************************
// Commission.java cretaed by: Giusty Fadh Wiranapoera - 191524044
// 2B - D4 Teknik Informatika
// Politeknik Negeri Bandung
//********************************************************************
public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
    }
    
    public void addSales(double totalSales){
        totalSales = totalSales;
    }
    
    @Override
    public double pay(){
        double temp = totalSales * commissionRate;
        totalSales = 0;
        return super.pay() + temp;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}