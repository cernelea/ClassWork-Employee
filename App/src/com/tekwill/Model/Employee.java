package com.tekwill.Model;

public class Employee {

    private ContactInfo contact;
    private String job;
    private double salary;

    public Employee(ContactInfo contact, String job, double salary) {
        this.contact = contact;
        this.job = job;
        this.salary = salary;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return contact.toString() + "\nJob: " + this.job + "\nSalary: " + this.salary;

    }

}
