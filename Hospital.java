public class Hospital {
    static final double RoomType_p=550.0,
                        RoomType_s=350.0,
                        RoomType_w=105.0;

    private String patientID;
    private String patientName;
    private int numOfDays;
    private double roomPrice;
    private double telephone = 4.50;
    private double television = 7.50;
    private char roomType;
    String message;
    double Charges;
    private double medication = 275;

    public Hospital(String PID, String name, int numberOfDays, char RoomType){
        patientID=PID;
        patientName=name;
        numOfDays=numberOfDays;
        this.roomType=RoomType;
    }

    public char getRoomType() {
        return roomType;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName(){
        return patientName;
    }

    double getCharges() {
        return Charges;
    }

    int getNumOfDays(){
        return numOfDays;
    }

    String getMessage(){
        return message;
    }

    public double getTelephone() {
        return telephone;
    }

    public double getTelevision() {
        return television;
    }
    public double getMedication(){return medication;}

    void calculateBill(){
        switch (roomType) {
            case 'p': case 'P':
                message = "Private";
                roomPrice = RoomType_p;
                Charges = (RoomType_p * numOfDays);
                break;

            case 's':case 'S':
                message = "Semi-Private";
                roomPrice = RoomType_s;
                Charges = (RoomType_s * numOfDays);
                break;

            case 'w':case 'W':
                message = "Ward";
                roomPrice = RoomType_w;
                Charges = (RoomType_w * numOfDays);
                break;

            default:
                message="Room type does not exist";
                Charges=0;
                break;
        }
    }
}
