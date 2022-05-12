package by.java_online.module5.task5.main;

import by.java_online.module5.task5.bean.Bouquet;
import by.java_online.module5.task5.presentation.View;
import by.java_online.module5.task5.service.ServiceBouquet;

public class Main {
    public static void main(String[] args) {
        int cost;
        ServiceBouquet serviceBouquet = new ServiceBouquet();
        View view = new View();
        Bouquet bouquet = serviceBouquet.orderBouquet();

        view.printBouquet(bouquet);

        cost = serviceBouquet.costBouquet(bouquet);
        view.printCostBouquet(cost);
    }
}
