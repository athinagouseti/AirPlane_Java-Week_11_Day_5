package staff;

public class Pilot extends CabinCrewMember{
    private String licenceNumber;

    public Pilot(String name, CabinCrewRank cabinCrewRank, String licenceNumber) {
        super(name, cabinCrewRank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane(){
        return "Flying the plane";
    }
}
