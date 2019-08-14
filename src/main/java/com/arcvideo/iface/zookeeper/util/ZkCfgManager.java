package com.arcvideo.iface.zookeeper.util;

import java.util.List;
import java.util.Map;

public interface ZkCfgManager {

  boolean init();

  boolean add(String des, String connectStr, String sessionTimeOut);

  boolean add(String id, String des, String connectStr, String sessionTimeOut);

  List<Map<String, Object>> query();

  List<Map<String, Object>> query(int page, int rows);

  boolean update(String id, String des, String connectStr, String sessionTimeOut);

  boolean delete(String id);

  Map<String, Object> findById(String id);

  int count();

  // 建表SQL
  String initSql = "CREATE TABLE IF NOT EXISTS ZK(ID VARCHAR PRIMARY KEY, DES VARCHAR, CONNECTSTR VARCHAR, SESSIONTIMEOUT VARCHAR)";

}
