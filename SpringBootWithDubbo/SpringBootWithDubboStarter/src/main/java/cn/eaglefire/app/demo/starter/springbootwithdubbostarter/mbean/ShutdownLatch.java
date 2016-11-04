package cn.eaglefire.app.demo.starter.springbootwithdubbostarter.mbean;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by eagle on 2016/11/4.
 */
public class ShutdownLatch implements ShutdownLatchMBean {

    protected AtomicBoolean running = new AtomicBoolean(false);

    private long checkIntervalInSeconds = 10;

    private String domain = "cn.eaglefire.app.demo.service.management";

    public ShutdownLatch(){
    }

    public ShutdownLatch(String domain){
        this.domain = domain;
    }

    public void await() throws Exception{
        if( running.compareAndSet(false, true) ){
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            mBeanServer.registerMBean(this, new ObjectName(domain, "name", "ShutdownLatch"));
            while (running.get()){
                TimeUnit.SECONDS.sleep(checkIntervalInSeconds);
            }
        }
    }

    @Override
    public String shutdown() {
        if( running.compareAndSet(true, false) ){
            return "Shutdown signal sent, shutting down...";
        }else{
            return "Shutdown signal had been sent, no need again and again...";
        }
    }

}
