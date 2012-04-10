package mod.oa.iservice;

import mod.oa.entity.Users;

public interface IUsersService {

	/**
	 * 按登录名查询用户
	 * 
	 * @param userLogin
	 * @return
	 */
	public abstract Users findUserByUserLogin(String userLogin);

}