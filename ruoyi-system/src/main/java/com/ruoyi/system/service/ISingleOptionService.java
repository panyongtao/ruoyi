package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SingleOption;

/**
 * singleOptionService接口
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
public interface ISingleOptionService 
{
    /**
     * 查询singleOption
     * 
     * @param id singleOption主键
     * @return singleOption
     */
    public SingleOption selectSingleOptionById(Long id);

    /**
     * 查询singleOption列表
     * 
     * @param singleOption singleOption
     * @return singleOption集合
     */
    public List<SingleOption> selectSingleOptionList(SingleOption singleOption);

    /**
     * 新增singleOption
     * 
     * @param singleOption singleOption
     * @return 结果
     */
    public int insertSingleOption(SingleOption singleOption);

    /**
     * 修改singleOption
     * 
     * @param singleOption singleOption
     * @return 结果
     */
    public int updateSingleOption(SingleOption singleOption);

    /**
     * 批量删除singleOption
     * 
     * @param ids 需要删除的singleOption主键集合
     * @return 结果
     */
    public int deleteSingleOptionByIds(String ids);

    /**
     * 删除singleOption信息
     * 
     * @param id singleOption主键
     * @return 结果
     */
    public int deleteSingleOptionById(Long id);
}
