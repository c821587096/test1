package com.seckill;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 * @title: test
 * @projectName seckill
 * @description: TODO
 * @date 2019/6/20:29
 */
public class test {


    public static void main(String[] args) {

        Long time = 1559404800000l;
        Date now = new Date(time);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sd.format(now));
    }
}
