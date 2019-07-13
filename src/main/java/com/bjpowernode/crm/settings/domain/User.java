package com.bjpowernode.crm.settings.domain;

/**
 * Author:动力节点周游
 * 2019/7/13
 */
public class User {
           private String id;
           private String loginAct;
           private String name;
           private String loginPwd;//密码不能采用明文存储，采用密文，MD5加密之后的数据
           private String email;
           private String expireTime;//失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。
           private String lockState;//锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。
           private String deptno;
           private String allowIps;//允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。
           private String createTime;
           private String createBy;
           private String editTime;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginAct='" + loginAct + '\'' +
                ", name='" + name + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", email='" + email + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", lockState='" + lockState + '\'' +
                ", deptno='" + deptno + '\'' +
                ", allowIps='" + allowIps + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", editTime='" + editTime + '\'' +
                '}';
    }

    public User() {
    }

    public User(String id, String loginAct, String name, String loginPwd, String email, String expireTime, String lockState, String deptno, String allowIps, String createTime, String createBy, String editTime) {
        this.id = id;
        this.loginAct = loginAct;
        this.name = name;
        this.loginPwd = loginPwd;
        this.email = email;
        this.expireTime = expireTime;
        this.lockState = lockState;
        this.deptno = deptno;
        this.allowIps = allowIps;
        this.createTime = createTime;
        this.createBy = createBy;
        this.editTime = editTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }
}
