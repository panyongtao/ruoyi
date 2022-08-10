package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * rightOrError对象 right_or_error
 * 
 * @author ruoyi
 * @date 2022-08-03
 */
public class RightOrError extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 题干 */
    @Excel(name = "题干")
    private String questionContent;

    /** 问题答案 */
    @Excel(name = "问题答案")
    private String questionAnswer;

    /** 问题分类 */
    @Excel(name = "问题分类")
    private String questionType;

    /** 问题难度 */
    @Excel(name = "问题难度")
    private String questionClass;

    /** 问题解析 */
    @Excel(name = "问题解析")
    private String questionAnalysis;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setQuestionContent(String questionContent) 
    {
        this.questionContent = questionContent;
    }

    public String getQuestionContent() 
    {
        return questionContent;
    }
    public void setQuestionAnswer(String questionAnswer) 
    {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnswer() 
    {
        return questionAnswer;
    }
    public void setQuestionType(String questionType) 
    {
        this.questionType = questionType;
    }

    public String getQuestionType() 
    {
        return questionType;
    }
    public void setQuestionClass(String questionClass) 
    {
        this.questionClass = questionClass;
    }

    public String getQuestionClass() 
    {
        return questionClass;
    }
    public void setQuestionAnalysis(String questionAnalysis) 
    {
        this.questionAnalysis = questionAnalysis;
    }

    public String getQuestionAnalysis() 
    {
        return questionAnalysis;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("questionContent", getQuestionContent())
            .append("questionAnswer", getQuestionAnswer())
            .append("questionType", getQuestionType())
            .append("questionClass", getQuestionClass())
            .append("questionAnalysis", getQuestionAnalysis())
            .toString();
    }
}
