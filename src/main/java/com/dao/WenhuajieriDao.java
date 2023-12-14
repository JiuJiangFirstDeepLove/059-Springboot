package com.dao;

import com.entity.WenhuajieriEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenhuajieriVO;
import com.entity.view.WenhuajieriView;


/**
 * 文化节日
 * 
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface WenhuajieriDao extends BaseMapper<WenhuajieriEntity> {
	
	List<WenhuajieriVO> selectListVO(@Param("ew") Wrapper<WenhuajieriEntity> wrapper);
	
	WenhuajieriVO selectVO(@Param("ew") Wrapper<WenhuajieriEntity> wrapper);
	
	List<WenhuajieriView> selectListView(@Param("ew") Wrapper<WenhuajieriEntity> wrapper);

	List<WenhuajieriView> selectListView(Pagination page,@Param("ew") Wrapper<WenhuajieriEntity> wrapper);
	
	WenhuajieriView selectView(@Param("ew") Wrapper<WenhuajieriEntity> wrapper);
	
}
