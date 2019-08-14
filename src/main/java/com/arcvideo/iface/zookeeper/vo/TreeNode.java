package com.arcvideo.iface.zookeeper.vo;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeNode implements Serializable {

  private int id;
  private String name;
  private int pid = -1;
  private int folder = 1;
  private boolean expanded;
  private boolean isLeaf;
  private String type;
  private String url;
  private int size;
  private String path;


}
