package com.seckill.enums;

/**使用枚举表述常量数据字段
 * @author Administrator
 * @title: SeckillStateEnum
 * @projectName seckill
 * @description: TODO
 * @date 2019/6/116:45
 */
public enum  SeckillStateEnum {
    REPEAT_KILL(-1,"重复秒杀"),
    INNER_ERROR(-2,"系统异常"),
    DATA_REWRITE(-3,"数据篡改"),
    END(0,"秒杀结束"),
    SUCCESS(1,"秒杀成功");

    private int state;
    private String stateInfo;

     SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
    public static SeckillStateEnum stateOf(int index) {
        for (SeckillStateEnum state : values()
        ) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
