package me.zhengjie.repository;

import me.zhengjie.domain.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/1/1110:29
 **/
@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Long>,JpaSpecificationExecutor<StudentInfo> {
}
