/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.basic.core.constant;

/**
 * http请求状态码常量
 * @author zibin
 */
public interface HttpStatusConstants {
    /**
     * 响应请求成功code
     */
    Integer HTTP_RES_CODE_200 = 200;

    /**
     * 404找不到
     */
    Integer HTTP_RES_CODE_404 = 404;

    /**
     * 系统错误内部
     */
    Integer HTTP_RES_CODE_500 = 500;

    /**
     * 未关联QQ账号
     */
    Integer HTTP_RES_CODE_201 = 201;

    /**
     * 未知错误
     */
    Integer HTTP_RES_CODE_999 = -999;

    /**
     * 响应请求成功
     */
    String HTTP_RES_CODE_200_MSG = "success";

    /**
     * 响应请求成功
     */
    String HTTP_RES_CODE_500_MSG = "fail";
}
