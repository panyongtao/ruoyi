package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ManyOptionMapper;
import com.ruoyi.system.domain.ManyOption;
import com.ruoyi.system.service.IManyOptionService;
import com.ruoyi.common.core.text.Convert;

/**
 * manyoptionService业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
@Service
public class ManyOptionServiceImpl implements IManyOptionService 
{
    @Autowired
    private ManyOptionMapper manyOptionMapper;

    /**
     * 查询manyoption
     * 
     * @param id manyoption主键
     * @return manyoption
     */
    @Override
    public ManyOption selectManyOptionById(Long id)
    {
        return manyOptionMapper.selectManyOptionById(id);
    }

    /**
     * 查询manyoption列表
     * 
     * @param manyOption manyoption
     * @return manyoption
     */
    @Override
    public List<ManyOption> selectManyOptionList(ManyOption manyOption)
    {
        return manyOptionMapper.selectManyOptionList(manyOption);
    }

    /**
     * 新增manyoption
     * 
     * @param manyOption manyoption
     * @return 结果
     */
    @Override
    public int insertManyOption(ManyOption manyOption)
    {
        return manyOptionMapper.insertManyOption(manyOption);
    }

    /**
     * 修改manyoption
     * 
     * @param manyOption manyoption
     * @return 结果
     */
    @Override
    public int updateManyOption(ManyOption manyOption)
    {
        return manyOptionMapper.updateManyOption(manyOption);
    }

    /**
     * 批量删除manyoption
     * 
     * @param ids 需要删除的manyoption主键
     * @return 结果
     */
    @Override
    public int deleteManyOptionByIds(String ids)
    {
        return manyOptionMapper.deleteManyOptionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除manyoption信息
     * 
     * @param id manyoption主键
     * @return 结果
     */
    @Override
    public int deleteManyOptionById(Long id)
    {
        return manyOptionMapper.deleteManyOptionById(id);
    }
}
