/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2017年12月19日 18:42
 * @Copyright ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.datas.common.cluster.command;

/**
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2017年12月19日 18:42
 * @version: V1.0
 * @review: zhangkewei[zhang_kw@suixingpay.com]/2017年12月19日 18:42
 */
public class TaskAssignedCommand implements ClusterCommand {
    private final String taskId;
    private final String topic;
    public TaskAssignedCommand(String taskId, String topic) {
        this.taskId = taskId;
        this.topic = topic;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTopic() {
        return topic;
    }
}
