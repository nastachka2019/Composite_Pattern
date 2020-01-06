package by.epam.shpakova.parser;

import by.epam.shpakova.entity.Component;
import by.epam.shpakova.entity.ComponentSymbol;
import by.epam.shpakova.entity.ComponentType;
import by.epam.shpakova.entity.CompositText;

import javax.management.openmbean.CompositeType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolParser extends BaseParser {
    private final String SYMBOL_DELIMITER =  ".|(\\u0085)";
    @Override
    public Component parse(String str) {
//        if (getNext() == null) {
//            logger.debug("No next parser");
//        }
        CompositText compositText = new CompositText(ComponentType.SYMBOL);
        Matcher matcher = Pattern.compile(SYMBOL_DELIMITER).matcher(str);  // compile - возвращает объект Pattern, который мы затем можем использовать в программе.
        while (matcher.find()) {                          //переход к след. совпадению в строке
            String expression = matcher.group().trim();  //подходит-добавляем
            compositText.add(getNext().parse(expression));
        }
        return compositText;
    }



//    public Component parse( String str)  {
//        CompositText compositText = new CompositText(ComponentType.SYMBOL);
//
//        for (Character character : str.toCharArray()) {
//            compositText.add(new ComponentSymbol(character));
//        }
//        return compositText;
//    }
}
