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
        int sum = 0;
        for (Cleanable cleanable : cleanables) {
            int cleanablePrice = cleanable.clean();
            sum += cleanablePrice;
        }
        cleanables.clear();
            return sum;
    }

    public int cleanOnlyOffices() {
        int sum = 0;
        List<Cleanable> cleanedOffices = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if ( cleanable instanceof Office) {
//                Office office = (Office)cleanable;
                int officePrice = cleanable.clean();
                sum += officePrice;
                cleanedOffices.add(cleanable);
            }
        }
        cleanables.removeAll(cleanedOffices);
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> ret = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if(cleanable.getAddress().contains(address)) {
                ret.add(cleanable);
            }
        }
    return ret;
    }

    public String getAddresses() {
        String sum = "";
        for (Cleanable cleanable : cleanables) {
           String address= cleanable.getAddress();
           sum += address + ", ";
        }
        sum = sum.substring(0,sum.length()-2);
        return sum;
    }

}
