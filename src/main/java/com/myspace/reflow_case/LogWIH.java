package com.myspace.reflow_case;


import java.util.HashMap;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogWIH implements WorkItemHandler {
    private static Logger log = LoggerFactory.getLogger(LogWIH.class);
    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        manager.abortWorkItem(workItem.getId();
    }

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        log.info("Log Work Item handler executed");
        manager.completeWorkItem(workItem.getId(), new HashMap<String, Object>());
    }

}