package com.model;

/**
 * TGoods generated by MyEclipse Persistence Tools
 */

public class TGoods implements java.io.Serializable
{

	// Fields

	private Integer goodsId;

	private String goodsName;

	private String goodsMiaoshu;

	private String fujian;

	private Integer goodsDijia;

	private Integer goodsCatelogId;

	private Integer goodsUserId;
	
	private String goodsShijian;

	private String goodsDel;

	// Constructors

	/** default constructor */
	public TGoods()
	{
	}

	/** full constructor */
	public TGoods(String goodsName, String goodsMiaoshu,
			Integer goodsDijia, Integer goodsCatelogId, Integer goodsUserId,
			String goodsDel)
	{
		this.goodsName = goodsName;
		this.goodsMiaoshu = goodsMiaoshu;
		this.goodsDijia = goodsDijia;
		this.goodsCatelogId = goodsCatelogId;
		this.goodsUserId = goodsUserId;
		this.goodsDel = goodsDel;
	}

	// Property accessors

	public Integer getGoodsId()
	{
		return this.goodsId;
	}

	public String getGoodsShijian()
	{
		return goodsShijian;
	}

	public void setGoodsShijian(String goodsShijian)
	{
		this.goodsShijian = goodsShijian;
	}

	public void setGoodsId(Integer goodsId)
	{
		this.goodsId = goodsId;
	}

	public String getGoodsName()
	{
		return this.goodsName;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}

	public String getGoodsMiaoshu()
	{
		return this.goodsMiaoshu;
	}

	public void setGoodsMiaoshu(String goodsMiaoshu)
	{
		this.goodsMiaoshu = goodsMiaoshu;
	}


	public Integer getGoodsDijia()
	{
		return this.goodsDijia;
	}

	public void setGoodsDijia(Integer goodsDijia)
	{
		this.goodsDijia = goodsDijia;
	}

	public Integer getGoodsCatelogId()
	{
		return this.goodsCatelogId;
	}

	public void setGoodsCatelogId(Integer goodsCatelogId)
	{
		this.goodsCatelogId = goodsCatelogId;
	}

	public Integer getGoodsUserId()
	{
		return this.goodsUserId;
	}

	public void setGoodsUserId(Integer goodsUserId)
	{
		this.goodsUserId = goodsUserId;
	}

	public String getGoodsDel()
	{
		return this.goodsDel;
	}

	public void setGoodsDel(String goodsDel)
	{
		this.goodsDel = goodsDel;
	}

	public String getFujian()
	{
		return fujian;
	}

	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}

}