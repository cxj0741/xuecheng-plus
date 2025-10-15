package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * 课程基本信息
 * </p>
 *
 * @author cxj
 * @since 2025-10-15
 */
@Getter
@Setter
@TableName("course_base")
@ApiModel(value = "CourseBase对象", description = "课程基本信息")
public class CourseBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("机构ID")
    @TableField("company_id")
    private Long companyId;

    @ApiModelProperty("机构名称")
    @TableField("company_name")
    private String companyName;

    @ApiModelProperty("课程名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("适用人群")
    @TableField("users")
    private String users;

    @ApiModelProperty("课程标签")
    @TableField("tags")
    private String tags;

    @ApiModelProperty("大分类")
    @TableField("mt")
    private String mt;

    @ApiModelProperty("小分类")
    @TableField("st")
    private String st;

    @ApiModelProperty("课程等级")
    @TableField("grade")
    private String grade;

    @ApiModelProperty("教育模式(common普通，record 录播，live直播等）")
    @TableField("teachmode")
    private String teachmode;

    @ApiModelProperty("课程介绍")
    @TableField("description")
    private String description;

    @ApiModelProperty("课程图片")
    @TableField("pic")
    private String pic;

    @ApiModelProperty("创建时间")
    @TableField("create_date")
    private LocalDateTime createDate;

    @ApiModelProperty("修改时间")
    @TableField("change_date")
    private LocalDateTime changeDate;

    @ApiModelProperty("创建人")
    @TableField("create_people")
    private String createPeople;

    @ApiModelProperty("更新人")
    @TableField("change_people")
    private String changePeople;

    @ApiModelProperty("审核状态")
    @TableField("audit_status")
    private String auditStatus;

    @ApiModelProperty("课程发布状态 未发布  已发布 下线")
    @TableField("status")
    private String status;
}
