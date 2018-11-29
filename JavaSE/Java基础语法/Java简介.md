# Java 简介

Java是由Sun Microsystems公司于1995年5月推出的动态的面向对象程序设计语言和Java平台的总称。
**Java分为三个体系:**

* JavaSE（Java Platform Standard Edition，java平台标准版）
* JavaEE (Java Platform,Enterprise Edition，java平台企业版)
* JavaME (JME)(Java Platform Micro Edition，java平台微型版)。

目前本课程主要介绍JavaSE和JavaEE的内容，希望通过不课程的学习，同学们能够掌握Java的基础语法，为今后的进一步学习打下坚实的基础！

## Java 发展历史

* 1995年5月23日，Java语言诞生。
* 1996年1月，第一个JDK-JDK1.0诞生。
* 1999年6月，SUN公司发布Java的三个版本。
* 2000年5月29日，JDK1.4发布.
* 2002年2月26日，J2SE1.4发布，自此Java的计算能力有了大幅提升
* 2005年6月，JavaOne大会召开，SUN公司公开JavaSE 6。
* 2009年04月20日，甲骨文74亿美元收购Sun，取得java的版权。
* 目前最新版是javaSE 11.

![Java发展历史](http://ww1.sinaimg.cn/large/af4e9f79gy1fxlmhwehsrj220a136n1w.jpg)

如果您想了解Java具体的发展历史, 请参考[这里](http://oracle.com.edgesuite.net/timeline/java/)

## Java 的主要特性

1. **简单：** Java语言是从C++ 发展起来的， 与此同时，Java取消了C++中复杂且难以掌握的东西，比如指针的，让Java的学习变得相对容易。
2. **面向对象：** Java是一门面向对象设计的高级语言，面向对象设计是这门语言的灵魂。
3. **跨平台：** Java语言编写的应用程序，不受平台限制，可以由一种平台迁移到另一种平台。
4. **解释性：** Java是一门需要被编译解释的语言，使用java语言编写的源码被转化为字节码，字节码只有被Java虚拟机解释成机器码才能被计算机执行。
5.  **健壮性：** java提供了许多机制防止运行时出现严重错误，如编译时类型检查、异常处理。
6.  **多线程：** Java是一门高性能的语言，其中重要的原因是多线程的引入，能够极大的提升CPU的利用率。

目前本课程仅仅列出这些常见的特性，如果想进一步了解其他特性，请阅读一下文章：

* [精读《Java核心技术-卷Ⅰ》-Java特性](https://www.jianshu.com/p/15187621a73c)
* [Java的特性扫盲](https://www.jianshu.com/p/dcbe1fdc69e5)

## Java 中需要掌握的一些概念：
### [JVM](https://en.wikipedia.org/wiki/Java_virtual_machine)

Java 虚拟机 Java 虚拟机（Java virtual machine，JVM）是运行 Java 程序必不可少的机制。JVM实现了Java语言最重要的特征：即平台无关性。JVM屏蔽了与具体平台相关的信息，使Java语言编译程序只需要生成在JVM上运行的目标字节码（.class）,就可以在多种平台上不加修改地运行。Java 虚拟机在执行字节码时，把字节码解释成具体平台上的机器指令执行。因此实现java平台无关性。它是 Java 程序能在多平台间进行无缝移植的可靠保证，同时也是 Java 程序的安全检验引擎（还进行安全检查）。可以理解为JVM是编译后的Java程序(.class文件)和硬件系统之间的接口。

### [JDK](https://en.wikipedia.org/wiki/Java_Development_Kit)

Java软件开发工具包(Java Development Kit)，主要用于移动设备、嵌入式设备上的java应用程序。JDK是整个java开发的核心，它包含了JAVA的运行环境，JAVA工具和JAVA基础的类库。换句话说，要想进行Java程序的开发，就必须安装JDK, 因为JDK就是面向开发人员使用的SDK。关于JDK的安装，我们将会在接下来的课程中详细讲解。

### [JRE](https://en.wikipedia.org/wiki/Java_virtual_machine)

Java运行时环境(Java Runtime Environment)，允许Java程序所必须的环境集合，包括JVM标准实现以及Java核心类库。当Java源代码编译成为字节码之后，将字节码和JRE一同交给JVM，JVM才能在具体平台上执行。所以JRE包含了JVM，JDK自带了JRE。

下面是他们三者之间的关系：

![JVM&JRE&JDK](http://ww1.sinaimg.cn/large/af4e9f79gy1fxmn7ms53dj20b1095dip.jpg)

## 课后作业

深入了解JVM，JRE， JDK三者的关系，写一篇博客。