package com.account.service.impl;

import com.account.dao.AccountDao;
import com.account.entity.Account;
import com.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void debit(Long userId, int money) {
        log.info("#### 开始扣减余额 ####");
        Account account = accountDao.findById(userId).get();
        account.setBalance(account.getBalance() - money);
        account.setUseTotal(account.getUseTotal() + money);
        accountDao.save(account);
        log.info("#### 结束扣减余额 ####");
    }
}
