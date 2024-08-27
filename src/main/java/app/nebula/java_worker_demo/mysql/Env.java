package app.nebula.java_worker_demo.mysql;

import lombok.Data;

import java.util.Date;

@Data
public class Env {

    private long id;

    private long projectId;

    private String name;

    private boolean isDefault;

    private String status;

    private Date createTime;

    private Date modifyTime;

}
