package me.zhengjie.service.dto;

import lombok.Data;
import me.zhengjie.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * 日志查询类
 * @author Zheng Jie
 * @date 2019-6-4 09:23:07
 */
@Data
public class StudentInfoQueryCriteria {

    @Query(blurry = "userName,userGrade,userNumber,userGender")
    private String blurry;
    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
