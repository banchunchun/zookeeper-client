package com.arcvideo.iface.zookeeper.util;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public interface ZkManager {

  ZkManagerImpl connect(Properties p);

  ZkManagerImpl connect(String host, int timeout);

  boolean disconnect();

  List<String> getChildren(String path);

  String getData(String path);

  Map<String, String> getNodeMeta(String nodePath);

  List<Map<String, String>> getACLs(String nodePath);

  boolean createNode(String path, String nodeName, String data);

  boolean deleteNode(String nodePath);

  boolean setData(String nodePath, String data);

  long getNodeId(String nodePath);

  public enum P {

    host, sessionTimeOut
  }

  enum Meta {

    // ACL_Version,
    // Creation_Time,
    // Children_Version,
    // Creation_ID,
    // Data_Length,
    // Ephemeral_Owner,
    // Last_Modified_Time,
    // Modified_ID,
    // Number_of_Children,
    // Node_ID,
    // Data_Version
    czxid, mzxid, ctime, mtime, version, cversion, aversion, ephemeralOwner, dataLength, numChildren, pzxid
  }

  enum Acl {

    scheme, id, perms
  }

}
