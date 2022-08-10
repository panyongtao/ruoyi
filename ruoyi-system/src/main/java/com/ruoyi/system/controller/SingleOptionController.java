package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SingleOption;
import com.ruoyi.system.service.ISingleOptionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * singleOptionController
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
@Controller
@RequestMapping("/system/singleoption")
public class SingleOptionController extends BaseController
{
    private String prefix = "system/singleoption";

    @Autowired
    private ISingleOptionService singleOptionService;

    @RequiresPermissions("system:singleoption:view")
    @GetMapping()
    public String singleoption()
    {
        return prefix + "/singleoption";
    }

    /**
     * 查询singleOption列表
     */
    @RequiresPermissions("system:singleoption:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SingleOption singleOption)
    {
        startPage();
        List<SingleOption> list = singleOptionService.selectSingleOptionList(singleOption);
        return getDataTable(list);
    }

    /**
     * 导出singleOption列表
     */
    @RequiresPermissions("system:singleoption:export")
    @Log(title = "singleOption", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SingleOption singleOption)
    {
        List<SingleOption> list = singleOptionService.selectSingleOptionList(singleOption);
        ExcelUtil<SingleOption> util = new ExcelUtil<SingleOption>(SingleOption.class);
        return util.exportExcel(list, "singleOption数据");
    }

    /**
     * 新增singleOption
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存singleOption
     */
    @RequiresPermissions("system:singleoption:add")
    @Log(title = "singleOption", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SingleOption singleOption)
    {
        return toAjax(singleOptionService.insertSingleOption(singleOption));
    }

    /**
     * 修改singleOption
     */
    @RequiresPermissions("system:singleoption:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SingleOption singleOption = singleOptionService.selectSingleOptionById(id);
        mmap.put("singleOption", singleOption);
        return prefix + "/edit";
    }

    /**
     * 修改保存singleOption
     */
    @RequiresPermissions("system:singleoption:edit")
    @Log(title = "singleOption", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SingleOption singleOption)
    {
        return toAjax(singleOptionService.updateSingleOption(singleOption));
    }

    /**
     * 删除singleOption
     */
    @RequiresPermissions("system:singleoption:remove")
    @Log(title = "singleOption", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(singleOptionService.deleteSingleOptionByIds(ids));
    }
}
