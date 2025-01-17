package com.ebanking.validator;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class EmailValidator {

    private static final String PASSWORD_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

    public static boolean isValidEmail(String email) {

        Pattern pattern = Pattern.compile(PASSWORD_REGEX);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
