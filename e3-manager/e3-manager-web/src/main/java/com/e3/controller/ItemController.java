package com.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e3.pojo.TbItem;
import com.e3.service.ItemService;

/**
 * @ClassName: ItemController
 * @Description: 商品的处理器
 * @author 景江
 * @date 2017年5月16日 下午9:05:45
 */
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("item/{itemId}")
	public TbItem getItemById(@PathVariable Long itemId){
		return itemService.getItemById(itemId);
	}
}
