package com.ming.sun.it;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.diagnostic.Logger;

public class MyAction extends AnAction {
    private static final Logger LOG = Logger.getInstance(MyAction.class);

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        LOG.info("hello log.....");
        System.out.println("hello");
    }
}
