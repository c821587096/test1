package com.seckill.exception;

/**秒杀关闭异常
 * @author Administrator
 * @title: SeckillCloseException
 * @projectName seckill
 * @description: TODO
 * @date 2019/6/115:50
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
