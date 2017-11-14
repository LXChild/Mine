package com.finup.service;

import com.finup.domain.GirlRepository;
import com.finup.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2016/12/28.
 * @Modified by:
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girl = new Girl();
        girl.setCupSize("A");
        girl.setAge(22);
        girlRepository.save(girl);
        Girl girl2 = new Girl();
        girl2.setCupSize("TT");
        girl2.setAge(21);
        girlRepository.save(girl2);
    }
}
