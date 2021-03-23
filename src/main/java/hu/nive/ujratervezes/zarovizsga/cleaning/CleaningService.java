package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CleaningService {

    List<Cleanable> cleanables = new ArrayList<>();



    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }

    public int cleanAll() {
        return 0;
    }

    public int cleanOnlyOffices() {
        int sum = 0;
        for (Cleanable cleanable : cleanables) {
            if ( cleanable.equals(CleanableType.OFFICE)) {
                int officePrice = cleanable.clean();
                sum += officePrice;

            }
        }
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> ret = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if(cleanable.getAddress().equals(address)) {
                ret.add(cleanable);
            }
        }
    return ret;
    }

    public String getAddresses() {
        return null;

    }

}
