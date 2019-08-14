package com.arcvideo.iface.zookeeper.util;

public class ZkCfgFactory {

  private static ZkCfgManager _instance = new ZkCfgManagerImpl();

  public static ZkCfgManager createZkCfgManager() {

    return _instance;
  }

}
