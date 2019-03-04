package com.luckyxs.service.impl;

import com.luckyxs.dao.ScMapper;
import com.luckyxs.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
@Service
@Transactional
public class ScServiceImpl implements ScService {

    @Autowired
    private ScMapper scMapper;

}
