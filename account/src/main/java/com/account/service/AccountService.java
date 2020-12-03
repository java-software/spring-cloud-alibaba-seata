package com.account.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
public interface AccountService {
    void debit(Long userId, int money);
}
