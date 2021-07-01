package spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.*;

import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/30 17:38
 * @Desc：
 */
public class MyProtocol implements Protocol {
    @Override
    public List<ProtocolServer> getServers() {
        return null;
    }

    @Override
    public int getDefaultPort() {
        return 8888;
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }

    @Override
    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        return null;
    }

    @Override
    public void destroy() {

    }
}
