/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2017年12月25日 19:23
 * @Copyright ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.datas.node.task.extract.extractor;

import com.suixingpay.datas.node.core.event.ETLBucket;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2017年12月25日 19:23
 * @version: V1.0
 * @review: zhangkewei[zhang_kw@suixingpay.com]/2017年12月25日 19:23
 */
@Component
@Scope("singleton")
public class ExtractorFactory {
    private List<Extractor> extractors = SpringFactoriesLoader.loadFactories(Extractor.class, null);
    public void extract(ETLBucket bucket) {
        for (Extractor extractor : extractors) {
            extractor.extract(bucket);
        }
    }
}
