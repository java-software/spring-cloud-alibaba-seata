package com.account.dao;

import com.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
public interface AccountDao extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {
}
