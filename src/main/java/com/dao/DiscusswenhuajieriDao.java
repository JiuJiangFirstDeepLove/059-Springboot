package com.dao;

import com.entity.DiscusswenhuajieriEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenhuajieriVO;
import com.entity.view.DiscusswenhuajieriView;


/**
 * 文化节日评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface DiscusswenhuajieriDao extends BaseMapper<DiscusswenhuajieriEntity> {
	
	List<DiscusswenhuajieriVO> selectListVO(@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);
	
	DiscusswenhuajieriVO selectVO(@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);
	
	List<DiscusswenhuajieriView> selectListView(@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);

	List<DiscusswenhuajieriView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);
	
	DiscusswenhuajieriView selectView(@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);
	
}
