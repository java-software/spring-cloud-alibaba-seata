package com.storage.service.impl;

import com.storage.dao.StorageDao;
import com.storage.entity.Storage;
import com.storage.service.StorageService;
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
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public void deduct(Long id, int count) {
        log.info("#### 开始扣减库存 ####");
        Storage storage = storageDao.findById(id).get();
        storage.setSurplus(storage.getSurplus() - count);
        storage.setConsume(storage.getConsume() + count);
        storageDao.save(storage);
        log.info("#### 结束扣减库存 ####");
    }
}
