package by.java_online.module5.task4.service;

import by.java_online.module5.task4.bean.Treasure;

import java.util.List;

public interface TreasureService {

    List <Treasure> getListTreasure() throws ServiceException;

    Treasure mostExpensive() throws ServiceException;

    int cost(List<Treasure> treasureList) throws ServiceException;

    List<Treasure> selectionTreasure(int worth) throws ServiceException;
}
