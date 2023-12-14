package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingqujingdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingqujingdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingqujingdianView;


/**
 * 景区景点评论表
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface DiscussjingqujingdianService extends IService<DiscussjingqujingdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingqujingdianVO> selectListVO(Wrapper<DiscussjingqujingdianEntity> wrapper);
   	
   	DiscussjingqujingdianVO selectVO(@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);
   	
   	List<DiscussjingqujingdianView> selectListView(Wrapper<DiscussjingqujingdianEntity> wrapper);
   	
   	DiscussjingqujingdianView selectView(@Param("ew") Wrapper<DiscussjingqujingdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingqujingdianEntity> wrapper);
   	
}

