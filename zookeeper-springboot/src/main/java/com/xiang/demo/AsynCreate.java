package com.xiang.demo;

import org.apache.zookeeper.AsyncCallback.DataCallback;
import org.apache.zookeeper.AsyncCallback.StringCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException.Code;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/28 14:54
 * @Desc：异步创建zk节点
 */
public class AsynCreate {
    public static void main(String[] args) throws IOException, InterruptedException {
        ZooKeeper zookeeper = new ZooKeeper("localhost:2181", 200000, null);

        zookeeper.create("/mas", "sid-o2".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL,
                new StringCallback() {
                    public void processResult(int rc, String path, Object ctx, String name) {
                        Code code = Code.get(rc);
                        switch (code) {
                            case OK:
                                System.out.println(code);
                                break;
                            case NODEEXISTS:
                                System.out.println(code);
                                break;
                            case SESSIONEXPIRED:
                                System.out.println(code);
                                break;
                            default:
                                System.out.println("unknow " + code);
                        }

                    }
                }, null);

        DataCallback callback = new DataCallback() {
            public void processResult(int rc, String path, Object ctx, byte[] data, Stat stat) {
                Code code = Code.get(rc);
                System.out.println("code for check " + code);
                switch (code) {
                    case OK:
                        System.out.println("Code is OK");
                        break;
                    case NONODE:
                        System.out.println("Code is NONODE");
                        break;
                    case NODEEXISTS:
                        System.out.println("Code is NODEEXISTS");
                        break;
                    case SESSIONEXPIRED:
                        System.out.println("Code is SESSIONEXPIRED");
                        break;
                    default:
                }

            }

        };

        zookeeper.getData("/mas", true, callback, null);

        Thread.sleep(200000);

    }

}
