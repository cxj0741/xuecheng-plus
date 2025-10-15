package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 课程发布
 * </p>
 *
 * @author cxj
 * @since 2025-10-15
 */
@Getter
@Setter
@TableName("course_publish_pre")
@ApiModel(value = "CoursePublishPre对象", description = "课程发布")
public class CoursePublishPre implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId("id")
    private Long id;

    @ApiModelProperty("机构ID")
    @TableField("company_id")
    private Long companyId;

    @ApiModelProperty("公司名称")
    @TableField("company_name")
    private String companyName;

    @ApiModelProperty("课程名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("适用人群")
    @TableField("users")
    private String users;

    @ApiModelProperty("标签")
    @TableField("tags")
    private String tags;

    @ApiModelProperty("创建人")
    @TableField("username")
    private String username;

    @ApiModelProperty("大分类")
    @TableField("mt")
    private String mt;

    @ApiModelProperty("大分类名称")
    @TableField("mt_name")
    private String mtName;

    @ApiModelProperty("小分类")
    @TableField("st")
    private String st;

    @ApiModelProperty("小分类名称")
    @TableField("st_name")
    private String stName;

    @ApiModelProperty("课程等级")
    @TableField("grade")
    private String grade;

    @ApiModelProperty("教育模式")
    @TableField("teachmode")
    private String teachmode;

    @ApiModelProperty("课程图片")
    @TableField("pic")
    private String pic;

    @ApiModelProperty("课程介绍")
    @TableField("description")
    private String description;

    @ApiModelProperty("课程营销信息，json格式")
    @TableField("market")
    private String market;

    @ApiModelProperty("所有课程计划，json格式")
    @TableField("teachplan")
    private String teachplan;

    @ApiModelProperty("教师信息，json格式")
    @TableField("teachers")
    private String teachers;

    @ApiModelProperty("提交时间")
    @TableField("create_date")
    private LocalDateTime createDate;

    @ApiModelProperty("审核时间")
    @TableField("audit_date")
    private LocalDateTime auditDate;

    @ApiModelProperty("状态")
    @TableField("status")
    private String status;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("收费规则，对应数据字典--203")
    @TableField("charge")
    private String charge;

    @ApiModelProperty("现价")
    @TableField("price")
    private Double price;

    @ApiModelProperty("原价")
    @TableField("original_price")
    private Double originalPrice;

    @ApiModelProperty("课程有效期天数")
    @TableField("valid_days")
    private Integer validDays;
}
