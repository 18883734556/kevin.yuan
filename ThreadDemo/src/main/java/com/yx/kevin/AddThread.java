package com.yx.kevin;

public class AddThread implements Runnable{
    private ShareVar shareVar;

    public AddThread(ShareVar shareVar) {
        this.shareVar = shareVar;
    }

    @Override
    public void run() {
        shareVar.add();
    }
}
