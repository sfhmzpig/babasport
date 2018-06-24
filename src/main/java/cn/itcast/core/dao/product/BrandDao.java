package cn.itcast.core.dao.product;

import java.util.List;

import cn.itcast.core.bean.product.Brand;

public interface BrandDao {
	
	
	//List集合
	public List<Brand> getBrandListWithPage(Brand brand);
	//查询总记录数
	public int getBrandCount(Brand brand);
	

}
