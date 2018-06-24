package cn.itcast.core.controller.admin;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;
import cn.itcast.core.bean.product.Brand;
import cn.itcast.core.service.product.BrandService;

@Controller
public class BrandController {
	//商品身体
	
	@Autowired
	private BrandService brandservice;
	//品牌列表页面
	@RequestMapping(value="/brand/list.do")
	public String list(String name,Integer isDisplay,Integer pageNo,ModelMap model ) {
		//参数
		StringBuilder params=new StringBuilder();
		
		Brand brand=new Brand();
		//判断是否传入空字符串，包括"  "
		if(StringUtils.isNotBlank(name)) {
			brand.setName(name);
			params.append("name=").append(name);
		}
		
		if(isDisplay!=null) {
			brand.setIsDisplay(isDisplay);
			params.append("&").append("isDisplay=").append(isDisplay);
		}
		else {
			brand.setIsDisplay(1);
			params.append("&").append("isDisplay=").append(1);
		}
		//如果页号为空，或小于1则置为1
		
		brand.setPageNo(Pagination.cpn(pageNo));
		
		//每页数
		brand.setPageSize(5);
		//分页对象
		Pagination pagination = brandservice.getBrandListWithPage(brand);
		//分页展示/brand/list.do？name=金啦啦
		//选择后数据依然停留在选框中&isDisplay=1&paheNo=2
		String url="/brand/list.do";
		pagination.pageView(url, params.toString());
		
		model.addAttribute("pagination",pagination);
		model.addAttribute("name",name);
		model.addAttribute("isDisplay",isDisplay);
		
	
		
		
		return"/brand/list";
	}
	
	
	
	
}
	
