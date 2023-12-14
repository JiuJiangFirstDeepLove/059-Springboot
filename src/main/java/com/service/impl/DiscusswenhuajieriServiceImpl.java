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


import com.dao.DiscusswenhuajieriDao;
import com.entity.DiscusswenhuajieriEntity;
import com.service.DiscusswenhuajieriService;
import com.entity.vo.DiscusswenhuajieriVO;
import com.entity.view.DiscusswenhuajieriView;

@Service("discusswenhuajieriService")
public class DiscusswenhuajieriServiceImpl extends ServiceImpl<DiscusswenhuajieriDao, DiscusswenhuajieriEntity> implements DiscusswenhuajieriService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenhuajieriEntity> page = this.selectPage(
                new Query<DiscusswenhuajieriEntity>(params).getPage(),
                new EntityWrapper<DiscusswenhuajieriEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenhuajieriEntity> wrapper) {
		  Page<DiscusswenhuajieriView> page =new Query<DiscusswenhuajieriView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenhuajieriVO> selectListVO(Wrapper<DiscusswenhuajieriEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenhuajieriVO selectVO(Wrapper<DiscusswenhuajieriEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenhuajieriView> selectListView(Wrapper<DiscusswenhuajieriEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenhuajieriView selectView(Wrapper<DiscusswenhuajieriEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
