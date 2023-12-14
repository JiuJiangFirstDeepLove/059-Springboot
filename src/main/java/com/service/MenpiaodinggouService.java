package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenpiaodinggouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenpiaodinggouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenpiaodinggouView;


/**
 * 门票订购
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface MenpiaodinggouService extends IService<MenpiaodinggouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenpiaodinggouVO> selectListVO(Wrapper<MenpiaodinggouEntity> wrapper);
   	
   	MenpiaodinggouVO selectVO(@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);
   	
   	List<MenpiaodinggouView> selectListView(Wrapper<MenpiaodinggouEntity> wrapper);
   	
   	MenpiaodinggouView selectView(@Param("ew") Wrapper<MenpiaodinggouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenpiaodinggouEntity> wrapper);
   	
}

