package com.xxl.job.admin.util;

import com.eatthepath.otp.TimeBasedOneTimePasswordGenerator;
import org.apache.commons.codec.binary.Base32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.time.Instant;
import java.util.Objects;

public class SecretKeyUtil {

    private static final Logger logger = LoggerFactory.getLogger(SecretKeyUtil.class);


    public static String generatorSecretKey(){
        try {
            KeyGenerator generator = KeyGenerator.getInstance("HmacSHA1");
            int macLengthInBytes = Mac.getInstance("HmacSHA1").getMacLength();
            generator.init(macLengthInBytes * 8);
            SecretKey secretKey = generator.generateKey();
            return new Base32().encodeAsString(secretKey.getEncoded());
        }catch (Exception e){
            logger.error("生成谷歌验证码失败", e);
            return null;
        }
    }


    public static boolean validateGoogleCodeLogin(String googleCode,String secretKey){
        String currentCode = null;
        try {
            TimeBasedOneTimePasswordGenerator generator = new TimeBasedOneTimePasswordGenerator();
            byte[] decodedKey = new Base32().decode(secretKey);
            currentCode = generator.generateOneTimePasswordString(
                    new SecretKeySpec(decodedKey, 0, decodedKey.length, "HmacSHA1"),
                    Instant.now()
            );
            return Objects.equals(googleCode,currentCode);
        }catch (Exception e){
            logger.error("validateGoogleCodeLogin occur error;googleCode={},currentCode={},secretKey={}",googleCode,currentCode,secretKey,e);
            return false;
        }
    }

    public static void main(String[] args) throws InvalidKeyException {

//        System.out.println(generatorSecretKey());
//        String secretKey = "A356HCI4BKDHON7JP7YSXFMYC3ZUR2DC";
//        TimeBasedOneTimePasswordGenerator generator = new TimeBasedOneTimePasswordGenerator();
//        byte[] decodedKey = new Base32().decode(secretKey);
//        String currentCode = generator.generateOneTimePasswordString(
//                new SecretKeySpec(decodedKey, 0, decodedKey.length, "HmacSHA1"),
//                Instant.now());
//        System.out.println(currentCode);
        try {
            System.out.println(new String("穀歌驗證碼必須6數位".getBytes("UTF-8"),"ISO8859-1"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
