package mod.oa.dao;

import java.util.Date;
import java.util.List;

import mod.oa.dao.idao.IUsersDAO;
import mod.oa.entity.BaseHibernateDAO;
import mod.oa.entity.Users;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Users
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see mod.oa.entity.Users
 * @author MyEclipse Persistence Tools
 */

public class UsersDAO extends BaseHibernateDAO implements IUsersDAO {
	private static final Logger log = LoggerFactory.getLogger(UsersDAO.class);
	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#save(mod.oa.entity.Users)
	 */
	@Override
	public void save(Users transientInstance) {
		log.debug("saving Users instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#delete(mod.oa.entity.Users)
	 */
	@Override
	public void delete(Users persistentInstance) {
		log.debug("deleting Users instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findById(java.lang.Integer)
	 */
	@Override
	public Users findById(java.lang.Integer id) {
		log.debug("getting Users instance with id: " + id);
		try {
			Users instance = (Users) getSession()
					.get("mod.oa.entity.Users", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByExample(mod.oa.entity.Users)
	 */
	@Override
	public List findByExample(Users instance) {
		log.debug("finding Users instance by example");
		try {
			List results = getSession().createCriteria("mod.oa.entity.Users")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Users instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Users as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserName(java.lang.Object)
	 */
	@Override
	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserLogin(java.lang.Object)
	 */
	@Override
	public List findByUserLogin(Object userLogin) {
		return findByProperty(USER_LOGIN, userLogin);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserPass(java.lang.Object)
	 */
	@Override
	public List findByUserPass(Object userPass) {
		return findByProperty(USER_PASS, userPass);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserSex(java.lang.Object)
	 */
	@Override
	public List findByUserSex(Object userSex) {
		return findByProperty(USER_SEX, userSex);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserEdubg(java.lang.Object)
	 */
	@Override
	public List findByUserEdubg(Object userEdubg) {
		return findByProperty(USER_EDUBG, userEdubg);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserGradfrom(java.lang.Object)
	 */
	@Override
	public List findByUserGradfrom(Object userGradfrom) {
		return findByProperty(USER_GRADFROM, userGradfrom);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserPhone(java.lang.Object)
	 */
	@Override
	public List findByUserPhone(Object userPhone) {
		return findByProperty(USER_PHONE, userPhone);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findByUserEmail(java.lang.Object)
	 */
	@Override
	public List findByUserEmail(Object userEmail) {
		return findByProperty(USER_EMAIL, userEmail);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Users instances");
		try {
			String queryString = "from Users";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#merge(mod.oa.entity.Users)
	 */
	@Override
	public Users merge(Users detachedInstance) {
		log.debug("merging Users instance");
		try {
			Users result = (Users) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#attachDirty(mod.oa.entity.Users)
	 */
	@Override
	public void attachDirty(Users instance) {
		log.debug("attaching dirty Users instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.IUsersDAO#attachClean(mod.oa.entity.Users)
	 */
	@Override
	public void attachClean(Users instance) {
		log.debug("attaching clean Users instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}