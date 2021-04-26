package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House  implements Cleanable {

    private static final int PRICE_PER_SURFACE = 80;
    private String address;
    private int surface;
    private BuildingType type = BuildingType.HOUSE;

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

    public static int getPricePerSurface() {
        return PRICE_PER_SURFACE;
    }

    public int getSurface() {
        return surface;
    }

    public BuildingType getType() {
        return type;
    }
}
