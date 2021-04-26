package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CleaningService {

    List<Cleanable> cleanables = new ArrayList<>();


    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(cleanables);
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
        Iterator<Cleanable> i = cleanables.iterator();
        while(i.hasNext()) {
            Cleanable cleanable = i.next();
            if (cleanable.getType() ==BuildingType.OFFICE) {
                sum += cleanable.clean();
                i.remove();
            }
            return sum;
        }
 /*       List<Cleanable> cleanedOffices = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable instanceof Office) {
//                Office office = (Office)cleanable;
                int officePrice = cleanable.clean();
                sum += officePrice;
                cleanedOffices.add(cleanable);
            }
        }
        cleanables.removeAll(cleanedOffices);*/
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> ret = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getAddress().contains(address)) {
                ret.add(cleanable);
            }
        }
        return ret;
    }

    public String getAddresses() {
        if (cleanables.size() == 0) {
            return "";
        }
        String result;
        StringBuilder sb = new StringBuilder();
        for (Cleanable cleanable : cleanables) {
            sb.append(cleanable.getAddress() + ", ");
        }
        result = sb.substring(0, sb.length() - 2);
        return result.toString();
    }

}
