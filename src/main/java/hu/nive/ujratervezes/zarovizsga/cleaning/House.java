package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House  implements Cleanable {

    private static final int PRICE_PER_SURFACE = 80;
    private String address;
    private int surface;

    public House(String address, int surface) {
        this.address = address;
        this.surface = surface;
    }

    @Override
    public int clean() {
        return surface * PRICE_PER_SURFACE;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
