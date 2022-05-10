package by.java_online.module4.simple_class_and_object.task4.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo implements Serializable {
    @Serial
    private static final long serialVersionUID = -613115195023337187L;

    private List<Train> trains;

    {
        trains = new ArrayList<>();
    }

    public Depo() {
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrains(Train train) {
        trains.add(train);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Depo depo = (Depo) o;

        return Objects.equals(trains, depo.trains);
    }

    @Override
    public int hashCode() {
        return trains != null ? trains.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Depo{" +
                "trains=" + trains +
                '}';
    }
}
