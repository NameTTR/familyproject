package com.family.us.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 测试对象 us_user
 *
 * @author 高俊炜
 * @date 2024-04-17
 */
public class UsUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 ; 主键 */
    @JsonProperty(value = "ID")
    private Long ID;

    /** 账号 */
    @Excel(name = "账号")
    @JsonProperty(value = "account")
    private String account;

    /** 密码 */
    @Excel(name = "密码")
    @JsonProperty(value = "password")
    private String password;

    /** 头像 */
    @Excel(name = "头像")
    @JsonProperty(value = "face")
    private String face;

    /** 昵称 */
    @Excel(name = "昵称")
    @JsonProperty(value = "nickname")
    private String nickname;

    /** 性别 ; 1：男；2：女 */
    @Excel(name = "性别 ; 1：男；2：女")
    @JsonProperty(value = "sex")
    private Integer sex;

    @Excel(name = "出生年份")
    @JsonProperty(value = "born")
    private Integer born;

    /** 年级 ; 0：未上学；1：小班；2：中班：3：大班；4：一年级；…...小孩角色才显示这一段 */
    @Excel(name = "年级 ; 0：未上学；1：小班；2：中班：3：大班；4：一年级；…...小孩角色才显示这一段")
    @JsonProperty(value = "grade")
    private Integer grade;

    /** 背景 ; 主页上方的背景图 */
    @Excel(name = "背景 ; 主页上方的背景图")
    @JsonProperty(value = "background")
    private String background;

    /** 家庭ID ; 家庭表外键 */
    @Excel(name = "家庭ID ; 家庭表外键")
    @JsonProperty(value = "familyId")
    private Integer familyId;

    /** 家庭角色ID ; 角色表外键 */
    @Excel(name = "家庭角色ID ; 角色表外键")
    @JsonProperty(value = "roleId")
    private Integer roleId;

    /** 角色：1：爸爸；2：妈妈；3：儿子；4：女儿  */
    @Excel(name = "角色：1：爸爸；2：妈妈；3：儿子；4：女儿 ")
    @JsonProperty(value = "role")
    private Integer role;

    /** 地区ID ; 地区表外键 */
    @Excel(name = "地区ID ; 地区表外键")
    @JsonProperty(value = "districtId")
    private Integer districtId;

    /** 地区名称 ; 地区冗余字段 */
    @Excel(name = "地区名称 ; 地区冗余字段")
    @JsonProperty(value = "districtName")
    private String districtName;

    /** 职业ID ; 职业表外键，家长角色才显示这一段 */
    @Excel(name = "职业ID ; 职业表外键，家长角色才显示这一段")
    @JsonProperty(value = "jobId")
    private Integer jobId;

    /** 职业名称 ; 职业冗余字段，家长角色才显示这一段 */
    @Excel(name = "职业名称 ; 职业冗余字段，家长角色才显示这一段")
    @JsonProperty(value = "jobName")
    private String jobName;

    /** 会员类型ID ; 会员类型表外键 */
    @Excel(name = "会员类型ID ; 会员类型表外键")
    @JsonProperty(value = "memberTypeId")
    private Long memberTypeId;

    /** 会员名称 ; 会员冗余字段 */
    @Excel(name = "会员名称 ; 会员冗余字段")
    @JsonProperty(value = "memberName")
    private String memberName;

    /** 会员到期时间 ; 会员冗余字段 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "会员到期时间 ; 会员冗余字段", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonProperty(value = "expirationTime")
    private Date expirationTime;

    /** 手机号 ; 小孩角色可以不填写手机号 */
    @Excel(name = "手机号 ; 小孩角色可以不填写手机号")
    @JsonProperty(value = "tel")
    private String tel;

    /** 通知设置 ; 0：不允许；1：已允许 */
    @Excel(name = "通知设置 ; 0：不允许；1：已允许")
    @JsonProperty(value = "notice")
    private Integer notice = 1;

    /** 铃声 ; 铃声编号 */
    @Excel(name = "铃声 ; 铃声编号")
    @JsonProperty(value = "bells")
    private Integer bells = 1;

    /** 振动 ; 0：不振动；1：开启；2：跟随系统 */
    @Excel(name = "振动 ; 0：不振动；1：开启；2：跟随系统")
    @JsonProperty(value = "vibrate")
    private Integer vibrate = 1;

    /** 隐私设置_个性化推荐 ; 0：不允许；1：已允许 */
    @Excel(name = "隐私设置_个性化推荐 ; 0：不允许；1：已允许")
    @JsonProperty(value = "privacyRecommend")
    private Integer privacyRecommend = 1;

    /** 隐私设置_访问相机 ; 0：不允许；1：已允许 */
    @Excel(name = "隐私设置_访问相机 ; 0：不允许；1：已允许")
    @JsonProperty(value = "privacyCamera")
    private Integer privacyCamera;

    /** 隐私设置_访问相册 ; 0：不允许；1：已允许 */
    @Excel(name = "隐私设置_访问相册 ; 0：不允许；1：已允许")
    @JsonProperty(value = "privacyAlbum")
    private Integer privacyAlbum;

    /** 隐私设置_访问麦克风 ; 0：不允许；1：已允许 */
    @Excel(name = "隐私设置_访问麦克风 ; 0：不允许；1：已允许")
    @JsonProperty(value = "privacyMike")
    private Integer privacyMike;

    /** 青少年模式 ; 0：已关闭；1：已开启，小孩角色默认设置为青少年模式 */
    @Excel(name = "青少年模式 ; 0：已关闭；1：已开启，小孩角色默认设置为青少年模式")
    @JsonProperty(value = "teenageMode")
    private Integer teenageMode;

    /** 余额 ; 提现返现额度 */
    @Excel(name = "余额 ; 提现返现额度")
    @JsonProperty(value = "balance")
    private Double balance = 0.00;

    /** 账号是否有效 ; 0：注销；1：正常 */
    @Excel(name = "账号是否有效 ; 0：注销；1：正常")
    @JsonProperty(value = "cancellation")
    private Integer cancellation = 1;

    /** 任务数 */
    @Excel(name = "任务数")
    @JsonProperty(value = "countTask")
    private Integer countTask = 0;

    /** 工具数 */
    @Excel(name = "工具数")
    @JsonProperty(value = "countTool")
    private Integer countTool = 0;

    /** 问答数 */
    @Excel(name = "问答数")
    @JsonProperty(value = "countQuestions")
    private Integer countQuestions = 0;

    /** 测评数 */
    @Excel(name = "测评数")
    @JsonProperty(value = "countTest")
    private Integer countTest = 0;

    /** 创建用户 */
    @Excel(name = "创建用户")
    @JsonProperty(value = "createdUserId")
    private Integer createdUserId;

    /** 更新用户 */
    @Excel(name = "更新用户")
    @JsonProperty(value = "updateUserId")
    private Long updateUserId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonProperty(value = "createdTime")
    private Date createdTime;

    /** 删除标记 */
    @Excel(name = "删除标记")
    @JsonProperty(value = "flagDelete")
    private Integer flagDelete;

    public void setID(Long ID)
    {
        this.ID = ID;
    }

    public Long getID()
    {
        return ID;
    }
    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getAccount()
    {
        return account;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
    public void setFace(String face)
    {
        this.face = face;
    }

    public String getFace()
    {
        return face;
    }
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getNickname()
    {
        return nickname;
    }
    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public Integer getSex()
    {
        return sex;
    }
    public Integer getBorn() {
        return born;
    }

    public void setBorn(Integer born) {
        this.born = born;
    }
    public void setGrade(Integer grade)
    {
        this.grade = grade;
    }

    public Integer getGrade()
    {
        return grade;
    }
    public void setBackground(String background)
    {
        this.background = background;
    }

    public String getBackground()
    {
        return background;
    }
    public void setFamilyId(Integer familyId)
    {
        this.familyId = familyId;
    }

    public Integer getFamilyId()
    {
        return familyId;
    }
    public void setRoleId(Integer roleId)
    {
        this.roleId = roleId;
    }

    public Integer getRoleId()
    {
        return roleId;
    }
    public void setDistrictId(Integer districtId)
    {
        this.districtId = districtId;
    }

    public Integer getRole() {
        return role;
    }
    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getDistrictId()
    {
        return districtId;
    }
    public void setDistrictName(String districtName)
    {
        this.districtName = districtName;
    }

    public String getDistrictName()
    {
        return districtName;
    }
    public void setJobId(Integer jobId)
    {
        this.jobId = jobId;
    }

    public Integer getJobId()
    {
        return jobId;
    }
    public void setJobName(String jobName)
    {
        this.jobName = jobName;
    }

    public String getJobName()
    {
        return jobName;
    }
    public void setMemberTypeId(Long memberTypeId)
    {
        this.memberTypeId = memberTypeId;
    }

    public Long getMemberTypeId()
    {
        return memberTypeId;
    }
    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public String getMemberName()
    {
        return memberName;
    }
    public void setExpirationTime(Date expirationTime)
    {
        this.expirationTime = expirationTime;
    }

    public Date getExpirationTime()
    {
        return expirationTime;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getTel()
    {
        return tel;
    }
    public void setNotice(Integer notice)
    {
        this.notice = notice;
    }

    public Integer getNotice()
    {
        return notice;
    }
    public void setBells(Integer bells)
    {
        this.bells = bells;
    }

    public Integer getBells()
    {
        return bells;
    }
    public void setVibrate(Integer vibrate)
    {
        this.vibrate = vibrate;
    }

    public Integer getVibrate()
    {
        return vibrate;
    }
    public void setPrivacyRecommend(Integer privacyRecommend)
    {
        this.privacyRecommend = privacyRecommend;
    }

    public Integer getPrivacyRecommend()
    {
        return privacyRecommend;
    }
    public void setPrivacyCamera(Integer privacyCamera)
    {
        this.privacyCamera = privacyCamera;
    }

    public Integer getPrivacyCamera()
    {
        return privacyCamera;
    }
    public void setPrivacyAlbum(Integer privacyAlbum)
    {
        this.privacyAlbum = privacyAlbum;
    }

    public Integer getPrivacyAlbum()
    {
        return privacyAlbum;
    }
    public void setPrivacyMike(Integer privacyMike)
    {
        this.privacyMike = privacyMike;
    }

    public Integer getPrivacyMike()
    {
        return privacyMike;
    }
    public void setTeenageMode(Integer teenageMode)
    {
        this.teenageMode = teenageMode;
    }

    public Integer getTeenageMode()
    {
        return teenageMode;
    }
    public void setBalance(Double balance)
    {
        this.balance = balance;
    }

    public Double getBalance()
    {
        return balance;
    }
    public void setCancellation(Integer cancellation)
    {
        this.cancellation = cancellation;
    }

    public Integer getCancellation()
    {
        return cancellation;
    }
    public void setCountTask(Integer countTask)
    {
        this.countTask = countTask;
    }

    public Integer getCountTask()
    {
        return countTask;
    }
    public void setCountTool(Integer countTool)
    {
        this.countTool = countTool;
    }

    public Integer getCountTool()
    {
        return countTool;
    }
    public void setCountQuestions(Integer countQuestions)
    {
        this.countQuestions = countQuestions;
    }

    public Integer getCountQuestions()
    {
        return countQuestions;
    }
    public void setCountTest(Integer countTest)
    {
        this.countTest = countTest;
    }

    public Integer getCountTest()
    {
        return countTest;
    }
    public void setCreatedUserId(Integer createdUserId)
    {
        this.createdUserId = createdUserId;
    }

    public Integer getCreatedUserId()
    {
        return createdUserId;
    }
    public void setUpdateUserId(Long updateUserId)
    {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateUserId()
    {
        return updateUserId;
    }
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }
    public void setFlagDelete(Integer flagDelete)
    {
        this.flagDelete = flagDelete;
    }

    public Integer getFlagDelete()
    {
        return flagDelete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("ID", getID())
                .append("account", getAccount())
                .append("password", getPassword())
                .append("face", getFace())
                .append("nickname", getNickname())
                .append("sex", getSex())
                .append("born", getBorn())
                .append("grade", getGrade())
                .append("background", getBackground())
                .append("familyId", getFamilyId())
                .append("roleId", getRoleId())
                .append("role", getRole())
                .append("districtId", getDistrictId())
                .append("districtName", getDistrictName())
                .append("jobId", getJobId())
                .append("jobName", getJobName())
                .append("memberTypeId", getMemberTypeId())
                .append("memberName", getMemberName())
                .append("expirationTime", getExpirationTime())
                .append("tel", getTel())
                .append("notice", getNotice())
                .append("bells", getBells())
                .append("vibrate", getVibrate())
                .append("privacyRecommend", getPrivacyRecommend())
                .append("privacyCamera", getPrivacyCamera())
                .append("privacyAlbum", getPrivacyAlbum())
                .append("privacyMike", getPrivacyMike())
                .append("teenageMode", getTeenageMode())
                .append("balance", getBalance())
                .append("cancellation", getCancellation())
                .append("countTask", getCountTask())
                .append("countTool", getCountTool())
                .append("countQuestions", getCountQuestions())
                .append("countTest", getCountTest())
                .append("createdUserId", getCreatedUserId())
                .append("updateUserId", getUpdateUserId())
                .append("createdTime", getCreatedTime())
                .append("updateTime", getUpdateTime())
                .append("flagDelete", getFlagDelete())
                .toString();
    }
}
