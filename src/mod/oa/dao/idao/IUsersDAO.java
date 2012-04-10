package mod.oa.dao.idao;

import java.util.List;

import mod.oa.entity.Users;

public interface IUsersDAO {

	// property constants
	public static final String USER_NAME = "userName";
	public static final String USER_LOGIN = "userLogin";
	public static final String USER_PASS = "userPass";
	public static final String USER_SEX = "userSex";
	public static final String USER_EDUBG = "userEdubg";
	public static final String USER_GRADFROM = "userGradfrom";
	public static final String USER_PHONE = "userPhone";
	public static final String USER_EMAIL = "userEmail";

	public abstract void save(Users transientInstance);

	public abstract void delete(Users persistentInstance);

	public abstract Users findById(java.lang.Integer id);

	public abstract List findByExample(Users instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUserName(Object userName);

	public abstract List findByUserLogin(Object userLogin);

	public abstract List findByUserPass(Object userPass);

	public abstract List findByUserSex(Object userSex);

	public abstract List findByUserEdubg(Object userEdubg);

	public abstract List findByUserGradfrom(Object userGradfrom);

	public abstract List findByUserPhone(Object userPhone);

	public abstract List findByUserEmail(Object userEmail);

	public abstract List findAll();

	public abstract Users merge(Users detachedInstance);

	public abstract void attachDirty(Users instance);

	public abstract void attachClean(Users instance);

}