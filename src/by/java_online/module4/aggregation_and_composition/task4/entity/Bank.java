package by.java_online.module4.aggregation_and_composition.task4.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank implements Serializable {
    @Serial
    private static final long serialVersionUID = 9044602202777095327L;

    private String name;
    private List<Customer> customers;

    public Bank(){

    }

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void add(Customer customer) {
        this.customers.add(customer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getClients() {
        return customers;
    }

    public void setClients(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) && Objects.equals(customers, bank.customers);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bank { name = '" + name + '\'' + ", customers = " + customers + '}';
    }
}
