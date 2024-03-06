package com.qfedu.sys.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @BelongsPackage: com.qfedu.sys.mapper
 * @ClassName: AccountMapper
 * @Author: 陈苏洲
 * @Description: 账户Mapper
 * @CreateTime: 2024-03-06 16:34
 * @Version: 1.0
 */

public interface AccountMapper {

	// 转入
	void transferInMapper(@Param("name") String name, @Param("money") Double money);

	// 转出
	void transferOutMapper(@Param("name") String name, @Param("money") Double money);

}
