package by.java_online.module5.task4.dao;

import by.java_online.module5.task4.bean.Treasure;

import java.util.List;

public interface TreasureDAO {

    List<Treasure> readFile() throws DAOException;

}
