--- 

title: 第6章 IO复用：Select和poll函数  
date: 2022-12-11 17:30:58  
tags: []  

---

# 1. 概述

先来看一下 TCP 发送数据的流程：

<img src=" https://coachhe-1305181419.cos.ap-guangzhou.myqcloud.com/Redis/20221211174541.png" width = "80%" />

可以看到，两个应用直接发送信息时，分为三步：
1. 应用 A 把

# 2. IO 模型

## UNIX 下可用的 5 种 I/O 模型的基本区别

- 阻塞式 I/O
- 非阻塞式 I/O
- I/O 复用（select 和 poll）
- 信号驱动式 I/O（SIGIO）
- 异步 I/O（`POSIX` 的 `aio_` 系列函数）

## 2.1 阻塞式 I/O 模型

最流行的 I/O 模型是阻塞式 I/O (blocking I/O) 模型，目前为止的所有例子都使用该模型。默认情形下，所有套接字都是阻塞的