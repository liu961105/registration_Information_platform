package me.zhengjie.service;

import me.zhengjie.domain.StudentInfo;
import me.zhengjie.service.dto.StudentInfoQueryCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/1/1111:36
 **/
public interface StudentInfoService {

    Object queryAll(StudentInfoQueryCriteria criteria, Pageable pageable);

    /**
     * 查询全部数据
     *
     * @param criteria 查询条件
     * @return /
     */
    List<StudentInfo> queryAll(StudentInfoQueryCriteria criteria);
}
