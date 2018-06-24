package cn.itcast.core.bean.product;


/**
 * 品牌对象
 * @author Administrator
 *
 */

/**
 * @author Administrator
 *
 */
public class Brand  {
	/**
	 * 序列化ID
	 */

	private Integer id;
	private String name;
	private String description;
	private String imgUrl;
	private Integer sort;
	private Integer isDisplay;
	
	private Integer pageNo=1;
	
	private Integer startRow;
	private Integer pageSize=10;
	

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		
		this.startRow = startRow;
	}

	public Integer getPageSize() {
		
		
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		//计算一次开始行
		this.startRow=(pageNo-1)*pageSize;
		this.pageSize = pageSize;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		//计算一次开始行
		this.startRow=(pageNo-1)*pageSize;
		this.pageNo = pageNo;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", description=" + description + ", imgUrl=" + imgUrl + ", sort="
				+ sort + ", isDisplay=" + isDisplay + "]";
	}

	
	
	
	

}
