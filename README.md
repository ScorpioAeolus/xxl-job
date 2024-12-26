<p align="center" >
    <img src="https://www.xuxueli.com/doc/static/xxl-job/images/xxl-logo.jpg" width="150">
    <h3 align="center">XXL-JOB</h3>
    <p align="center">
        XXL-JOB, a distributed task scheduling framework.
        <br>
        <a href="https://www.xuxueli.com/xxl-job/"><strong>-- Home Page --</strong></a>
        <br>
        <br>
        <a href="https://github.com/xuxueli/xxl-job/actions">
            <img src="https://github.com/xuxueli/xxl-job/workflows/Java%20CI/badge.svg" >
        </a>
        <a href="https://maven-badges.herokuapp.com/maven-central/com.xuxueli/xxl-job/">
            <img src="https://maven-badges.herokuapp.com/maven-central/com.xuxueli/xxl-job/badge.svg" >
        </a>
        <a href="https://github.com/xuxueli/xxl-job/releases">
         <img src="https://img.shields.io/github/release/xuxueli/xxl-job.svg" >
        </a>
        <a href="https://github.com/xuxueli/xxl-job/">
            <img src="https://img.shields.io/github/stars/xuxueli/xxl-job" >
        </a>
        <a href="https://hub.docker.com/r/xuxueli/xxl-job-admin/">
            <img src="https://img.shields.io/docker/pulls/xuxueli/xxl-job-admin" >
        </a>
        <a href="http://www.gnu.org/licenses/gpl-3.0.html">
         <img src="https://img.shields.io/badge/license-GPLv3-blue.svg" >
        </a>
        <a href="https://www.xuxueli.com/page/donate.html">
           <img src="https://img.shields.io/badge/%24-donate-ff69b4.svg?style=flat" >
        </a>
    </p>
</p>


## Introduction
XXL-JOB is a distributed task scheduling framework. 
It's core design goal is to develop quickly and learn simple, lightweight, and easy to expand. 
Now, it's already open source, and many companies use it in production environments, real "out-of-the-box".

XXL-JOB是一个分布式任务调度平台，其核心设计目标是开发迅速、学习简单、轻量级、易扩展。现已开放源代码并接入多家公司线上产品线，开箱即用。


## Sponsor
XXL-JOB is an open source and free project, with its ongoing development made possible entirely by the support of these awesome backers.

XXL-JOB 是一个开源且免费项目，其正在进行的开发完全得益于支持者的支持。开源不易，[前往赞助项目开发](https://www.xuxueli.com/page/donate.html )


## Documentation
- [中文文档](https://www.xuxueli.com/xxl-job/)
- [English Documentation](https://www.xuxueli.com/xxl-job/en/)


## Communication    
- [社区交流](https://www.xuxueli.com/page/community.html)


## 基于安全性改造
- 1、登录加入谷歌验证器
    >解决admin账号账密登录爆破和撞库等安全问题
   
    >admin账号初始化时,同时初始化google authenticator秘钥
    
    >添加非管理员账号时,自动初始化google authenticator秘钥
    
    >控制台用户绑定google authenticator根据秘钥手动生成二维码扫描或者手动添加google authenticator(不需要像业务系统做可视化绑定)
- 2、禁用或控制脚本任务创建
    >通过脚本任务很容易拿下控制台后拿下使用调度的业务机器(也就是xxl-job-executor),目前实现是通过配置控制是否开启脚本任务,如果不允许,那么就不能通过控制台创建脚本任务
- 3、任务执行异常通知由邮件改成lark
- 4、调度中心注册任务,通过ip白名单控制,避免控制台被拿下后通过模拟xxl-job-executor窃取token以及后续危险操作



