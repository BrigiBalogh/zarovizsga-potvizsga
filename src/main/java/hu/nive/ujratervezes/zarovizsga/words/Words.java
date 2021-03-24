package hu.nive.ujratervezes.zarovizsga.words;

public class Words {


    public boolean hasMoreDigits(String s) {

        int digitCount =0;
        int charCount =0;


        for (char c: s.toCharArray()) {
            if (c >= '1' && c <= '9') {
                digitCount++;
            }else {
                charCount++;
            }
        }

        // return digitCount > charCount;
        if (digitCount > charCount) {
            return true;
        } else {
            return false;
        }

    }
}
