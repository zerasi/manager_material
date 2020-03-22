package cn.sys.dao;

import cn.sys.entity.SupLink;
import cn.sys.entity.SupLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupLinkMapper {
    int countByExample(SupLinkExample example);

    int deleteByExample(SupLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupLink record);

    int insertSelective(SupLink record);

    List<SupLink> selectByExample(SupLinkExample example);

    SupLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupLink record, @Param("example") SupLinkExample example);

    int updateByExample(@Param("record") SupLink record, @Param("example") SupLinkExample example);

    int updateByPrimaryKeySelective(SupLink record);

    int updateByPrimaryKey(SupLink record);
}