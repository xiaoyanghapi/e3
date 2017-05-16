package com.e3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.e3.mapper.TbItemMapper;
import com.e3.pojo.TbItem;
import com.e3.pojo.TbItemExample;
import com.e3.pojo.TbItemExample.Criteria;
import com.e3.service.ItemService;

/**
 * @ClassName: ItemServiceImpl
 * @Description: 商品管理的service
 * @author 景江
 * @date 2017年5月16日 下午8:54:59
 */
@Component
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		//根据主键查询
		//TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		TbItemExample example = new TbItemExample();
		Criteria createCriteria = example.createCriteria();
		//创建查询条件
		createCriteria.andIdEqualTo(itemId);
		//执行查询
		List<TbItem> selectByExample = itemMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(selectByExample)) {
			return null;
		}
		return selectByExample.get(0);
	}

}
