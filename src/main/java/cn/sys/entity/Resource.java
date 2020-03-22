package cn.sys.entity;

import java.math.BigDecimal;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-03-19
 */
public class Resource {
    private Integer id;

    /**
     * 库存商品名称
     */
    private String name;

    /**
     * 详细介绍
     */
    private String des;

    /**
     * 单价
     */
    private BigDecimal unit_price;

    /**
     * 单位
     */
    private String unit;

    private Long surplus;

    private Integer cid;

    private String product_date;

    private String quality_date;

    /**
     * 入库时间
     */
    private String creat_date;

    private Integer sup_id;

    private String bak1;

    /**
     * 1,可用 0报废
     */
    private String bak2;
    
    private Category category;

    public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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
        this.name = name == null ? null : name.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getSurplus() {
        return surplus;
    }

    public void setSurplus(Long surplus) {
        this.surplus = surplus;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }

    public String getProduct_date() {
        return product_date;
    }

    public void setProduct_date(String product_date) {
        this.product_date = product_date;
    }

    public String getQuality_date() {
        return quality_date;
    }

    public void setQuality_date(String quality_date) {
        this.quality_date = quality_date;
    }

    public String getCreat_date() {
        return creat_date;
    }

    public void setCreat_date(String creat_date) {
        this.creat_date = creat_date;
    }

    public Integer getSup_id() {
        return sup_id;
    }

    public void setSup_id(Integer sup_id) {
        this.sup_id = sup_id;
    }
}