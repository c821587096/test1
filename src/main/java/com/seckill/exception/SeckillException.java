package com.seckill.exception;

/**秒杀相关业务异常
 * @author Administrator
 * @title: SeckillException
 * @projectName seckill
 * @description: TODO
 * @date 2019/6/115:52
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
