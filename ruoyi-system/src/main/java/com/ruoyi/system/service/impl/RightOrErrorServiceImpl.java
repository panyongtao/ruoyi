package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RightOrErrorMapper;
import com.ruoyi.system.domain.RightOrError;
import com.ruoyi.system.service.IRightOrErrorService;
import com.ruoyi.common.core.text.Convert;

/**
 * rightOrErrorService业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
@Service
public class RightOrErrorServiceImpl implements IRightOrErrorService 
{
    @Autowired
    private RightOrErrorMapper rightOrErrorMapper;

    /**
     * 查询rightOrError
     * 
     * @param id rightOrError主键
     * @return rightOrError
     */
    @Override
    public RightOrError selectRightOrErrorById(Long id)
    {
        return rightOrErrorMapper.selectRightOrErrorById(id);
    }

    /**
     * 查询rightOrError列表
     * 
     * @param rightOrError rightOrError
     * @return rightOrError
     */
    @Override
    public List<RightOrError> selectRightOrErrorList(RightOrError rightOrError)
    {
        return rightOrErrorMapper.selectRightOrErrorList(rightOrError);
    }

    /**
     * 新增rightOrError
     * 
     * @param rightOrError rightOrError
     * @return 结果
     */
    @Override
    public int insertRightOrError(RightOrError rightOrError)
    {
        return rightOrErrorMapper.insertRightOrError(rightOrError);
    }

    /**
     * 修改rightOrError
     * 
     * @param rightOrError rightOrError
     * @return 结果
     */
    @Override
    public int updateRightOrError(RightOrError rightOrError)
    {
        return rightOrErrorMapper.updateRightOrError(rightOrError);
    }

    /**
     * 批量删除rightOrError
     * 
     * @param ids 需要删除的rightOrError主键
     * @return 结果
     */
    @Override
    public int deleteRightOrErrorByIds(String ids)
    {
        return rightOrErrorMapper.deleteRightOrErrorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除rightOrError信息
     * 
     * @param id rightOrError主键
     * @return 结果
     */
    @Override
    public int deleteRightOrErrorById(Long id)
    {
        return rightOrErrorMapper.deleteRightOrErrorById(id);
    }
}
