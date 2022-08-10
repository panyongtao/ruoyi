package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.RightOrError;

/**
 * rightOrErrorService接口
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
public interface IRightOrErrorService 
{
    /**
     * 查询rightOrError
     * 
     * @param id rightOrError主键
     * @return rightOrError
     */
    public RightOrError selectRightOrErrorById(Long id);

    /**
     * 查询rightOrError列表
     * 
     * @param rightOrError rightOrError
     * @return rightOrError集合
     */
    public List<RightOrError> selectRightOrErrorList(RightOrError rightOrError);

    /**
     * 新增rightOrError
     * 
     * @param rightOrError rightOrError
     * @return 结果
     */
    public int insertRightOrError(RightOrError rightOrError);

    /**
     * 修改rightOrError
     * 
     * @param rightOrError rightOrError
     * @return 结果
     */
    public int updateRightOrError(RightOrError rightOrError);

    /**
     * 批量删除rightOrError
     * 
     * @param ids 需要删除的rightOrError主键集合
     * @return 结果
     */
    public int deleteRightOrErrorByIds(String ids);

    /**
     * 删除rightOrError信息
     * 
     * @param id rightOrError主键
     * @return 结果
     */
    public int deleteRightOrErrorById(Long id);
}
