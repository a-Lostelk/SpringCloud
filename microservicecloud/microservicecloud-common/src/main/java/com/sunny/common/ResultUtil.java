package com.sunny.common;

/**
 * @Author: Sunny
 * @Date: ${DATE}
 * @Created by: IntelliJ idea
 * @Description:
 */
public class ResultUtil {

    /***
     * 成功信息
     * @return
     */
    public String success() {
        Result result = new Result(ResultEnum.SUCCESS.getStatus(), ResultEnum.SUCCESS.getMsg());
        return new JsonUtil().toJson(result);
    }

    /**
     * 失败信息
     * @return
     */
    public String error() {
        Result result = new Result(ResultEnum.ERROR.getStatus(), ResultEnum.ERROR.getMsg());
        return new JsonUtil().toJson(result);
    }
}
