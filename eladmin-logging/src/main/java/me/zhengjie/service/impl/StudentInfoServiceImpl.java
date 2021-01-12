package me.zhengjie.service.impl;

import me.zhengjie.domain.StudentInfo;
import me.zhengjie.repository.StudentInfoRepository;
import me.zhengjie.service.StudentInfoService;
import me.zhengjie.service.dto.StudentInfoQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/1/11 11:32
 **/
@Service
public class StudentInfoServiceImpl implements StudentInfoService{
    @Autowired
    private StudentInfoRepository studentInfoRepository;

    @Override
    public Object queryAll(StudentInfoQueryCriteria criteria, Pageable pageable) {
        return null;
    }

    @Override
    public List<StudentInfo> queryAll(StudentInfoQueryCriteria criteria) {
        return null;
    }
}
