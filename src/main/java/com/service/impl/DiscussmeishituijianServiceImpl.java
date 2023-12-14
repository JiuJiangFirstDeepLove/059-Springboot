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


import com.dao.DiscussmeishituijianDao;
import com.entity.DiscussmeishituijianEntity;
import com.service.DiscussmeishituijianService;
import com.entity.vo.DiscussmeishituijianVO;
import com.entity.view.DiscussmeishituijianView;

@Service("discussmeishituijianService")
public class DiscussmeishituijianServiceImpl extends ServiceImpl<DiscussmeishituijianDao, DiscussmeishituijianEntity> implements DiscussmeishituijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishituijianEntity> page = this.selectPage(
                new Query<DiscussmeishituijianEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishituijianEntity> wrapper) {
		  Page<DiscussmeishituijianView> page =new Query<DiscussmeishituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishituijianVO> selectListVO(Wrapper<DiscussmeishituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishituijianVO selectVO(Wrapper<DiscussmeishituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishituijianView> selectListView(Wrapper<DiscussmeishituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishituijianView selectView(Wrapper<DiscussmeishituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
