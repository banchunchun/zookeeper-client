package com.arcvideo.iface.zookeeper.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bc
 */
@Slf4j
public class ZKFactory {


  private ZKFactory() {
  }

  private volatile static ZKFactory instance = null;


  public static ZKFactory getInstance() {
    if (null == instance) {
      synchronized (ZKFactory.class) {
        if (null == instance) {
          instance = new ZKFactory();
        }
      }
    }
    return ZKFactoryHolder.instance;
  }

  /**
   * 延迟加载
   *
   * @author banchun
   */
  private static class ZKFactoryHolder {

    private static ZKFactory instance = new ZKFactory();
  }

}
