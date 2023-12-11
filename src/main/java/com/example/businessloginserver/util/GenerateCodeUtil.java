package com.example.businessloginserver.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class GenerateCodeUtil {
    private GenerateCodeUtil(){}

    public static String generateCode(){
        String code;
        try{
            SecureRandom random=SecureRandom.getInstanceStrong();
            code =String.valueOf(random.nextInt(9000)+1000);//for 4 digit random code
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("Problem when generating the random code.");
        }
        return code;
    }
}
