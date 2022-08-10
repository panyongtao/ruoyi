package com.ruoyi.system.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.RightOrError;
import com.ruoyi.system.service.IRightOrErrorService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * rightOrErrorController
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
@Controller
@RequestMapping("/system/rightOrError")
public class RightOrErrorController extends BaseController
{
    private String prefix = "system/rightOrError";

    @Autowired
    private IRightOrErrorService rightOrErrorService;

    @RequiresPermissions("system:rightOrError:view")
    @GetMapping()
    public String rightOrError()
    {
        return prefix + "/rightOrError";
    }

    /**
     * 查询rightOrError列表
     */
    @RequiresPermissions("system:rightOrError:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RightOrError rightOrError)
    {
        startPage();
        List<RightOrError> list = rightOrErrorService.selectRightOrErrorList(rightOrError);
        return getDataTable(list);
    }

    /**
     * 导出rightOrError列表
     */
    @RequiresPermissions("system:rightOrError:export")
    @Log(title = "rightOrError", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RightOrError rightOrError)
    {
        List<RightOrError> list = rightOrErrorService.selectRightOrErrorList(rightOrError);
        ExcelUtil<RightOrError> util = new ExcelUtil<RightOrError>(RightOrError.class);
        return util.exportExcel(list, "rightOrError数据");
    }

    /**
     * 新增rightOrError
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存rightOrError
     */
    @RequiresPermissions("system:rightOrError:add")
    @Log(title = "rightOrError", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RightOrError rightOrError)
    {
        return toAjax(rightOrErrorService.insertRightOrError(rightOrError));
    }

    /**
     * 修改rightOrError
     */
    @RequiresPermissions("system:rightOrError:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RightOrError rightOrError = rightOrErrorService.selectRightOrErrorById(id);
        mmap.put("rightOrError", rightOrError);
        return prefix + "/edit";
    }

    /**
     * 修改保存rightOrError
     */
    @RequiresPermissions("system:rightOrError:edit")
    @Log(title = "rightOrError", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RightOrError rightOrError)
    {
        return toAjax(rightOrErrorService.updateRightOrError(rightOrError));
    }

    /**
     * 删除rightOrError
     */
    @RequiresPermissions("system:rightOrError:remove")
    @Log(title = "rightOrError", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rightOrErrorService.deleteRightOrErrorByIds(ids));
    }
}
