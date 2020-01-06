package by.epam.shpakova.parser;

import by.epam.shpakova.entity.Component;

public abstract class BaseParser {
    private BaseParser next;           //     сылка на след. парсер в цепочке




    public void setNextParser( BaseParser nextValue) {
        next = nextValue;
    }
    public BaseParser getNext() {
        return next;
    }
    public abstract Component parse(String str);  // ввозвращает компонент, кот. соответствует требованиям
}
