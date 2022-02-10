package com.vladgoncharov.spring.mvc;


import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 3,max = 5,message = "Количество букв должно быть от 3 до 5!!!")
    private String name;
    @NotBlank(message = "Пуле должно быть не пустым!!!")
    private String surname;
    @Min(value = 555,message = ">=555")
    @Max(value = 1555,message = "<=1555")
    private int salary;
    private String department;
    private Map<String,String> departments = new HashMap<>();
    private String car;
    private Map<String,String> carBrand = new HashMap<>();
    private  String[] language;
    @Pattern(regexp = "\\+\\d{11}",message = "pattern +X XXX XXX XX XX")
    private String phoneNumber;
    @CheckEmail
    private String email;

    public Employee() {
        departments.put("Officer" ,"Army");
        departments.put("Sales" ,"Sales");
        departments.put("International Technology" ,"IT");

        carBrand.put("BMW","BMW");
        carBrand.put("Audi","Audi");
        carBrand.put("Mercedes-Benz","MB");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Map<String, String> getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(Map<String, String> carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
