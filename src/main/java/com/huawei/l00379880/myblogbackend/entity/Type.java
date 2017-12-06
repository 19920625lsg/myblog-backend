package com.huawei.l00379880.myblogbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/***********************************************************
 * @Description : 文章类型<=====文章  一对多
 * @author      : 梁山广
 * @date        : 2017/12/6 20:11
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
@Entity
@Table(name = "t_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    /**
     * 分类名称
     */
    private String name;
}
