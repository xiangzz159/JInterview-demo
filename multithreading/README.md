# Multi Thread

## proj1
主要介绍Thread类的API，在使用这些API的过程中，会出现一些意想不到的情况，这也是多线程具有不可预知性的一个提现。

本章应该着重掌握如下关键技术点：
- 线程的启动
- 如何使线程暂停
- 如何使线程停止
- 线程的优先级
- 线程安全相关的问题

## proj2
主要介绍Java多线程的同步，也就是如何在Java语言中写出线程安全的程序。如何在Java语言中解决线程安全的相关问题。

本章应该掌握如下技术点：
- synchronized对象监视器为Object时的使用
- synchronized对象监视器为Class时的使用
- 非线程安全时如何出现的
- 关键字volatile的主要作用
- 关键字volatile与synchronized的区别及使用情况

## proj3
主要介绍线程间的协作/通信

本章应该掌握如下技术点：
- 使用wait/notify实现线程间的通信
- 生产者/消费者模式的实现
- 方法join的使用
- ThreadLocal类的使用

## proj4
介绍使用Java5中Lock对象也能实现同步的效果，而且在使用上更加方便。
本章着重掌握如下知识点：
- ReentrantLock类的使用
- ReentrantReadWriteLock类的使用
