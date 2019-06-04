package com.seckill.entity;

import java.util.Date;
import java.util.Objects;

/**
 * @author Administrator
 * @title: SuccessKilled
 * @projectName seckill
 * @description: TODO
 * @date 2019/5/3123:42
 */
public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private short state;
    private Date createTime;
private Seckill seckill;
    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                ", seckill=" + seckill +
                '}';
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuccessKilled)) return false;
        SuccessKilled that = (SuccessKilled) o;
        return seckillId == that.seckillId &&
                userPhone == that.userPhone &&
                state == that.state &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(seckill, that.seckill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seckillId, userPhone, state, createTime, seckill);
    }
}
