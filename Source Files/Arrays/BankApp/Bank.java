import java.util.ArrayList;

public class Bank {

    private ArrayList<BranchLocation> branchLocations = new ArrayList<BranchLocation>();

    public void addBranchLocation(String branchLocationName) {
        branchLocations.add(BranchLocation.createBranchLocation(branchLocationName));
    }

    public void addBranchLocation(BranchLocation branchLocation) {
        branchLocations.add(branchLocation);
    }



}
