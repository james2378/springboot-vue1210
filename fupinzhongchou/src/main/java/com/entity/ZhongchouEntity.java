package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 众筹
 *
 * @author 
 * @email
 */
@TableName("zhongchou")
public class ZhongchouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhongchouEntity() {

	}

	public ZhongchouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 物资
     */
    @TableField(value = "wuzi_id")

    private Integer wuziId;


    /**
     * 众筹编号
     */
    @TableField(value = "zhongchou_uuid_number")

    private String zhongchouUuidNumber;


    /**
     * 众筹名称
     */
    @TableField(value = "zhongchou_name")

    private String zhongchouName;


    /**
     * 众筹类型
     */
    @TableField(value = "zhongchou_types")

    private Integer zhongchouTypes;


    /**
     * 众筹数量
     */
    @TableField(value = "zhongchou_kucun_number")

    private Integer zhongchouKucunNumber;


    /**
     * 已筹金额
     */
    @TableField(value = "yichou_money")

    private Double yichouMoney;


    /**
     * 众筹总额
     */
    @TableField(value = "zhongchou_money")

    private Double zhongchouMoney;


    /**
     * 热度
     */
    @TableField(value = "zhongchou_clicknum")

    private Integer zhongchouClicknum;


    /**
     * 众筹状态
     */
    @TableField(value = "zhongchou_zhuangtai_types")

    private Integer zhongchouZhuangtaiTypes;


    /**
     * 收件人姓名
     */
    @TableField(value = "zhongchou_chenggong_name")

    private String zhongchouChenggongName;


    /**
     * 收件人联系方式
     */
    @TableField(value = "zhongchou_chenggong_phone")

    private String zhongchouChenggongPhone;


    /**
     * 收件人地址
     */
    @TableField(value = "zhongchou_chenggong_address")

    private String zhongchouChenggongAddress;


    /**
     * 快递名称
     */
    @TableField(value = "zhongchou_chenggong_kuaidiname")

    private String zhongchouChenggongKuaidiname;


    /**
     * 快递号
     */
    @TableField(value = "zhongchou_chenggong_kuaidiaddress")

    private String zhongchouChenggongKuaidiaddress;


    /**
     * 快递状态
     */
    @TableField(value = "zhongchou_kuaidi_types")

    private Integer zhongchouKuaidiTypes;


    /**
     * 众筹详情
     */
    @TableField(value = "zhongchou_content")

    private String zhongchouContent;


    /**
     * 发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 众筹截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jieshu_time")

    private Date jieshuTime;


    /**
     * 逻辑删除
     */
    @TableField(value = "zhongchou_delete")

    private Integer zhongchouDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：物资
	 */
    public Integer getwuziId() {
        return wuziId;
    }
    /**
	 * 获取：物资
	 */

    public void setwuziId(Integer wuziId) {
        this.wuziId = wuziId;
    }
    /**
	 * 设置：众筹编号
	 */
    public String getZhongchouUuidNumber() {
        return zhongchouUuidNumber;
    }
    /**
	 * 获取：众筹编号
	 */

    public void setZhongchouUuidNumber(String zhongchouUuidNumber) {
        this.zhongchouUuidNumber = zhongchouUuidNumber;
    }
    /**
	 * 设置：众筹名称
	 */
    public String getZhongchouName() {
        return zhongchouName;
    }
    /**
	 * 获取：众筹名称
	 */

    public void setZhongchouName(String zhongchouName) {
        this.zhongchouName = zhongchouName;
    }
    /**
	 * 设置：众筹类型
	 */
    public Integer getZhongchouTypes() {
        return zhongchouTypes;
    }
    /**
	 * 获取：众筹类型
	 */

    public void setZhongchouTypes(Integer zhongchouTypes) {
        this.zhongchouTypes = zhongchouTypes;
    }
    /**
	 * 设置：众筹数量
	 */
    public Integer getZhongchouKucunNumber() {
        return zhongchouKucunNumber;
    }
    /**
	 * 获取：众筹数量
	 */

    public void setZhongchouKucunNumber(Integer zhongchouKucunNumber) {
        this.zhongchouKucunNumber = zhongchouKucunNumber;
    }
    /**
	 * 设置：已筹金额
	 */
    public Double getYichouMoney() {
        return yichouMoney;
    }
    /**
	 * 获取：已筹金额
	 */

    public void setYichouMoney(Double yichouMoney) {
        this.yichouMoney = yichouMoney;
    }
    /**
	 * 设置：众筹总额
	 */
    public Double getZhongchouMoney() {
        return zhongchouMoney;
    }
    /**
	 * 获取：众筹总额
	 */

    public void setZhongchouMoney(Double zhongchouMoney) {
        this.zhongchouMoney = zhongchouMoney;
    }
    /**
	 * 设置：热度
	 */
    public Integer getZhongchouClicknum() {
        return zhongchouClicknum;
    }
    /**
	 * 获取：热度
	 */

    public void setZhongchouClicknum(Integer zhongchouClicknum) {
        this.zhongchouClicknum = zhongchouClicknum;
    }
    /**
	 * 设置：众筹状态
	 */
    public Integer getZhongchouZhuangtaiTypes() {
        return zhongchouZhuangtaiTypes;
    }
    /**
	 * 获取：众筹状态
	 */

    public void setZhongchouZhuangtaiTypes(Integer zhongchouZhuangtaiTypes) {
        this.zhongchouZhuangtaiTypes = zhongchouZhuangtaiTypes;
    }
    /**
	 * 设置：收件人姓名
	 */
    public String getZhongchouChenggongName() {
        return zhongchouChenggongName;
    }
    /**
	 * 获取：收件人姓名
	 */

    public void setZhongchouChenggongName(String zhongchouChenggongName) {
        this.zhongchouChenggongName = zhongchouChenggongName;
    }
    /**
	 * 设置：收件人联系方式
	 */
    public String getZhongchouChenggongPhone() {
        return zhongchouChenggongPhone;
    }
    /**
	 * 获取：收件人联系方式
	 */

    public void setZhongchouChenggongPhone(String zhongchouChenggongPhone) {
        this.zhongchouChenggongPhone = zhongchouChenggongPhone;
    }
    /**
	 * 设置：收件人地址
	 */
    public String getZhongchouChenggongAddress() {
        return zhongchouChenggongAddress;
    }
    /**
	 * 获取：收件人地址
	 */

    public void setZhongchouChenggongAddress(String zhongchouChenggongAddress) {
        this.zhongchouChenggongAddress = zhongchouChenggongAddress;
    }
    /**
	 * 设置：快递名称
	 */
    public String getZhongchouChenggongKuaidiname() {
        return zhongchouChenggongKuaidiname;
    }
    /**
	 * 获取：快递名称
	 */

    public void setZhongchouChenggongKuaidiname(String zhongchouChenggongKuaidiname) {
        this.zhongchouChenggongKuaidiname = zhongchouChenggongKuaidiname;
    }
    /**
	 * 设置：快递号
	 */
    public String getZhongchouChenggongKuaidiaddress() {
        return zhongchouChenggongKuaidiaddress;
    }
    /**
	 * 获取：快递号
	 */

    public void setZhongchouChenggongKuaidiaddress(String zhongchouChenggongKuaidiaddress) {
        this.zhongchouChenggongKuaidiaddress = zhongchouChenggongKuaidiaddress;
    }
    /**
	 * 设置：快递状态
	 */
    public Integer getZhongchouKuaidiTypes() {
        return zhongchouKuaidiTypes;
    }
    /**
	 * 获取：快递状态
	 */

    public void setZhongchouKuaidiTypes(Integer zhongchouKuaidiTypes) {
        this.zhongchouKuaidiTypes = zhongchouKuaidiTypes;
    }
    /**
	 * 设置：众筹详情
	 */
    public String getZhongchouContent() {
        return zhongchouContent;
    }
    /**
	 * 获取：众筹详情
	 */

    public void setZhongchouContent(String zhongchouContent) {
        this.zhongchouContent = zhongchouContent;
    }
    /**
	 * 设置：发起时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发起时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：众筹截止时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }
    /**
	 * 获取：众筹截止时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getZhongchouDelete() {
        return zhongchouDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setZhongchouDelete(Integer zhongchouDelete) {
        this.zhongchouDelete = zhongchouDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zhongchou{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", wuziId=" + wuziId +
            ", zhongchouUuidNumber=" + zhongchouUuidNumber +
            ", zhongchouName=" + zhongchouName +
            ", zhongchouTypes=" + zhongchouTypes +
            ", zhongchouKucunNumber=" + zhongchouKucunNumber +
            ", yichouMoney=" + yichouMoney +
            ", zhongchouMoney=" + zhongchouMoney +
            ", zhongchouClicknum=" + zhongchouClicknum +
            ", zhongchouZhuangtaiTypes=" + zhongchouZhuangtaiTypes +
            ", zhongchouChenggongName=" + zhongchouChenggongName +
            ", zhongchouChenggongPhone=" + zhongchouChenggongPhone +
            ", zhongchouChenggongAddress=" + zhongchouChenggongAddress +
            ", zhongchouChenggongKuaidiname=" + zhongchouChenggongKuaidiname +
            ", zhongchouChenggongKuaidiaddress=" + zhongchouChenggongKuaidiaddress +
            ", zhongchouKuaidiTypes=" + zhongchouKuaidiTypes +
            ", zhongchouContent=" + zhongchouContent +
            ", insertTime=" + insertTime +
            ", jieshuTime=" + jieshuTime +
            ", zhongchouDelete=" + zhongchouDelete +
            ", createTime=" + createTime +
        "}";
    }
}
