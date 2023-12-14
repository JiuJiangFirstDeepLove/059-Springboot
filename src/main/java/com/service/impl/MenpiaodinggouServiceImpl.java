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


import com.dao.MenpiaodinggouDao;
import com.entity.MenpiaodinggouEntity;
import com.service.MenpiaodinggouService;
import com.entity.vo.MenpiaodinggouVO;
import com.entity.view.MenpiaodinggouView;

@Service("menpiaodinggouService")
public class MenpiaodinggouServiceImpl extends ServiceImpl<MenpiaodinggouDao, MenpiaodinggouEntity> implements MenpiaodinggouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenpiaodinggouEntity> page = this.selectPage(
                new Query<MenpiaodinggouEntity>(params).getPage(),
                new EntityWrapper<MenpiaodinggouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenpiaodinggouEntity> wrapper) {
		  Page<MenpiaodinggouView> page =new Query<MenpiaodinggouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenpiaodinggouVO> selectListVO(Wrapper<MenpiaodinggouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenpiaodinggouVO selectVO(Wrapper<MenpiaodinggouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenpiaodinggouView> selectListView(Wrapper<MenpiaodinggouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenpiaodinggouView selectView(Wrapper<MenpiaodinggouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
