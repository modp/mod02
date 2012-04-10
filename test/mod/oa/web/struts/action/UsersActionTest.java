package mod.oa.web.struts.action;

import static org.junit.Assert.*;

import mod.oa.iservice.IUsersService;
import mod.oa.service.UsersService;

import org.junit.Test;

public class UsersActionTest {

	@Test
	public void testCheckLoginName() {
		IUsersService us = new UsersService();
		us.findUserByUserLogin("modprobe");
	}

}
