package com.qfedu.sys.controller;

import com.qfedu.sys.service.AccountService;
import com.qfedu.sys.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsPackage: com.qfedu.sys.controller
 * @ClassName: AccountController
 * @Author: 陈苏洲
 * @Description: 账户Controller
 * @CreateTime: 2024-03-06 16:57
 * @Version: 1.0
 */

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@RequestMapping("transfer")
	@ResponseBody
	@Transactional
	public ResultObj accountTransferController(String inName, String outName, Double money) {
		Integer status = accountService.updateAccountService(inName, outName, money);
		if (status > 0) {
			return ResultObj.STATUS_TRUE;
		} else {
			return ResultObj.STATUS_FALSE;
		}
	}
}
