package vn.edu.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;

import java.io.Serializable;

public class Address implements Serializable {

    private long addId;
    private String city;
    private CountryCode country;
    private String zipcode;
    private String street;

    private Candidate candidate;
    private String number;

    private Company company;

    public Address(long id, String city, CountryCode country, String zipcode, String street, String number) {
        this.addId = id;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
        this.street = street;
        this.number = number;
    }

    public Address() {

    }

    public long getAddId() {
        return addId;
    }

    public void setAddId(long addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryCode getCountry() {
        return country;
    }

    public void setCountry(CountryCode country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
