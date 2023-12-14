package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingqujingdianfenleiDao;
import com.entity.JingqujingdianfenleiEntity;
import com.service.JingqujingdianfenleiService;
import com.entity.vo.JingqujingdianfenleiVO;
import com.entity.view.JingqujingdianfenleiView;

@Service("jingqujingdianfenleiService")
public class JingqujingdianfenleiServiceImpl extends ServiceImpl<JingqujingdianfenleiDao, JingqujingdianfenleiEntity> implements JingqujingdianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqujingdianfenleiEntity> page = this.selectPage(
                new Query<JingqujingdianfenleiEntity>(params).getPage(),
                new EntityWrapper<JingqujingdianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqujingdianfenleiEntity> wrapper) {
		  Page<JingqujingdianfenleiView> page =new Query<JingqujingdianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqujingdianfenleiVO> selectListVO(Wrapper<JingqujingdianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqujingdianfenleiVO selectVO(Wrapper<JingqujingdianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqujingdianfenleiView> selectListView(Wrapper<JingqujingdianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqujingdianfenleiView selectView(Wrapper<JingqujingdianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
