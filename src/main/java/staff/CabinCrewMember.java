package staff;

public abstract class CabinCrewMember{

    private String name;
    private CabinCrewRank cabinCrewRank;

    public CabinCrewMember(String name, CabinCrewRank cabinCrewRank) {
        this.name = name;
        this.cabinCrewRank = cabinCrewRank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewRank getCabinCrewRank() {
        return cabinCrewRank;
    }

    public String relayMessage(String message){
        return "Get ready for " + message;
    }

}
