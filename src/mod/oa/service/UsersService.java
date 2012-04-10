package mod.oa.service;

import java.util.List;

import mod.oa.dao.UsersDAO;
import mod.oa.dao.idao.IUsersDAO;
import mod.oa.entity.Users;
import mod.oa.iservice.IUsersService;

public class UsersService implements IUsersService {
	/* (non-Javadoc)
	 * @see mod.oa.service.IUserService#findUserByUserLogin(java.lang.String)
	 */
	@Override
	public Users findUserByUserLogin(String userLogin) {
		IUsersDAO udao = new UsersDAO();
		List<Users> ulist = udao.findByUserLogin(userLogin);
		if (!ulist.isEmpty())
			return ulist.get(0);
		return null;
	}
}
