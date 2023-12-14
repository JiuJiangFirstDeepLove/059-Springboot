package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqujingdianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqujingdianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqujingdianfenleiView;


/**
 * 景区景点分类
 *
 * @author 
 * @email 
 * @date 2021-04-07 17:12:16
 */
public interface JingqujingdianfenleiService extends IService<JingqujingdianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqujingdianfenleiVO> selectListVO(Wrapper<JingqujingdianfenleiEntity> wrapper);
   	
   	JingqujingdianfenleiVO selectVO(@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);
   	
   	List<JingqujingdianfenleiView> selectListView(Wrapper<JingqujingdianfenleiEntity> wrapper);
   	
   	JingqujingdianfenleiView selectView(@Param("ew") Wrapper<JingqujingdianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqujingdianfenleiEntity> wrapper);
   	
}

