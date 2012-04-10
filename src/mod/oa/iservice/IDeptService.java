package mod.oa.iservice;

import java.util.List;

import mod.oa.entity.Dept;

public interface IDeptService {

	public abstract List<Dept> findTopDept();

	public abstract List<Dept> findChildByID(long id);
}