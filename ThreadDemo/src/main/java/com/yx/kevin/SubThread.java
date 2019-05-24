package com.yx.kevin;

public class SubThread implements Runnable {

    private ShareVar shareVar;

    public SubThread(ShareVar shareVar) {
        this.shareVar = shareVar;
    }

    @Override
    public void run() {
        shareVar.sub();
    }
}
