package spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/30 17:40
 * @Desc：
 */
public class App {
    public static void main(String[] args) {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        System.out.println(protocol.getDefaultPort());
    }
}
