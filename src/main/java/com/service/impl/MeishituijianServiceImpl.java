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


import com.dao.MeishituijianDao;
import com.entity.MeishituijianEntity;
import com.service.MeishituijianService;
import com.entity.vo.MeishituijianVO;
import com.entity.view.MeishituijianView;

@Service("meishituijianService")
public class MeishituijianServiceImpl extends ServiceImpl<MeishituijianDao, MeishituijianEntity> implements MeishituijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishituijianEntity> page = this.selectPage(
                new Query<MeishituijianEntity>(params).getPage(),
                new EntityWrapper<MeishituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishituijianEntity> wrapper) {
		  Page<MeishituijianView> page =new Query<MeishituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishituijianVO> selectListVO(Wrapper<MeishituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishituijianVO selectVO(Wrapper<MeishituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishituijianView> selectListView(Wrapper<MeishituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishituijianView selectView(Wrapper<MeishituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
