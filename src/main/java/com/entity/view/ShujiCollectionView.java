package com.entity.view;

import com.entity.ShujiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 小说收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shuji_collection")
public class ShujiCollectionView extends ShujiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String shujiCollectionValue;



		//级联表 shuji
			/**
			* 小说名称
			*/
			private String shujiName;
			/**
			* 小说封面
			*/
			private String shujiPhoto;
			/**
			* 小说类型
			*/
			private Integer shujiTypes;
				/**
				* 小说类型的值
				*/
				private String shujiValue;
			/**
			* 点击次数
			*/
			private Integer shujiClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 小说简介
			*/
			private String shujiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public ShujiCollectionView() {

	}

	public ShujiCollectionView(ShujiCollectionEntity shujiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shujiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getShujiCollectionValue() {
				return shujiCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setShujiCollectionValue(String shujiCollectionValue) {
				this.shujiCollectionValue = shujiCollectionValue;
			}













				//级联表的get和set shuji
					/**
					* 获取： 小说名称
					*/
					public String getShujiName() {
						return shujiName;
					}
					/**
					* 设置： 小说名称
					*/
					public void setShujiName(String shujiName) {
						this.shujiName = shujiName;
					}
					/**
					* 获取： 小说封面
					*/
					public String getShujiPhoto() {
						return shujiPhoto;
					}
					/**
					* 设置： 小说封面
					*/
					public void setShujiPhoto(String shujiPhoto) {
						this.shujiPhoto = shujiPhoto;
					}
					/**
					* 获取： 小说类型
					*/
					public Integer getShujiTypes() {
						return shujiTypes;
					}
					/**
					* 设置： 小说类型
					*/
					public void setShujiTypes(Integer shujiTypes) {
						this.shujiTypes = shujiTypes;
					}


						/**
						* 获取： 小说类型的值
						*/
						public String getShujiValue() {
							return shujiValue;
						}
						/**
						* 设置： 小说类型的值
						*/
						public void setShujiValue(String shujiValue) {
							this.shujiValue = shujiValue;
						}
					/**
					* 获取： 点击次数
					*/
					public Integer getShujiClicknum() {
						return shujiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShujiClicknum(Integer shujiClicknum) {
						this.shujiClicknum = shujiClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 小说简介
					*/
					public String getShujiContent() {
						return shujiContent;
					}
					/**
					* 设置： 小说简介
					*/
					public void setShujiContent(String shujiContent) {
						this.shujiContent = shujiContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}









}
