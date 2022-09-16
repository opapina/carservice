package com.solvd.carservice.client;
import com.solvd.carservice.price.DiscountProgram;
import com.solvd.carservice.vehicle.Car;

import java.time.LocalDate;
import java.util.List;

public class Client {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private LocalDate registrationDate;
    private DiscountProgram discountProgram;
    private List<Car> cars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public DiscountProgram getDiscountProgram() {
        return discountProgram;
    }

    public void setDiscountProgram(DiscountProgram discountProgram) {
        this.discountProgram = discountProgram;
    }
}
