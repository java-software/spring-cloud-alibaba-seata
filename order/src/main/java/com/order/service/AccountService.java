package com.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
@Component
@FeignClient("account-server")
public interface AccountService {
    // 扣减余额
    @PostMapping("/account/debit")
    void debit(@RequestParam("userId") Long userId, @RequestParam("money") Integer money);
}
