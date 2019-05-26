package com.rxjava.rxlife

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import io.reactivex.*
import io.reactivex.parallel.ParallelFlowable


/**
 * [Observable.as] + [RxLife.as]
 */
fun <T> Observable<T>.life(owner: LifecycleOwner): ObservableLife<T> =
    this.`as`(RxLife.`as`<T>(owner))

fun <T> Flowable<T>.life(owner: LifecycleOwner): FlowableLife<T> =
    this.`as`(RxLife.`as`(owner))

fun <T> Maybe<T>.life(owner: LifecycleOwner): MaybeLife<T> =
    this.`as`(RxLife.`as`<T>(owner))

fun Completable.life(owner: LifecycleOwner): CompletableLife =
    this.`as`(RxLife.`as`<Any>(owner))

fun <T> Single<T>.life(owner: LifecycleOwner): SingleLife<T> =
    this.`as`(RxLife.`as`<T>(owner))

fun <T> ParallelFlowable<T>.life(owner: LifecycleOwner): ParallelFlowableLife<T> =
    this.`as`(RxLife.`as`<T>(owner))


fun <T> Observable<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): ObservableLife<T> =
    this.`as`(RxLife.`as`<T>(owner, event))

fun <T> Flowable<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): FlowableLife<T> =
    this.`as`(RxLife.`as`(owner, event))

fun <T> Maybe<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): MaybeLife<T> =
    this.`as`(RxLife.`as`<T>(owner, event))

fun Completable.life(owner: LifecycleOwner, event: Lifecycle.Event): CompletableLife =
    this.`as`(RxLife.`as`<Any>(owner, event))

fun <T> Single<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): SingleLife<T> =
    this.`as`(RxLife.`as`<T>(owner, event))

fun <T> ParallelFlowable<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): ParallelFlowableLife<T> =
    this.`as`(RxLife.`as`<T>(owner, event))


/**
 * [Observable. as] + [RxLife.asOnMain]
 */
fun <T> Observable<T>.lifeOnMain(owner: LifecycleOwner): ObservableLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner))

fun <T> Flowable<T>.lifeOnMain(owner: LifecycleOwner): FlowableLife<T> =
    this.`as`(RxLife.asOnMain(owner))

fun <T> Maybe<T>.lifeOnMain(owner: LifecycleOwner): MaybeLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner))

fun Completable.lifeOnMain(owner: LifecycleOwner): CompletableLife =
    this.`as`(RxLife.asOnMain<Any>(owner))

fun <T> Single<T>.lifeOnMain(owner: LifecycleOwner): SingleLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner))

fun <T> ParallelFlowable<T>.lifeOnMain(owner: LifecycleOwner): ParallelFlowableLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner))


fun <T> Observable<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): ObservableLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner, event))

fun <T> Flowable<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): FlowableLife<T> =
    this.`as`(RxLife.asOnMain(owner, event))

fun <T> Maybe<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): MaybeLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner, event))

fun Completable.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): CompletableLife =
    this.`as`(RxLife.asOnMain<Any>(owner, event))

fun <T> Single<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): SingleLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner, event))

fun <T> ParallelFlowable<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): ParallelFlowableLife<T> =
    this.`as`(RxLife.asOnMain<T>(owner, event))




