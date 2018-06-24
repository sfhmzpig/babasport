package cn.itcast.core.service.product;

import cn.itcast.common.page.Pagination;
import cn.itcast.core.bean.product.Brand;

/**
 * 事务层，逻辑开发层 接口
 * @author Administrator
 *
 */

public interface BrandService {
	
	//查询所有品牌
	public Pagination getBrandListWithPage(Brand brand);

}
