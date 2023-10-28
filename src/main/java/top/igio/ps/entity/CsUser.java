package top.igio.ps.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户信息表
 * @TableName cs_user
 */
@TableName(value ="cs_user")
@Data
public class CsUser implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户年龄
     */
    private Integer userAge;

    /**
     * 用户性别(男,女,未知)
     */
    private String userSex;

    /**
     * 用户头像url
     */
    private String userIconUrl;

    /**
     * 用户身份证号
     */
    private String userIdCard;

    /**
     * 用户生日
     */
    private Date userBirthday;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户手机号
     */
    private String userMobilePhone;

    /**
     * 用户座机号
     */
    private String userTelephone;

    /**
     * 用户角色(0-超级管理员,1-管理员,2-普通用户)
     */
    private Integer userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除(0-未删除,1-已删除)
     */
    private Integer isDeleted;

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
        CsUser other = (CsUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserAge() == null ? other.getUserAge() == null : this.getUserAge().equals(other.getUserAge()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserIconUrl() == null ? other.getUserIconUrl() == null : this.getUserIconUrl().equals(other.getUserIconUrl()))
            && (this.getUserIdCard() == null ? other.getUserIdCard() == null : this.getUserIdCard().equals(other.getUserIdCard()))
            && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserMobilePhone() == null ? other.getUserMobilePhone() == null : this.getUserMobilePhone().equals(other.getUserMobilePhone()))
            && (this.getUserTelephone() == null ? other.getUserTelephone() == null : this.getUserTelephone().equals(other.getUserTelephone()))
            && (this.getUserRole() == null ? other.getUserRole() == null : this.getUserRole().equals(other.getUserRole()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserAge() == null) ? 0 : getUserAge().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserIconUrl() == null) ? 0 : getUserIconUrl().hashCode());
        result = prime * result + ((getUserIdCard() == null) ? 0 : getUserIdCard().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserMobilePhone() == null) ? 0 : getUserMobilePhone().hashCode());
        result = prime * result + ((getUserTelephone() == null) ? 0 : getUserTelephone().hashCode());
        result = prime * result + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(userId);
        sb.append(", user_name=").append(userName);
        sb.append(", user_password=").append(userPassword);
        sb.append(", user_age=").append(userAge);
        sb.append(", user_sex=").append(userSex);
        sb.append(", user_icon_url=").append(userIconUrl);
        sb.append(", user_id_card=").append(userIdCard);
        sb.append(", user_birthday=").append(userBirthday);
        sb.append(", user_address=").append(userAddress);
        sb.append(", user_email=").append(userEmail);
        sb.append(", user_mobile_phone=").append(userMobilePhone);
        sb.append(", user_telephone=").append(userTelephone);
        sb.append(", user_role=").append(userRole);
        sb.append(", create_time=").append(createTime);
        sb.append(", update_time=").append(updateTime);
        sb.append(", is_deleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}