package br.com.gestorcultural.gestorcultural.service.utils.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationsTest {

    private Date date;

    @BeforeEach
    void setUp() throws ParseException {
        this.date = DateOperations.stringToDate("31/05/2023");

    }

  @Test
   void stringToDate(){
      assertEquals("31/05/2023", DateOperations.dateToString(date));

   }
}