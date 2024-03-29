package com.qfedu.sys.constant;

/**
 * @BelongsPackage: com.qfedu.sys.constant
 * @ClassName: SysConstant
 * @Author: 陈苏洲
 * @Description: 系统常量
 * @CreateTime: 2024-03-06 16:01
 * @Version: 1.0
 */

public interface SysConstant {

	//用户登录相关常量
	String USER_LOGIN_ERROR_MSG = "用户名或密码错误";
	String USER_LOGIN_CODE_ERROR_MSG = "验证码不正确";

	/**
	 * 可用状态常量
	 */
	Integer AVAILABLE_TRUE = 1; // 可用
	Integer AVAILABLE_FALSE = -1; // 不可用

	/**
	 * 用户类型
	 */
	Integer USER_TYPE_SUPER = 1;  //超级管理员
	Integer USER_TYPE_NORMAL = 2; //普通用户

	/**
	 * 是否展开
	 */
	Integer SPREAD_TRUE = 1; //展开
	Integer SPREAD_FALSE = -1;//不展开

	/**
	 * 操作状态
	 */
	String ADD_SUCCESS = "添加成功";
	String ADD_ERROR = "添加失败";

	String UPDATE_SUCCESS = "修改成功";
	String UPDATE_ERROR = "修改失败";

	String DELETE_SUCCESS = "删除成功";
	String DELETE_ERROR = "删除失败";

	String RESET_SUCCESS = "重置成功";
	String RESET_ERROR = "重置失败";

	String DISPATCH_SUCCESS = "分配成功";
	String DISPATCH_ERROR = "分配失败";

	Integer CODE_SUCCESS = 1; //操作成功
	Integer CODE_ERROR = -1; //操作失败

	/**
	 * 公用的常量
	 */
	Integer CODE_ZERO = 0;
	Integer CODE_ONE = 1;
	Integer CODE_TWO = 2;
	Integer CODE_THREE = 3;

	/**
	 * 用户的默认密码
	 */
	String USER_DEFAULT_PWD = "123456";

	/**
	 * 临时文件标记
	 */
	String FILE_UPLOAD_TEMP = "_temp";

	/**
	 * 设置默认图片地址
	 */
	String DEFAULT_CAR_IMG = "images/defaultcarimage.jpg";

	/**
	 * 单号的前缀
	 */
	String CAR_ORDER_CZ = "CZ";  //出租车辆的订单号前缀
	String CAR_ORDER_JC = "JC";  //检查单的单号前缀

	/**
	 * 归还状态
	 */
	Integer RENT_BACK_TRUE = 1; //已归还
	Integer RENT_BACK_FALSE = -1; //未归还


	/**
	 * 出租状态
	 */
	Integer RENT_CAR_TRUE = 1; //已出租
	Integer RENT_CAR_FALSE = -1; //未出租


}
