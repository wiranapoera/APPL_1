package another_type_of_employee;
//********************************************************************
// Volunteer.java Author: Lewis/Loftus
//
// Represents a staff member that works as a volunteer.
// Volunteer.java Edited by: Giusty Fadh Wiranapoera - 191524044
// 2B - D4 Teknik Informatika
// Politeknik Negeri Bandung
//********************************************************************
public class Volunteer extends StaffMember{
    //-----------------------------------------------------------------
    // Sets up a volunteer using the specified information.
    //-----------------------------------------------------------------
    public Volunteer (String eName, String eAddress, String ePhone){
        super (eName, eAddress, ePhone);
    }
    //-----------------------------------------------------------------
    // Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    public double pay(){
        return 0.0;
    }
}