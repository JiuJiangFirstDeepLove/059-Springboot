package com.dao;

import com.entity.MenpiaodinggouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenpiaodinggouVO;
import com.entity.view.MenpiaodinggouView;


/**
 * 门票订购
 * 
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface MenpiaodinggouDao extends BaseMapper<MenpiaodinggouEntity> {
	
	List<MenpiaodinggouVO> selectListVO(@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);
	
	MenpiaodinggouVO selectVO(@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);
	
	List<MenpiaodinggouView> selectListView(@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);

	List<MenpiaodinggouView> selectListView(Pagination page,@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);
	
	MenpiaodinggouView selectView(@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);
	
}
