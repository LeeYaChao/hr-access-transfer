package com.hrdata.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitDataListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(InitDataListener.class);

    public  static List<String> personTypeList = new ArrayList<>();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            if (event.getApplicationContext().getParent() == null) {
                personTypeList.add(PersonType.ZZ.getValue());
                personTypeList.add(PersonType.BW.getValue());
                personTypeList.add(PersonType.DF.getValue());
                personTypeList.add(PersonType.LT.getValue());
                personTypeList.add(PersonType.LW.getValue());
            }
        }catch (Exception e){
            LOG.error("处理静态资源异常");
        }
    }
}
