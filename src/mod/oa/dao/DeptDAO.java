package mod.oa.dao;

import java.util.List;

import mod.oa.dao.idao.IDeptDAO;
import mod.oa.entity.BaseHibernateDAO;
import mod.oa.entity.Dept;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Dept entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see mod.oa.entity.Dept
 * @author MyEclipse Persistence Tools
 */

public class DeptDAO extends BaseHibernateDAO implements IDeptDAO {
	private static final Logger log = LoggerFactory.getLogger(DeptDAO.class);
	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#save(mod.oa.entity.Dept)
	 */
	@Override
	public void save(Dept transientInstance) {
		log.debug("saving Dept instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#delete(mod.oa.entity.Dept)
	 */
	@Override
	public void delete(Dept persistentInstance) {
		log.debug("deleting Dept instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#findById(java.lang.Integer)
	 */
	@Override
	public Dept findById(java.lang.Integer id) {
		log.debug("getting Dept instance with id: " + id);
		try {
			Dept instance = (Dept) getSession().get(
					"mod.oa.entity.Dept", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#findByExample(mod.oa.entity.Dept)
	 */
	@Override
	public List findByExample(Dept instance) {
		log.debug("finding Dept instance by example");
		try {
			List results = getSession().createCriteria("mod.oa.entity.Dept")
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
	 * @see mod.oa.dao.DeptDAOImpl#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Dept instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dept as model where model."
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
	 * @see mod.oa.dao.DeptDAOImpl#findByDepName(java.lang.Object)
	 */
	@Override
	public List findByDepName(Object depName) {
		return findByProperty(DEP_NAME, depName);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#findByDepDesc(java.lang.Object)
	 */
	@Override
	public List findByDepDesc(Object depDesc) {
		return findByProperty(DEP_DESC, depDesc);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#findByDepParent(java.lang.Object)
	 */
	@Override
	public List findByDepParent(Object depParent) {
		return findByProperty(DEP_PARENT, depParent);
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Dept instances");
		try {
			String queryString = "from Dept";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#merge(mod.oa.entity.Dept)
	 */
	@Override
	public Dept merge(Dept detachedInstance) {
		log.debug("merging Dept instance");
		try {
			Dept result = (Dept) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#attachDirty(mod.oa.entity.Dept)
	 */
	@Override
	public void attachDirty(Dept instance) {
		log.debug("attaching dirty Dept instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see mod.oa.dao.DeptDAOImpl#attachClean(mod.oa.entity.Dept)
	 */
	public void attachClean(Dept instance) {
		log.debug("attaching clean Dept instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public Session getMySession()
	{
		return getSession();
	}
}