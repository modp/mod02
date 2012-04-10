package mod.oa.service;

import java.util.List;

import mod.oa.dao.DeptDAO;
import mod.oa.dao.idao.IDeptDAO;
import mod.oa.entity.Dept;
import mod.oa.iservice.IDeptService;

public class DeptService implements IDeptService {
	/*
	 * (non-Javadoc)
	 * 
	 * @see mod.oa.service.DeptIService#findTopDept()
	 */
	@Override
	/**
	 * 查询顶级部门
	 */
	public List<Dept> findTopDept() {
		IDeptDAO dao = new DeptDAO();
		return (List<Dept>) dao.getMySession()
				.createQuery("FROM Dept d WHERE d.depParent IS NULL").list();
	}

	/**
	 * 按照ID查询一个部门的子部门
	 */
	public List<Dept> findChildByID(long id) {
		IDeptDAO dao = new DeptDAO();
		return (List<Dept>) dao.getMySession()
				.createQuery("FROM Dept d WHERE d.depParent = "+id).list();
	}
}
