package com.entity.model;

import com.entity.ShipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学习视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-03
 */
public class ShipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 视频标题
     */
    private String shipinName;


    /**
     * 视频类型
     */
    private Integer shipinTypes;


    /**
     * 封面
     */
    private String shipinPhoto;


    /**
     * 视频
     */
    private String shipinVideo;


    /**
     * 详情信息
     */
    private String shipinContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：视频标题
	 */
    public String getShipinName() {
        return shipinName;
    }


    /**
	 * 设置：视频标题
	 */
    public void setShipinName(String shipinName) {
        this.shipinName = shipinName;
    }
    /**
	 * 获取：视频类型
	 */
    public Integer getShipinTypes() {
        return shipinTypes;
    }


    /**
	 * 设置：视频类型
	 */
    public void setShipinTypes(Integer shipinTypes) {
        this.shipinTypes = shipinTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getShipinPhoto() {
        return shipinPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setShipinPhoto(String shipinPhoto) {
        this.shipinPhoto = shipinPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getShipinVideo() {
        return shipinVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setShipinVideo(String shipinVideo) {
        this.shipinVideo = shipinVideo;
    }
    /**
	 * 获取：详情信息
	 */
    public String getShipinContent() {
        return shipinContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setShipinContent(String shipinContent) {
        this.shipinContent = shipinContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
