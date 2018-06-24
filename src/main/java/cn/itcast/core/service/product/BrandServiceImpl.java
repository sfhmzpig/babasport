package cn.itcast.core.service.product;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
/**
 * 品牌事务
 */
import cn.itcast.core.bean.product.Brand;
import cn.itcast.core.dao.product.BrandDao;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {
	
	@Resource
	private BrandDao brandDao;
	
	@Transactional(readOnly=true)
	public Pagination getBrandListWithPage(Brand brand){
		//1:启始页(getPageNo-1)*5
		//2：每页输
		//3：总记录数
		Pagination pagination=new Pagination(brand.getPageNo(), brand.getPageSize(), brandDao.getBrandCount(brand));
		
		pagination.setList(brandDao.getBrandListWithPage(brand));
		
		return pagination;	
	}

}
