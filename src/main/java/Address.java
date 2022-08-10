public class Address {
    private String street;
    private Integer number;
    private String city;
    private String region;
    private String country;
    private Integer postalCode;

    public Address(String street, Integer number, String city, String region, String country, Integer postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.region = region;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
