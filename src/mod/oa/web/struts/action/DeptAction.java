package mod.oa.web.struts.action;

import java.util.List;

import mod.oa.dao.DeptDAO;
import mod.oa.entity.Dept;
import mod.oa.iservice.IDeptService;
import mod.oa.service.DeptService;
import mod.oa.utils.DeptActionTree;

import com.opensymphony.xwork2.ActionSupport;

public class DeptAction extends ActionSupport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDeptService service = new DeptService();
		List<Dept> list = service.findTopDept();
		List<Dept> alllist = DeptActionTree.getAllModDeptList(list);
		for (Dept modDept : alllist) {
			System.out.println(modDept.getDepName());
		}
		
	}

}
