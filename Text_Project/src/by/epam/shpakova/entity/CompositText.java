package by.epam.shpakova.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompositText implements Component {
    private static final Logger logger = LogManager.getLogger();
    private ComponentType componentType;

    private List<Component> components = new ArrayList<>();

    public CompositText(ComponentType componentType) {
        this.componentType = componentType;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public String allComponents() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Component component : this.components) {
            switch (componentType) {
                case TEXT:
                    stringBuilder.append("\t").append((component.allComponents()));  // табуляция, добавляем ко всем компонентам
                case PARAGRAPH:
                    stringBuilder.append("\t").append(component.allComponents());  // добавляем 4 пробела, добавляем ко всем компонентам
                case SENTENCE: stringBuilder.append(
                        component.allComponents());
                  case  WORD: stringBuilder.append(
                        component.allComponents());
                case   EXPRESSION:stringBuilder.append(component.allComponents());

                case SYMBOL:stringBuilder.append(component.allComponents());

                case LEXEME:
                    stringBuilder.append(component.allComponents()).append(" ");   // отделяем пробелом
                default: logger.error("Unknown type of component");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void setComponents(List<Component> components) {
        this.components = components;
    }
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {      //проверили объект на нал и что бы объекты были одного типа
            return false;
        }

        CompositText compositText = (CompositText) object; // // объявили перемен.,кот. сравн-ем и привели к этому типу обджект.

        if (Objects.equals(components, compositText.components)) {
            return true;
        }
        return componentType == compositText.componentType;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result;
        if (components != null) {
            result = components.hashCode();
        } else {
            result = 0;
        }
        if (componentType != null) {
            result = PRIME * result + componentType.hashCode();
        } else {
            result = PRIME * result;
        }
        return result;
    }

}
