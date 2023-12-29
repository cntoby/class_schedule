package com.tencent.wxcloudrun.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 课程设置表
 * @TableName courses
 */
@TableName(value ="courses")
@Data
public class Course implements Serializable {
    /**
     * 课程ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程名
     */
    private String title;

    /**
     * 课程ICON
     */
    private String icon;

    /**
     * 主图片
     */
    private String image;

    /**
     * 主要负责老师ID
     */
    private Long teacherId;

    /**
     * 年龄限制
     */
    private Integer ageLimit;

    /**
     * 年级限制
     */
    private Integer gradeLimit;

    /**
     * 是否可报名
     */
    private String enableApply;

    /**
     * 学生数上限
     */
    private Integer studentLimit;

    /**
     * 课数
     */
    private Integer lessonNumber;

    /**
     * 每节课时长
     */
    private Integer duration;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 学费金额
     */
    private Integer tuition;

    /**
     * 课程描述
     */
    private String desc;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getAgeLimit() == null ? other.getAgeLimit() == null : this.getAgeLimit().equals(other.getAgeLimit()))
            && (this.getGradeLimit() == null ? other.getGradeLimit() == null : this.getGradeLimit().equals(other.getGradeLimit()))
            && (this.getEnableApply() == null ? other.getEnableApply() == null : this.getEnableApply().equals(other.getEnableApply()))
            && (this.getStudentLimit() == null ? other.getStudentLimit() == null : this.getStudentLimit().equals(other.getStudentLimit()))
            && (this.getLessonNumber() == null ? other.getLessonNumber() == null : this.getLessonNumber().equals(other.getLessonNumber()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getTuition() == null ? other.getTuition() == null : this.getTuition().equals(other.getTuition()))
                && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getAgeLimit() == null) ? 0 : getAgeLimit().hashCode());
        result = prime * result + ((getGradeLimit() == null) ? 0 : getGradeLimit().hashCode());
        result = prime * result + ((getEnableApply() == null) ? 0 : getEnableApply().hashCode());
        result = prime * result + ((getStudentLimit() == null) ? 0 : getStudentLimit().hashCode());
        result = prime * result + ((getLessonNumber() == null) ? 0 : getLessonNumber().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getTuition() == null) ? 0 : getTuition().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", icon=").append(icon);
        sb.append(", image=").append(image);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", ageLimit=").append(ageLimit);
        sb.append(", gradeLimit=").append(gradeLimit);
        sb.append(", enableApply=").append(enableApply);
        sb.append(", studentLimit=").append(studentLimit);
        sb.append(", classTotal=").append(lessonNumber);
        sb.append(", duration=").append(duration);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", tuition=").append(tuition);
        sb.append(", desc=").append(desc);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}