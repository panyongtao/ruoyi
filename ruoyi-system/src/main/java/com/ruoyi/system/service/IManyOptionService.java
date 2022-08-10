package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ManyOption;

/**
 * manyoptionService接口
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
public interface IManyOptionService 
{
    /**
     * 查询manyoption
     * 
     * @param id manyoption主键
     * @return manyoption
     */
    public ManyOption selectManyOptionById(Long id);

    /**
     * 查询manyoption列表
     * 
     * @param manyOption manyoption
     * @return manyoption集合
     */
    public List<ManyOption> selectManyOptionList(ManyOption manyOption);

    /**
     * 新增manyoption
     * 
     * @param manyOption manyoption
     * @return 结果
     */
    public int insertManyOption(ManyOption manyOption);

    /**
     * 修改manyoption
     * 
     * @param manyOption manyoption
     * @return 结果
     */
    public int updateManyOption(ManyOption manyOption);

    /**
     * 批量删除manyoption
     * 
     * @param ids 需要删除的manyoption主键集合
     * @return 结果
     */
    public int deleteManyOptionByIds(String ids);

    /**
     * 删除manyoption信息
     * 
     * @param id manyoption主键
     * @return 结果
     */
    public int deleteManyOptionById(Long id);
}
