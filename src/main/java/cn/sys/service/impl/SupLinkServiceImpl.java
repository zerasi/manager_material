package cn.sys.service.impl;

import cn.sys.dao.SupLinkMapper;
import cn.sys.entity.SupLink;
import cn.sys.entity.SupLinkExample;
import cn.sys.service.SupLinkService;
import cn.sys.utils.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupLinkServiceImpl implements SupLinkService{

	@Autowired
	private SupLinkMapper mapper;


	public List<SupLink> findAll() {
		return mapper.selectByExample(new SupLinkExample());
	}


	public void add(SupLink SupLink) {
		mapper.insertSelective(SupLink);
	}


	public void update(SupLink SupLink) {
		mapper.updateByPrimaryKey(SupLink);

	}


	public PageResult findPage(SupLinkExample example, Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		Page<SupLink> pages = (Page<SupLink>)this.mapper.selectByExample(example);
		return new PageResult(pages.getTotal(), pages.getResult());
	}


	public SupLink findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}


	public void delete(int parseInt) {
		mapper.deleteByPrimaryKey(parseInt);
	}

	@Override
	public List<SupLink> findList(SupLinkExample example) {
		return this.mapper.selectByExample(example);
	}

}
