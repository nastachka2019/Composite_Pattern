package by.epam.shpakova.parser;

import by.epam.shpakova.entity.Component;
import by.epam.shpakova.entity.ComponentType;
import by.epam.shpakova.entity.CompositText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser extends BaseParser{
    Logger logger = LogManager.getLogger();
    private  final String EXPRESSION_DELIMITER ="\\d*[&^()|<>\\d]*\\d+";

    @Override
    public Component parse(String str) {
//        if (getNext()==null){
//            logger.debug("No next parser");
//        }
        CompositText compositText=new CompositText(ComponentType.EXPRESSION);
        Matcher matcher= Pattern.compile(EXPRESSION_DELIMITER).matcher(str);  // compile - возвращает объект Pattern, который мы затем можем использовать в программе.
        while (matcher.find()) {                          //переход к след. совпадению в строке
            String expression = matcher.group().trim();  //подходит-добавляем
            compositText.add(getNext().parse(expression));
        }
return compositText;
    }
}
