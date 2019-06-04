package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

import java.util.List;

public interface SeckillService {
    //查询所有秒杀记录
    List<Seckill> getSeckillList();

    //查询一个
    Seckill getById(long seckillId);

    //输出秒杀接口地址
    //否则输出系统时间和秒杀时间
    Exposer exportSeckillUrl(long seckillId);

    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, SeckillCloseException, RepeatKillException;
}
