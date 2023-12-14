package com.dao;

import com.entity.MeishituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishituijianVO;
import com.entity.view.MeishituijianView;


/**
 * 美食推荐
 * 
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface MeishituijianDao extends BaseMapper<MeishituijianEntity> {
	
	List<MeishituijianVO> selectListVO(@Param("ew") Wrapper<MeishituijianEntity> wrapper);
	
	MeishituijianVO selectVO(@Param("ew") Wrapper<MeishituijianEntity> wrapper);
	
	List<MeishituijianView> selectListView(@Param("ew") Wrapper<MeishituijianEntity> wrapper);

	List<MeishituijianView> selectListView(Pagination page,@Param("ew") Wrapper<MeishituijianEntity> wrapper);
	
	MeishituijianView selectView(@Param("ew") Wrapper<MeishituijianEntity> wrapper);
	
}
