package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.RightOrError;

/**
 * rightOrErrorMapper接口
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
public interface RightOrErrorMapper 
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
     * 删除rightOrError
     * 
     * @param id rightOrError主键
     * @return 结果
     */
    public int deleteRightOrErrorById(Long id);

    /**
     * 批量删除rightOrError
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRightOrErrorByIds(String[] ids);
}
