package by.epam.shpakova.reader;

import by.epam.shpakova.exception.DataReaderException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {
    public String readData(String filePath) throws DataReaderException {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                sb.append(str);
                sb.append("\n");
            }
        } catch (IOException e) {
            throw new DataReaderException("No file! ", e);
        }
        return sb.toString();
    }
}
