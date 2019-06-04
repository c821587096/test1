package com.seckill.exception;

/**重复秒杀（运行期异常）
 * @author Administrator
 * @title: RepeatKillException
 * @projectName seckill
 * @description: TODO
 * @date 2019/6/115:42
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
