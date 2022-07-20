package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Student;

/**
 * 学生表Service接口
 * 
 * @author ruoyi
 * @date 2022-07-20
 */
public interface IStudentService 
{
    /**
     * 查询学生表
     * 
     * @param id 学生表主键
     * @return 学生表
     */
    public Student selectStudentById(Long id);

    /**
     * 查询学生表列表
     * 
     * @param student 学生表
     * @return 学生表集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生表
     * 
     * @param student 学生表
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生表
     * 
     * @param student 学生表
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 批量删除学生表
     * 
     * @param ids 需要删除的学生表主键集合
     * @return 结果
     */
    public int deleteStudentByIds(String ids);

    /**
     * 删除学生表信息
     * 
     * @param id 学生表主键
     * @return 结果
     */
    public int deleteStudentById(Long id);
}
