package by.java_online.module4.simple_class_and_object.task10.logic;
/* Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import by.java_online.module4.simple_class_and_object.task10.entity.Airline;
import by.java_online.module4.simple_class_and_object.task10.entity.DayOfWeek;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineLogic {

    public static List<Airline> destinationAirline(String destination, List<Airline> airlines) {
        List<Airline> destinationAirline = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                destinationAirline.add(airline);
            }
        }
        return destinationAirline;
    }

    public static List<Airline> dayOfWeekAirline(DayOfWeek day, List<Airline> airlines) {
        List<Airline> dayOfWeekAirline = new ArrayList<>();
        for (Airline airline : airlines) {
            if (Objects.equals(airline.getDayOfWeek(), day)) {
                dayOfWeekAirline.add(airline);
            }
        }
        return dayOfWeekAirline;
    }

    public static List<Airline> dayOfWeekAirlineAndTime(DayOfWeek day, LocalTime time, List<Airline> airlines) {
        int timeOne = time.getHour() * 60 + time.getMinute();
        int timeTwo;
        List<Airline> dayOfWeekAirlineAndTime = new ArrayList<>();
        List<Airline> dayOfWeekAirline = dayOfWeekAirline(day, airlines);
        for (Airline airline : dayOfWeekAirline) {
            timeTwo = airline.getDepartureTime().getHour() * 60 + airline.getDepartureTime().getMinute();
            if (timeTwo > timeOne) {
                dayOfWeekAirlineAndTime.add(airline);
            }
        }
        return dayOfWeekAirlineAndTime;
    }
}
