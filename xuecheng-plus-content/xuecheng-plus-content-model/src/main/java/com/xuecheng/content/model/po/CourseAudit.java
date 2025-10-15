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
 * 
 * </p>
 *
 * @author cxj
 * @since 2025-10-15
 */
@Getter
@Setter
@TableName("course_audit")
@ApiModel(value = "CourseAudit对象", description = "")
public class CourseAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("课程id")
    @TableField("course_id")
    private Long courseId;

    @ApiModelProperty("审核意见")
    @TableField("audit_mind")
    private String auditMind;

    @ApiModelProperty("审核状态")
    @TableField("audit_status")
    private String auditStatus;

    @ApiModelProperty("审核人")
    @TableField("audit_people")
    private String auditPeople;

    @ApiModelProperty("审核时间")
    @TableField("audit_date")
    private LocalDateTime auditDate;
}
