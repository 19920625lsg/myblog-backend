package com.huawei.l00379880.myblogbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/***********************************************************
 * @Description : 博客实体类
 * @author      : 梁山广
 * @date        : 2017/12/6 19:34
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
@Entity
@Table(name = "t_blog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 文章首图
     */
    private String firstPicture;
    /**
     * 标记
     */
    private String flag;
    /**
     * 浏览量
     */
    private String visits;
    /**
     * 是否开启赞赏
     */
    private boolean appreciation;
    /**
     * 转载声明是否开启(版权声明)
     */
    private boolean shareStatement;
    /**
     * 是否允许评论
     */
    private boolean commendable;
    /**
     * 发布还是保存为草稿
     */
    private boolean published;
    /**
     * 是否推荐
     */
    private boolean recommended;
    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
}
