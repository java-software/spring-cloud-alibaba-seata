package com.storage.dao;

import com.storage.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
public interface StorageDao extends JpaRepository<Storage, Long>, JpaSpecificationExecutor<Storage> {
}
