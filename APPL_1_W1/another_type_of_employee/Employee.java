package another_type_of_employee;
//********************************************************************
// Employee.java Author: Lewis/Loftus
//
// Represents a general paid employee.
// Employee.java Edited by: Giusty Fadh Wiranapoera - 191524044
// 2B - D4 Teknik Informatika
// Politeknik Negeri Bandung
//********************************************************************
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;
    //-----------------------------------------------------------------
    // Sets up an employee with the specified information.
    //-----------------------------------------------------------------
    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super (eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    //-----------------------------------------------------------------
    // Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString(){
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
    //-----------------------------------------------------------------
    // Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay(){
        return payRate;
    }
}