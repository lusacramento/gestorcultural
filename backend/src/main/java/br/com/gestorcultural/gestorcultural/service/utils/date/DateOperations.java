package br.com.gestorcultural.gestorcultural.service.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOperations {
    private static String pattern = "dd/MM/yyyy";
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    public static Date stringToDate(String date) throws ParseException {
        return simpleDateFormat.parse(date);
    }

    public static String dateToString(Date date){
        return simpleDateFormat.format(date);
    }
}
