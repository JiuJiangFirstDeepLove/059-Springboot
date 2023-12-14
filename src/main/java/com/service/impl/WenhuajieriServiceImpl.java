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


import com.dao.WenhuajieriDao;
import com.entity.WenhuajieriEntity;
import com.service.WenhuajieriService;
import com.entity.vo.WenhuajieriVO;
import com.entity.view.WenhuajieriView;

@Service("wenhuajieriService")
public class WenhuajieriServiceImpl extends ServiceImpl<WenhuajieriDao, WenhuajieriEntity> implements WenhuajieriService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenhuajieriEntity> page = this.selectPage(
                new Query<WenhuajieriEntity>(params).getPage(),
                new EntityWrapper<WenhuajieriEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenhuajieriEntity> wrapper) {
		  Page<WenhuajieriView> page =new Query<WenhuajieriView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenhuajieriVO> selectListVO(Wrapper<WenhuajieriEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenhuajieriVO selectVO(Wrapper<WenhuajieriEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenhuajieriView> selectListView(Wrapper<WenhuajieriEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenhuajieriView selectView(Wrapper<WenhuajieriEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
