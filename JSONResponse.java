package org.eample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * http响应json数据，前后端统一约定的json格式
 * 响应状态码都是200，进入ajax的success来使用
 */
@Getter
@Setter
@ToString
public class JSONResponse {
    //业务操作是否成功
    private boolean success;
    //业务操作消息码，出现错误时才有意义,给开发人员定位错误
    private String code;
    //业务操作的错误消息，给用户看的信息
    private String message;
    //业务数：业务操作成功时，给前端ajax success方法使用，解析json数据，渲染网页内
    private Object data;





}
