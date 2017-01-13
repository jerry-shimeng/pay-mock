package com.ifenqu.test.mock.pay.common;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by shi on 6/13/2016.
 */
public class SecurityHelper {

    public static String toSHA1(String convert) {
        return DigestUtils.sha1Hex(convert);
    }

    public static String toMd5(String convert) {
        return DigestUtils.md5Hex(convert);
    }


}
