package mod.oa.web.struts.action;

import mod.oa.entity.Users;
import mod.oa.iservice.IUsersService;
import mod.oa.service.UsersService;
import mod.oa.web.struts.formbean.UsersBean;

import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport {
	private UsersBean userBean;

	public UsersBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UsersBean userBean) {
		this.userBean = userBean;
	}

	public String login() {
		IUsersService userService = new UsersService();
		Users users = userService.findUserByUserLogin(userBean.getUserLogin());
		if (users == null)
			System.out.println("用户名不存在");
		else {
			if (userBean.getUserPass().equals(users.getUserPass()))
				System.out.println("ok");
			else
				System.out.println("用户名不匹配");
		}
		return "ok";
	}

	public String checkLoginName() {
		IUsersService us = new UsersService();
		us.findUserByUserLogin(userBean.getUserLogin());
		return "ok";
	}
}
