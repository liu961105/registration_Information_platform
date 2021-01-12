package me.zhengjie.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * (StudentInfo)实体类
 *
 * @author makejava
 * @since 2021-01-11 10:17:06
 */
@Data
@Table(name = "student_info")
@Entity
public class StudentInfo implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    /**
     * 学号
     */
    private Long userNumber;
    /**
     * 学生姓名
     */
    private String userName;
    /**
     * 学生年龄
     */
    private Long userAge;
    /**
     * 学生年级
     */
    private String userGrade;
    /**
     * 学生班级
     */
    private String userClass;
    /**
     * 学生性别
     */
    private String userGender;
    /**
     * 籍贯
     */
    private String userHometown;
    /**
     * 电话
     */
    private String userPhone;
    /**
     * 地址
     */
    private String userAddress;
    /**
     * 备注
     */
    private String userRemark;
    @CreationTimestamp
    private Timestamp createTime;
    private String createUser;
    @UpdateTimestamp
    private Timestamp updateTime;
    private String updateUser;
}