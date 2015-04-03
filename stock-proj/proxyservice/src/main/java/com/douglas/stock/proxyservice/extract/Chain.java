package com.douglas.stock.proxyservice.extract;

import cn.edu.hfut.dmic.webcollector.model.Links;
import com.douglas.stock.proxyservice.EnhancedProxy;
import douglas.proxy.extract.YDLProxyExtractor;

import java.util.List;
import java.util.concurrent.BlockingDeque;

/**
 * Created by wgz on 15/4/3.
 */
public class Chain {
    private YDLLinkExtractor linkExtractor = new YDLLinkExtractor();
    private YDLProxyExtractor proxyExtractor = new YDLProxyExtractor();
    private List<String> seeds;

    public List<String> getSeeds() {
        return seeds;
    }

    public void setSeeds(List<String> seeds) {
        this.seeds = seeds;
    }

    public Links extract(BlockingDeque<EnhancedProxy> queue) {
        for (String seed : seeds) {
            List links = linkExtractor.extract(seed);
            for (Object link : links) {
                List proxys = proxyExtractor.extract((String)link);
                for (Object proxy : proxys) {
                    if (proxy != null) {
                        queue.add((EnhancedProxy) proxy);
                    }
                }
            }
        }
        return null;
    }

}
