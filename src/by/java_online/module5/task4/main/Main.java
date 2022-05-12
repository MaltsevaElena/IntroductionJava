package by.java_online.module5.task4.main;

import by.java_online.module5.task4.bean.Cave;
import by.java_online.module5.task4.bean.Treasure;
import by.java_online.module5.task4.dao.DAOException;
import by.java_online.module5.task4.dao.DAOProvider;
import by.java_online.module5.task4.presentation.View;
import by.java_online.module5.task4.service.ServiceException;
import by.java_online.module5.task4.service.TreasureService;
import by.java_online.module5.task4.service.impl.ServiceTreasureImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) throws DAOException, ServiceException {
        int sum;
        List<Treasure> treasureWorth;
        DAOProvider daoProvider = DAOProvider.getInstance();
        TreasureService treasureService = new ServiceTreasureImpl();

        Cave caveTreasure = new Cave(daoProvider.getTreasureDAO().readFile());

        System.out.println("Все сокровища: ");
        View.showTreasure(caveTreasure.getTreasureList());

        System.out.println("Самое дорогое сокровище: ");
        Treasure mostExpensive = treasureService.mostExpensive();
        View.showTreasure(mostExpensive);

        sum = 550;
        System.out.println("Сокровища на сумму не более " + sum + ":");
        treasureWorth = treasureService.selectionTreasure(sum);
        View.showTreasure(treasureWorth);
        System.out.println("Итого: " + treasureService.cost(treasureWorth));
    }
}
