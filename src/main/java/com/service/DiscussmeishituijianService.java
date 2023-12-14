package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishituijianView;


/**
 * 美食推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface DiscussmeishituijianService extends IService<DiscussmeishituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishituijianVO> selectListVO(Wrapper<DiscussmeishituijianEntity> wrapper);
   	
   	DiscussmeishituijianVO selectVO(@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);
   	
   	List<DiscussmeishituijianView> selectListView(Wrapper<DiscussmeishituijianEntity> wrapper);
   	
   	DiscussmeishituijianView selectView(@Param("ew") Wrapper<DiscussmeishituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishituijianEntity> wrapper);
   	
}

