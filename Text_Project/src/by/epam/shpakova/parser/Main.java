package by.epam.shpakova.parser;

import by.epam.shpakova.exception.DataReaderException;
import by.epam.shpakova.reader.Reader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws DataReaderException {
       ParagraphParser paragraphParser = new ParagraphParser();
       Reader reader = new Reader();
       System.out.println(paragraphParser.parse(reader.readData("H:\\ПОСЛЕДНЯЯ ВЕРСИЯ\\Text_Project\\data\\input.txt")));
     //   ExpressionParser expressionParser = new ExpressionParser();
  //LexemeParser lexemeParser=new LexemeParser();
   //   System.out.println(lexemeParser.parse(reader.readData("E:\\HTP14\\Home_work_2\\Text_Project\\data\\input.txt")));
WordParser wordParser=new WordParser();
        System.out.println(wordParser.parse(reader.readData("H:\\ПОСЛЕДНЯЯ ВЕРСИЯ\\Text_Project\\data\\input.txt")));

String str =    "It has survived - not only (five) centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the  (Рига) with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including versions of Lorem Ipsum!"+
                "It is a long a!=b established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here), content here's, making it look like readable English?"+
        "It is a established fact that a reader will be of a page when looking at its layout..."+
        "Bye бандерлоги.";
//
//        String PARAGRAPH_DELIMITER = "\\d*[&^()|<>\\d]*\\d+";
//        Matcher matcher = Pattern.compile(PARAGRAPH_DELIMITER).matcher(str);
//        while (matcher.find()) {                          //переход к след. совпадению в строке
//
//            System.out.println(matcher.group());
//        }

//SymbolParser symbolParser=new SymbolParser();
//        System.out.println(symbolParser.parse(reader.readData("E:\\HTP14\\Home_work_2\\Text_Project\\data\\input.txt")));
    }
}
