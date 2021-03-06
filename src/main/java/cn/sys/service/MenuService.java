package cn.sys.service;

import cn.sys.entity.Emp;
import cn.sys.entity.Menu;
import cn.sys.entity.Role;
import java.util.List;

public abstract interface MenuService
{
  public abstract List menuFindByParentMenuIsNull();
  
  public abstract void menuAdd(Menu paramMenu);
  
  public abstract List<Role> roleFindAll();
  
  public abstract void roleAdd(Role paramRole, String paramString);
  
  public abstract List menufindByRoleId(Integer paramInteger);
  
  public abstract Role roleFindRoleById(Integer paramInteger);
  
  public abstract void deleteMenuByid(Integer paramInteger);
  
  public abstract void deleteRole(String paramString);

public abstract List menu_findByParentMenuIsNullByEmp(Emp emp);
}
