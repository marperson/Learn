package com.frankhe.java.ocp.lab3_primitive_operator_flow.control;

import java.security.MessageDigestSpi;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Lab3_2 {
    public void resource_test_1(){
        Locale locale = Locale.UK;
        ResourceBundle msg = ResourceBundle.getBundle("com.frankhe.java.ocp.lab3_primitive_operator_flow.control." +
                "resource.messages", locale);
// can place in the same folder
//        ResourceBundle msg = ResourceBundle.getBundle("messages", locale);

        String offerPattern  = msg.getString("offer");
        System.out.println(offerPattern);
        String teaTxt = "Tea";
        String priceTxt = "1.73";
        String rateTxt = "6.5%";
        String timeTxt = "Fri, 19 of June 2020 at 22:15 NPT";
        System.out.println(teaTxt);
        System.out.println(MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, timeTxt));
    }

    public void resource_test_2(){
        Locale locale = new Locale("ru", "RU");
        ResourceBundle msg = ResourceBundle.getBundle("com.frankhe.java.ocp.lab3_primitive_operator_flow.control." +
                "resource.messages_RU", locale);

        String offerPattern = msg.getString("offer");
        String datePattern = msg.getString("dateFormat");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        percentFormat.setMaximumFractionDigits(2);
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM).localizedBy(locale);   //What is properate for locale format

        String teaTxt = "茶";
        double price = 1.99;
        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = ZonedDateTime.of(LocalDateTime.now(), london);
        String priceTxt = currencyFormat.format(price);
        double rate = 0.09;
        String rateTxt = percentFormat.format(rate);
        String timeTxt = dateFormat.format(londonTime);

        System.out.println(MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, timeTxt));
    }
    public static void main(String [] args){
        Lab3_2 lab3_2 = new Lab3_2();
        lab3_2.resource_test_1();
        lab3_2.resource_test_2();
    }
}
