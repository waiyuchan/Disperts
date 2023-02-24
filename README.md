## Disperts: Distributed Performance Testing Service 分布式性能测试服务

![](https://img.shields.io/badge/Language-Java-orange.svg)
![](https://img.shields.io/badge/Backend_frame-Spring_Boot-6db33f.svg)
![](https://img.shields.io/badge/ORM-MyBatis-red.svg)
![](https://img.shields.io/badge/Engine-Locust_&_JMeter-blue.svg)
![](https://img.shields.io/badge/License-Apache_2.0-green.svg)

---

### 支持压测引擎
* Locust
* JMeter

### 功能列表

1. 用户注册(开发中 ⏰ )
* 提供注册接口，用户提供邮箱和密码进行注册
* 注册完成后，系统会向用户邮箱发送验证邮件，用户需要验证邮箱才能完成注册流程

2. 用户登录(开发中 ⏰ )
* 用户通过登录接口，输入邮箱和密码进行登录，登录成功后获取Auth Token
* 用户在进行其他操作时需要在header里带上该token进行鉴权

3. 压测任务创建(开发中 ⏰ )
* 用户可以通过API创建压测任务
* 创建任务时需要选择压测引擎类型（Locust或JMeter），输入压测参数，选择是否定时压测
* 创建任务成功后返回任务ID

4. 压测任务启动/关闭(未实现 ❌ )
* 用户可以通过API启动或关闭指定任务
* 启动任务时，系统会调用Locust或JMeter的接口，开始执行压测
* 关闭任务时，系统会调用Locust或JMeter的接口，停止压测

5. 压测任务状态查看(未实现 ❌ )
* 用户可以通过API查询指定任务的状态
* 状态包括：任务是否在执行中、任务执行进度、任务执行结果等信息

6. 压测日志实时查看(未实现 ❌ )
* 用户可以通过API实时查看指定任务的压测日志
* 系统会将日志实时输出到前端，用户可以随时查看

7. 压测报告查看&下载(未实现 ❌ )
* 用户可以通过API查看指定任务的压测报告
* 系统会生成报告并保存在服务器上，用户可以通过API下载报告

8. 定时压测(未实现 ❌ )
* 用户可以选择在创建任务时开启定时压测功能
* 系统会在指定时间定时执行任务，并自动关闭任务

### 数据库字段

下面是各个数据库表的字段详细说明：

1. user

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | 用户ID，主键|
|username | varchar(50) | 用户名，唯一|
|password | varchar(255) | 密码，使用BCrypt进行加密存储|
|email | varchar(100) | 电子邮箱|
|created_at | datetime | 创建时间|
|updated_at | datetime | 更新时间|

2. project

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | 项目ID，主键|
|name | varchar(100) | 项目名|
|description | text | 项目描述|
|created_by | int | 创建者ID，外键关联到user表的id字段|
|created_at | datetime | 创建时间|
|updated_at | datetime | 更新时间|

3. api

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | API ID，主键|
|name | varchar(100) | API名称|
|description | text | API描述|
|method | varchar(10) | 请求方法，例如GET、POST|
|path | varchar(255) | API路径|
|project_id | int | 所属项目ID，外键关联到project表的id字段|
|created_by | int | 创建者ID，外键关联到user表的id字段|
|created_at | datetime | 创建时间|
|updated_at | datetime | 更新时间|

4. test_case

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | 测试用例ID，主键|
|name | varchar(100) | 测试用例名称|
|description | text | 测试用例描述|
|request | text | HTTP请求的相关信息，包括请求方法、请求URL、请求头、请求参数等|
|project_id | int | 所属项目ID，外键关联到project表的id字段|
|created_by | int | 创建者ID，外键关联到user表的id字段|
|created_at | datetime | 创建时间|
|updated_at | datetime | 更新时间|

5. test_suite

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | 测试套件ID，主键|
|name | varchar(100) | 测试套件名称|
|description | text | 测试套件描述|
|project_id | int | 所属项目ID，外键关联到project表的id字段|
|created_by | int | 创建者ID，外键关联到user表的id字段|
|created_at | datetime | 创建时间|
|updated_at | datetime | 更新时间|

6. test_suite_case

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | 主键|
|test_suite_id | int | 测试套件ID，外键关联到test_suite表的id字段|
|test_case_id | int | 测试用例ID，外键关联到test_case表的id字段|
|created_at | datetime | 创建时间|
|updated_at | datetime | 更新时间|

7. perform_test

|字段名 | 类型 | 描述|
|---|---|---|
|id | int | 压测任务ID，主键|
|name | varchar(100) | 压测任务名称|
|description | text | 压测任务描述|
|engine | varchar(10) | 压测引擎，例如Locust、JMeter|
|config | text | 压测任务的配置，对应