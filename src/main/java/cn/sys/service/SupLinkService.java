package cn.sys.service;

import cn.sys.entity.Category;
import cn.sys.entity.CategoryExample;
import cn.sys.entity.SupLink;
import cn.sys.entity.SupLinkExample;
import cn.sys.utils.PageResult;

import java.util.List;

public interface SupLinkService {

	List<SupLink> findAll();

	void add(SupLink SupLink);

	void update(SupLink SupLink);

	PageResult findPage(SupLinkExample example, Integer page, Integer rows);

	SupLink findOne(Integer id);

	void delete(int parseInt);

	List<SupLink> findList(SupLinkExample example);
}
