package me.zhengjie.rest;

import io.swagger.annotations.ApiOperation;
import me.zhengjie.service.dto.StudentInfoQueryCriteria;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/1/12 14:58
 **/
@RestController
@RequestMapping("/api/studentInfo")
public class StudentInfoController {
    @GetMapping("/queryUser")
    @ApiOperation("列表查询")
    @PreAuthorize("@el.check('user:list')")
    public void queryUser(StudentInfoQueryCriteria criteria, Pageable pageable) {
        System.out.println("dada dad");
    }
}

