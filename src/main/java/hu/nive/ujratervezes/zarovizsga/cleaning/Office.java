package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    private static int PRICE_PER_SURFACE = 100;
    private String address;
    private int surface;
    private int story;

    public Office(String address, int surface, int story) {
        this.address = address;
        this.surface = surface;
        this.story = story;
    }

    @Override
    public int clean() {
        return surface  *= PRICE_PER_SURFACE * story;
    }

    @Override
    public String getAddress() {
        return address ;
    }
}
