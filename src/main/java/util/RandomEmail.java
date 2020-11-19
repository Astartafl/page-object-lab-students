package util;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmail {
    public static String generateEmail(){
        return RandomStringUtils.random(10, true, false);


    }
}
