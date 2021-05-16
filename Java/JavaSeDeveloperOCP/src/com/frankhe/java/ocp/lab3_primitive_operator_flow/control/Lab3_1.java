package com.frankhe.java.ocp.lab3_primitive_operator_flow.control;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lab3_1 {

    public void string_test(){
        String teaTxt = "Tea";
        String b = "Tea";
        System.out.println (teaTxt == b);

        String c = new String("Tea");
        System.out.println (c == b);

        String d = c.intern();
        System.out.println (c == d);
        System.out.println (b == d);                        //Important


        c = teaTxt + ' ' + b;
        System.out.println(c);
        System.out.println(c.indexOf('T'));
        System.out.println(c.indexOf('T', 1));
        System.out.println(c.lastIndexOf('T'));
        System.out.println(c.charAt(c.length() -1) );
        System.out.println(c.substring(c.lastIndexOf("T"), c.lastIndexOf("T") + 2 ));

        System.out.println(c.toUpperCase());                //New instance
        c  = c.toLowerCase();                               //reassign c
    }

    public void string_builder_test(){
        StringBuilder txt = new StringBuilder("TEA TEA");
        System.out.println(txt.length());
        System.out.println(txt.capacity());                 //Capacity is bigger than length and will expand as necessary
        System.out.println(txt.replace(0,3, "What is the price of"));
        System.out.println(txt.length());
        System.out.println(txt.capacity());                 //Capacity is bigger than length and will expand as necessary
    }

    public void bigDecimal_test(){
        double price = 1.85;
        System.out.println(price);
        double rate = 0.065;
        price -= price * rate;
        System.out.println(price);
        price = Math.round(price * 100)/100.0;
        System.out.println(price);

        BigDecimal price_BigDecimal = BigDecimal.valueOf(1.85);
        System.out.println(price_BigDecimal);
        BigDecimal rate_BigDecimal = BigDecimal.valueOf(0.065);
        System.out.println(rate_BigDecimal);

        System.out.println(price_BigDecimal.multiply(rate_BigDecimal));
        System.out.println(price_BigDecimal.multiply(rate_BigDecimal).setScale(2, RoundingMode.HALF_UP));
    }
    public void format_test(){
        BigDecimal price_BigDecimal = BigDecimal.valueOf(1.85);
        System.out.println(price_BigDecimal);
        BigDecimal rate_BigDecimal = BigDecimal.valueOf(0.065);
        System.out.println(rate_BigDecimal);


        Locale locale = Locale.FRANCE;
        System.out.println(locale);


        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        System.out.println(currencyFormat.format(price_BigDecimal));
        System.out.println(percentFormat.format(rate_BigDecimal));

        locale = Locale.UK;

        NumberFormat currencyFormat_uk = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat_uk = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
        System.out.println(currencyFormat_uk.format(price_BigDecimal));
        System.out.println(percentFormat_uk.format(rate_BigDecimal));


    }

    public void dateTime_test(){
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plusYears(1).getDayOfWeek());

        LocalTime teaTime = LocalTime.of(17,30);
        System.out.println(teaTime);
        Duration timeGap = Duration.between(LocalTime.now(), teaTime);
        System.out.println(timeGap);
        System.out.println(timeGap.toMinutes());                                                //otherwise PT3H2M21.3259423S
        System.out.println(timeGap.toMinutesPart());                                            //Minutes pass hours
        System.out.println(timeGap.toHours());
        System.out.println(timeGap.toDays());
        System.out.println(Duration.between(LocalTime.now(), LocalTime.of(0,2)));   //value can be negative!


        LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
        System.out.println(tomorrowTeaTime);
    }

    public void zone_test(){
        LocalTime teaTime = LocalTime.of(17,30);
        LocalDateTime tomorrowTeaTime = LocalDateTime.of(LocalDate.now().plusDays(1), teaTime);
        System.out.println(tomorrowTeaTime);
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId katmandu = ZoneId.of("Asia/Katmandu");

        ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
        System.out.println(londonTime);
        ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
        System.out.println(katmanduTime);
        System.out.println(katmanduTime.getOffset());
    }

    public void dateTime_formatter_test(){
        LocalTime teaTime = LocalTime.of(17,30);
        LocalDateTime tomorrowTeaTime = LocalDateTime.of(LocalDate.now().plusDays(1), teaTime);
        System.out.println(tomorrowTeaTime);
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
        ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);


        String datePatter = "EE', 'd', of 'MMM yyyy' at 'HH:mm z";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePatter);
        String timeTxt = dateFormat.format(katmanduTime);
        System.out.println(timeTxt);


    }

    public static void main(String [] args){
        Lab3_1 lab3_1 = new Lab3_1();
        System.out.println("-------String-----------");
        lab3_1.string_test();

        System.out.println("-------String Builder----------");
        lab3_1.string_builder_test();

        System.out.println("-------Big Decimal----------");
        lab3_1.bigDecimal_test();

        System.out.println("-------Format----------");
        lab3_1.format_test();


        System.out.println("-------DateTime----------");
        lab3_1.dateTime_test();

        System.out.println("-------Zone----------");
        lab3_1.zone_test();

        System.out.println("-------DateTimeFormatter----------");
        lab3_1.dateTime_formatter_test();


    }
}
