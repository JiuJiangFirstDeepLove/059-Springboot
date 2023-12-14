package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishituijianView;


/**
 * 美食推荐
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface MeishituijianService extends IService<MeishituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishituijianVO> selectListVO(Wrapper<MeishituijianEntity> wrapper);
   	
   	MeishituijianVO selectVO(@Param("ew") Wrapper<MeishituijianEntity> wrapper);
   	
   	List<MeishituijianView> selectListView(Wrapper<MeishituijianEntity> wrapper);
   	
   	MeishituijianView selectView(@Param("ew") Wrapper<MeishituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishituijianEntity> wrapper);
   	
}

