package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenhuajieriEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenhuajieriVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuajieriView;


/**
 * 文化节日
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface WenhuajieriService extends IService<WenhuajieriEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenhuajieriVO> selectListVO(Wrapper<WenhuajieriEntity> wrapper);
   	
   	WenhuajieriVO selectVO(@Param("ew") Wrapper<WenhuajieriEntity> wrapper);
   	
   	List<WenhuajieriView> selectListView(Wrapper<WenhuajieriEntity> wrapper);
   	
   	WenhuajieriView selectView(@Param("ew") Wrapper<WenhuajieriEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenhuajieriEntity> wrapper);
   	
}

