import java.text.DecimalFormat;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h = new Hospital("45278", "Larry Bennington", 5, 'S');
        h.calculateBill();

        System.out.println("The ABC Community Hospital");
        System.out.println("Patient Billing Statement");
        System.out.println("Patient Identification Number: " + h.getPatientID());
        System.out.println("Patient: " + h.getPatientName());
        System.out.println("Number of days: " + h.getNumOfDays());
        System.out.println("\n");
        System.out.println("Type of Room: " + h.getMessage());

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Room charge: $" + decimalFormat.format(h.getCharges()));

        if (h.getRoomType()=='p' || h.getRoomType()=='P') {
            System.out.println("Telephone: " + decimalFormat.format(h.getTelephone()));
            System.out.println("Television: " + decimalFormat.format(h.getTelevision()));
            System.out.println("Medication: " + decimalFormat.format(h.getMedication()*2));
            System.out.println("Total amount due: " + decimalFormat.format(h.getMedication()*2 + h.getTelephone()+h.getTelevision()+h.getCharges()));
        }else if (h.getRoomType()=='s'||h.getRoomType()=='S') {
            System.out.println("Television: "+ decimalFormat.format(h.getTelevision()));
            System.out.println(("Telephone: No Charge"));
            System.out.println("Medication: " + decimalFormat.format(h.getMedication()));
            System.out.println("Total amount due: " + decimalFormat.format(h.getMedication()+h.getTelevision()+h.getCharges()));
        }else if (h.getRoomType()=='w'|| h.getRoomType()=='W') {
            System.out.println("Telephone: No Charge");
            System.out.println("Television: No Charge");
            System.out.println("Medication: " + decimalFormat.format(h.getMedication()/2));
            System.out.println("Total amount due: " + decimalFormat.format(h.getMedication()/2+h.getCharges()));
        }else{
            System.out.println("Invalid Room Type");
        }

    }


}
