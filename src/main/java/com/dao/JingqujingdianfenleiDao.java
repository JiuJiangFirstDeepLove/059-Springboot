package com.dao;

import com.entity.JingqujingdianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqujingdianfenleiVO;
import com.entity.view.JingqujingdianfenleiView;


/**
 * 景区景点分类
 * 
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface JingqujingdianfenleiDao extends BaseMapper<JingqujingdianfenleiEntity> {
	
	List<JingqujingdianfenleiVO> selectListVO(@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);
	
	JingqujingdianfenleiVO selectVO(@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);
	
	List<JingqujingdianfenleiView> selectListView(@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);

	List<JingqujingdianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);
	
	JingqujingdianfenleiView selectView(@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);
	
}
