package mod.oa.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mod.oa.entity.Dept;
import mod.oa.iservice.IDeptService;
import mod.oa.service.DeptService;

public class DeptActionTree {
	public static List<Dept> getAllModDeptList(List<Dept> topList) {
		List<Dept> list = new ArrayList<Dept>();
		listModDeptTrees(topList, "", list);
		return list;

	}

	private static void listModDeptTrees(Collection<Dept> topList,
			String prefix, List<Dept> list) {
		IDeptService service = new DeptService();
		for (Dept top : topList) {
			Dept copy = new Dept();
			copy.setDepId(top.getDepId());
			copy.setDepName(prefix + "┠" + top.getDepName());
			System.out.println(copy.getDepName());
			list.add(copy);
			listModDeptTrees(service.findChildByID(top.getDepId()), prefix + "　", list);
		}
	}
}
