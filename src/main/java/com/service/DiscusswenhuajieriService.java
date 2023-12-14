package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenhuajieriEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenhuajieriVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenhuajieriView;


/**
 * 文化节日评论表
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface DiscusswenhuajieriService extends IService<DiscusswenhuajieriEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenhuajieriVO> selectListVO(Wrapper<DiscusswenhuajieriEntity> wrapper);
   	
   	DiscusswenhuajieriVO selectVO(@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);
   	
   	List<DiscusswenhuajieriView> selectListView(Wrapper<DiscusswenhuajieriEntity> wrapper);
   	
   	DiscusswenhuajieriView selectView(@Param("ew") Wrapper<DiscusswenhuajieriEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenhuajieriEntity> wrapper);
   	
}

