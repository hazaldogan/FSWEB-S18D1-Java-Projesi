package com.workintech.s18d1.utils;

import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {
    public static void checkName(String name){
        if(name == null || name.isEmpty()){
            throw new BurgerException("Nameis null or empty!", HttpStatus.BAD_REQUEST);
        }
    }
}
