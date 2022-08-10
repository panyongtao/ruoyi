package com.ruoyi.system.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.ManyOption;
import com.ruoyi.system.service.IManyOptionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * manyoptionController
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
@Controller
@RequestMapping("/system/manyoption")
public class ManyOptionController extends BaseController
{
    private String prefix = "system/manyoption";

    @Autowired
    private IManyOptionService manyOptionService;

    @RequiresPermissions("system:manyoption:view")
    @GetMapping()
    public String manyoption()
    {
        return prefix + "/manyoption";
    }

    /**
     * 查询manyoption列表
     */
    @RequiresPermissions("system:manyoption:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ManyOption manyOption)
    {
        startPage();
        List<ManyOption> list = manyOptionService.selectManyOptionList(manyOption);
        return getDataTable(list);
    }

    /**
     * 导出manyoption列表
     */
    @RequiresPermissions("system:manyoption:export")
    @Log(title = "manyoption", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ManyOption manyOption)
    {
        List<ManyOption> list = manyOptionService.selectManyOptionList(manyOption);
        ExcelUtil<ManyOption> util = new ExcelUtil<ManyOption>(ManyOption.class);
        return util.exportExcel(list, "manyoption数据");
    }

    /**
     * 新增manyoption
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存manyoption
     */
    @RequiresPermissions("system:manyoption:add")
    @Log(title = "manyoption", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ManyOption manyOption)
    {
        return toAjax(manyOptionService.insertManyOption(manyOption));
    }

    /**
     * 修改manyoption
     */
    @RequiresPermissions("system:manyoption:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ManyOption manyOption = manyOptionService.selectManyOptionById(id);
        mmap.put("manyOption", manyOption);
        return prefix + "/edit";
    }

    /**
     * 修改保存manyoption
     */
    @RequiresPermissions("system:manyoption:edit")
    @Log(title = "manyoption", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ManyOption manyOption)
    {
        return toAjax(manyOptionService.updateManyOption(manyOption));
    }

    /**
     * 删除manyoption
     */
    @RequiresPermissions("system:manyoption:remove")
    @Log(title = "manyoption", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(manyOptionService.deleteManyOptionByIds(ids));
    }
}
