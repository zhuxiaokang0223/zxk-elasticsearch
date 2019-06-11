package com.zxk.elasticsearch.high.api;

import com.zxk.elasticsearch.ElasticHighClient;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.document.DocumentField;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * @Description: Get API
 * @Author: zhuxiaokang
 * @CreateDate: 2019/1/22 11:50
 * @Version: 1.0
 */
public class Get {

    RestHighLevelClient client = ElasticHighClient.initClient();

    /*public void invoke() throws IOException {
        GetRequest getRequest = new GetRequest("xiyou_prod$t_task_student", "doc", "c7f7f251_1754");
        GetResponse response = client.get(getRequest);

        DocumentField documentField = response.getField("name");
        Map<String, DocumentField> documentFieldMap = response.getFields();
        Map<String, Object> objectMap = response.getSource();
        Map<String, Object> objectMap1 = response.getSourceAsMap();
        String source = response.getSourceAsString();
        System.err.println(11);
    }*/

    public void invoke() throws IOException {
        GetRequest getRequest = new GetRequest("xiyou_prod$t_task_student", "doc", "c7f7f251_1754");
        GetResponse response = client.get(getRequest);
        DocumentField documentField = response.getField("name");
        Map<String, DocumentField> documentFieldMap = response.getFields();
        Map<String, Object> objectMap = response.getSource();
        Map<String, Object> objectMap1 = response.getSourceAsMap();
        String source = response.getSourceAsString();
        System.err.println(11);
    }

    public static void main(String[] args) throws IOException {
        List<Map<String, Object>> protocolStatisticals = new ArrayList<>();

        Map<String, Object> protocolStatistical = new HashMap<>();
        protocolStatistical.put("protocolKey", "a");
        protocolStatistical.put("studentNumber", 1L);
        protocolStatisticals.add(protocolStatistical);

        Map<String, Object> protocolStatistical1 = new HashMap<>();
        protocolStatistical1.put("protocolKey", "a");
        protocolStatistical1.put("studentNumber", 1L);
        protocolStatisticals.add(protocolStatistical1);

        Map<String, Object> protocolStatistical2 = new HashMap<>();
        protocolStatistical2.put("protocolKey", "a");
        protocolStatistical2.put("studentNumber", 1L);
        protocolStatisticals.add(protocolStatistical2);

       LongSummaryStatistics longSummaryStatistics = protocolStatisticals.stream().collect(Collectors.summarizingLong(value -> (Long)value.get("studentNumber")));
        System.err.println(longSummaryStatistics.getCount());
    }
}
