package by.java_online.module5.task5.service;

import by.java_online.module5.task5.bean.Flower;

import java.util.Locale;

public class SimpleFlowerFactory {
    Flower flower;
    FlowersCommand command = FlowersCommand.getInstance();

    public Flower createFlower (String name){
        flower = command.getCommands(name.toLowerCase(Locale.ROOT));
        return flower;
    }
}
