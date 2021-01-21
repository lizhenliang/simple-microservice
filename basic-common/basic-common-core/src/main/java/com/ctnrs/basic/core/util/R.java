/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.basic.core.util;

import com.ctnrs.basic.core.constant.HttpStatusConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体.
 * @author zibin
 */

@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {

    private static final long serialVersionUID = -7698420285460545393L;

    /** 状态码, 200: 代表成功, 其他值代表失败, -999: 代表未知错误 */
    @Getter
    @Setter
    private Integer status;

    /** 返回消息说明, sucess: 代表成功, fail: 代表失败 **/
    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private T result;

    public R() {
        super();
    }

    public R(T result) {
        super();
        this.status = HttpStatusConstants.HTTP_RES_CODE_200;
        this.result = result;
    }

    public R(T result, String msg) {
        super();
        this.result = result;
        this.msg = msg;
    }

    public R(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.status = HttpStatusConstants.HTTP_RES_CODE_500;
    }


    public boolean hasBody() {
        return this.result != null;
    }
}
