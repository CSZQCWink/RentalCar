package com.qfedu.sys.service.impl;

import com.qfedu.sys.mapper.AccountMapper;
import com.qfedu.sys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongsPackage: com.qfedu.sys.service.impl
 * @ClassName: AccountServiceImpl
 * @Author: 陈苏洲
 * @Description: 账户Service实现
 * @CreateTime: 2024-03-06 16:46
 * @Version: 1.0
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;


	@Override
	public Integer updateAccountService(String inName, String outName, Double money) {
		try {
			// 转入
			accountMapper.transferInMapper(inName,money);
			// 转出
			accountMapper.transferOutMapper(outName,money);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
