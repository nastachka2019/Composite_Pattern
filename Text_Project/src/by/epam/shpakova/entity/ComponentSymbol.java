package by.epam.shpakova.entity;

import java.util.List;

public class ComponentSymbol implements Component {

    private char symbol;

    public ComponentSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public ComponentType getComponentType() {
        return getComponentType().SYMBOL;
    }

    @Override
    public String allComponents()  {
        return Character.toString(symbol);                      //преобразуем в строк. объект
    }

    @Override
    public List<Component> getComponents() {
        return null;
    }

    @Override
    public void setComponents(List<Component> components) {

    }

}
