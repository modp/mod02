package mod.oa.dao.idao;

import java.util.List;

import org.hibernate.Session;

import mod.oa.entity.Dept;

public interface IDeptDAO {

	// property constants
	public static final String DEP_NAME = "depName";
	public static final String DEP_DESC = "depDesc";
	public static final String DEP_PARENT = "depParent";

	public abstract void save(Dept transientInstance);

	public abstract void delete(Dept persistentInstance);

	public abstract Dept findById(java.lang.Integer id);

	public abstract List findByExample(Dept instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByDepName(Object depName);

	public abstract List findByDepDesc(Object depDesc);

	public abstract List findByDepParent(Object depParent);

	public abstract List findAll();

	public abstract Dept merge(Dept detachedInstance);

	public abstract void attachDirty(Dept instance);


	public abstract  Session getMySession();
}