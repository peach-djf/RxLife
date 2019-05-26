package com.rxjava.rxlife;

import android.os.Looper;

import java.util.concurrent.atomic.AtomicReference;

import androidx.annotation.MainThread;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

/**
 * User: ljx
 * Date: 2019/4/3
 * Time: 11:04
 */
public abstract class AbstractLifecycle<T> extends AtomicReference<T> implements Disposable {

    private Scope scope;

    private final Object mObject = new Object();

    public AbstractLifecycle(Scope scope) {
        this.scope = scope;
    }

    /**
     * 事件订阅时调用此方法
     */
    protected final void addObserver() throws Exception {
        if (isMainThread() || scope instanceof ScopeView) {
            addObserverOnMain();
        } else {
            final Object object = mObject;
            AndroidSchedulers.mainThread().scheduleDirect(() -> {
                addObserverOnMain();
                synchronized (object) {
                    object.notifyAll();
                }
            });
            synchronized (object) {
                object.wait();
            }
        }
    }

    @MainThread
    private void addObserverOnMain() {
        scope.addScopeListener(this);
    }

    /**
     * onError/onComplete 时调用此方法
     */
    protected final void removeObserver() {
        if (isMainThread() || scope instanceof ScopeView) {
            scope.removeScopeListener();
        } else {
            AndroidSchedulers.mainThread().scheduleDirect(this::removeObserver);
        }
    }

    private boolean isMainThread() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
