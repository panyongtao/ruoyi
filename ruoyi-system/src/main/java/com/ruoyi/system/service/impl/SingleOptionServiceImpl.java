package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SingleOptionMapper;
import com.ruoyi.system.domain.SingleOption;
import com.ruoyi.system.service.ISingleOptionService;
import com.ruoyi.common.core.text.Convert;

/**
 * singleOptionService业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
@Service
public class SingleOptionServiceImpl implements ISingleOptionService 
{
    @Autowired
    private SingleOptionMapper singleOptionMapper;

    /**
     * 查询singleOption
     * 
     * @param id singleOption主键
     * @return singleOption
     */
    @Override
    public SingleOption selectSingleOptionById(Long id)
    {
        return singleOptionMapper.selectSingleOptionById(id);
    }

    /**
     * 查询singleOption列表
     * 
     * @param singleOption singleOption
     * @return singleOption
     */
    @Override
    public List<SingleOption> selectSingleOptionList(SingleOption singleOption)
    {
        return singleOptionMapper.selectSingleOptionList(singleOption);
    }

    /**
     * 新增singleOption
     * 
     * @param singleOption singleOption
     * @return 结果
     */
    @Override
    public int insertSingleOption(SingleOption singleOption)
    {
        return singleOptionMapper.insertSingleOption(singleOption);
    }

    /**
     * 修改singleOption
     * 
     * @param singleOption singleOption
     * @return 结果
     */
    @Override
    public int updateSingleOption(SingleOption singleOption)
    {
        return singleOptionMapper.updateSingleOption(singleOption);
    }

    /**
     * 批量删除singleOption
     * 
     * @param ids 需要删除的singleOption主键
     * @return 结果
     */
    @Override
    public int deleteSingleOptionByIds(String ids)
    {
        return singleOptionMapper.deleteSingleOptionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除singleOption信息
     * 
     * @param id singleOption主键
     * @return 结果
     */
    @Override
    public int deleteSingleOptionById(Long id)
    {
        return singleOptionMapper.deleteSingleOptionById(id);
    }
}
