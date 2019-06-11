package com.zxk.elasticsearch;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

/**
 * @Description: ES高级JAVA客户端
 * @Author: zhuxiaokang
 * @CreateDate: 2019/1/22 11:09
 * @Version: 1.0
 */
public class ElasticHighClient {

    private static class SingleClient {
        public static RestHighLevelClient highClient = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("host.es",9200,"http")
                )
        );
    }

    /**
     * 获取es客户端
     * @return
     */
    public static RestHighLevelClient initClient(){
        return SingleClient.highClient;
    }

    /**
     * 关闭客户端。 释放资源
     * @param highClient
     */
    public static void close(RestHighLevelClient highClient){
        if (highClient == null) {
            return;
        }
        try {
            highClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
