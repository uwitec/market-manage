# 现金转账服务
依然是按照S-A-A-S设计。

从业务形态中应该有以下几个角色参与
* 业务所有者，在单业务主场景即以平台为业务主的设计。
* 转账操作者，即直接操作并对负责的财务人员；可能为空 表示是系统自发行为（系统自发行为也应该有其设计者，暂不考虑）
* 现金接收者，通常表现为一个银行帐号

从开发角度应该有以下角色参与
* 本服务
* 客户项目
* 转账供应商

下面是从职能和需求上对各个角色进行详细定义。

## 业务形态
### 业务所有者
报表需求
### 转账操作者
* 获取需执行的现金转账需求
* 获取推荐的转战供应商
* 执行转账
### 现金接收者
N/a

## 开发角度
### 本服务
支撑整个服务体系，提供可持久化解决方案；记录足够详细的日志
### 客户项目
...
### 转账供应商
应该需要以下几个技术支持的操作
* 查询可用余额
* 查询转账记录
* 执行现金转账