### 简介：如何使用InteliJ IDEA进行Debug

InteliJ IDEA中自带有很强大的Debug功能，使用好InteliJ的Debug模式可以让代码调试变得更加轻松高效。这篇文章会为大家简要介绍Debug模式中的常用操作以及快捷键的使用。



#### 1. Debug模式界面

首先介绍一下Debug界面中的常用部分：

![Debug界面](https://ws4.sinaimg.cn/large/006tKfTcly1g0dbr6jmobj317d0u0wpz.jpg)

* 服务按钮主要控制代码运行的流程（关闭/启动服务）以及管理断点等（会在[服务按钮](#服务按钮)详细介绍）

* 调试按钮部分是我们在调试代码时会用到的一些主要功能（会在[调试按钮](#调试按钮)详细介绍）

* variables窗口和watches窗口主要用于查看变量（会在[查看变量](#查看变量)详细介绍）

* 在Debug模式下，选中Debug窗口标签就会出现Debug界面。Debug窗口会在代码运行到第一个端点时激活。如果没有激活可以在设置中进行设置（见下图）。

  ![Settings](https://ws1.sinaimg.cn/large/006tKfTcly1g0dbr5xji1j317k0u046y.jpg)

那么如何进入Debug界面呢？一般有三种方法：

 1. 选中顶部菜单栏的"Run"菜单，选择Debug

    ![Run menu](https://ws2.sinaimg.cn/large/006tKfTcly1g0dbr774ifj30m308iwiv.jpg)

2. 将鼠标移至main方法签名的左端，可以看到一个绿色的三角形箭头，点击鼠标右键即可调出Debug菜单![Main method menu](https://ws4.sinaimg.cn/large/006tKfTcly1g0dbr74cwij30ly06udhh.jpg)
3. 使用快捷键（⌃⌥D）调出Debug菜单![shortcut](https://ws4.sinaimg.cn/large/006tKfTcly1g0dbr71tm9j30go0aq0tm.jpg)



#### 2. 设置断点

在调试代码的过程中常常需要设置断点，使代码运行到某一行时停止下来。在InteliJ IDEA中，设置断点的操作非常简单，只需要鼠标左键点击你想要设置断点的代码最左侧空白处，或者将光标移至该行，使用快捷键（⌘F8）就可以设置/取消断点。添加断点后，该行代码左侧会出现一个红色的圆点。

![Breakpoint](https://ws1.sinaimg.cn/large/006tKfTcly1g0e55glqavj30w00dedib.jpg)

鼠标右键点击断点，可以调出快捷菜单对断点进行设置。

![Breakpoint menu](https://ws2.sinaimg.cn/large/006tKfTcly1g0e5c9euyqj30rq0g0jto.jpg)

也可以使用快捷键（⇧⌘F8）查看所有断点并进行设置。

![Breakpoint menu](https://ws1.sinaimg.cn/large/006tKfTcly1g0e5xuqd5hj318f0u0dmd.jpg)

常用的有以下几种功能：

* Condition：可以设置断点处代码暂停的条件。当你只希望代码在某一个条件下暂停时（例如if条件为true时，或循环中变量等于某个值时），可以勾选此选项并在下方输入代码停止的条件。condition也可以在快捷菜单中设置（右键点击断点）。

  例如，在如图所示的for循环中，如果将第20行断点的condition设定为`j ==9`，在Debug模式下运行代码，代码运行到该断点时会判断j的值，当j的值为9时会暂停代码。

* Evaluate and log：勾选此选项并在输入框中输入你希望计算的表达式，当代码运行至该断点时，就会自动在控制台输出表达式的值。这个功能可以代替我们在调试代码时使用的打印语句，可以让我们在调试代码时尽量少的对代码进行改动。

  例如，我们希望查看13行声明的`int[] a3`数组的值，我们可以在声明语句后设置断点，并输入表达式`Arrays.toString(a3)`，当代码运行至断点时就会在控制台打印a3数组的值。

* Pass count：勾选此选项并输入数字可以设置该断点在此行代码在运行n遍时启用。

  例如：我们在第20行打印语句处设置断点，将pass count设置为3，代码在前两次到达断点时不会停止，依然会在控制台打印出字符串，当第三次到达该断点时，代码才会暂停运行。



除了在代码中设置断点外，我们还可以设置全局断点，在设置断点界面中点击左上角的“+”按钮就可以添加其他断点。

例如：我们想添加一个空指针异常断点，当代码在运行过程中出现空指针异常时暂停程序。我们可以点击左上角的“+”按钮，在下拉菜单中选择Java Exception Breakpoint。

![Exception Breakpoint](https://ws2.sinaimg.cn/large/006tKfTcly1g0e79cqeewj30lg0c2tbl.jpg)

这时会出现如下的搜索界面，选择NullPointerException即可添加一个空指针异常的全局断点。

![Exception Breakpoint](https://ws2.sinaimg.cn/large/006tKfTcly1g0e79movfsj30t60my40b.jpg)



#### 3. 服务按钮

![Run buttons](https://ws1.sinaimg.cn/large/006tKfTcly1g0e7tolugdj302y09qmxc.jpg)

1. 重新运行Debug（⌘R）：重新以Debug模式运行当前代码
2. 继续运行（⌥⌘R）：当代码遇到断点暂停时，点击该按钮可以使代码继续运行。如果后面还有断点，则会运行到下一个断点处。如果后面没有断点，则会运行完整段代码。
3. 终止Debug（⌘F2）：终止程序的运行
4. 查看所有断点（⇧⌘F8）：调出断点设置界面
5. 禁用所有断点：点击该按钮会禁用所有断点，断点图标会从红色圆点变成灰色原点。再次点击即可恢复所有断点。如果只想禁用某一个断点，可以右键点击该断点图标，取消Enabled选项。



#### 4. 调试按钮

![debug buttons](https://ws3.sinaimg.cn/large/006tKfTcly1g15xmgmqnnj30ci02ujri.jpg)

1. 显示运行位置（⌥F10）：如果你的光标不在当前页面或者当前运行行，点击这个按钮后可以跳转到当前代码执行的行。

2. 步过/单步执行（F8）：每次只执行一行代码，如果这行代码中有调用其他方法，不会进入方法。

3. 步入/进入方法（F7）：如果当前行中调用了其他方法，可以进入方法内部。一般用于进入自定义方法，不会进入官方类库的方法。（当该行有多个方法时，依次步入）

4. 强制步入（⌥⇧F7）：能够进入任何方法，常用于查看底层源码。（当该行有多个方法时，依次步入）

5. 步出（⇧F8）：从步入的方法退出到方法调用的位置（此时方法已经执行完毕，还没有完成赋值）。

6. 回退断点：从步入的方法退出到方法调用的开始处（此时方法还未执行，可以重新步入该方法）。

7. 运行到光标处（⌥F9）：将光标定位到需要查看到那一行的代码，使用该功能，代码会运行至光标行然后暂停，不需要设置断点（相当于一个一次性的临时断点）。

8. 计算表达式（⌥F8）：在调试过程中计算某个表达式的值，而不用再去打印信息。

   例如在下图中，我们可以计算for循环中`i*j`的值：

   ![calculate expression](https://ws2.sinaimg.cn/large/006tKfTcly1g15zgyrte1j31360ioafo.jpg)



​	补充：***智能步入***（⇧F7）：当一行代码中有好几个方法时，而我们只想进入某一个方法时，使用智能步入会列出所有可步入的方法，由用户选择需要进入的方法（如下图）。如果只有一个方法，则直接进入（类似强制步入）。该方法可以在Run菜单中找到，也可以直接使用快捷键。

![smart step over](https://ws2.sinaimg.cn/large/006tKfTcly1g15yz097p0j30po07cdhi.jpg)



####5. 查看变量

在debug过程中，我们经常需要跟踪查看变量的变化，在InteliJ IDEA中有以下几种方法可以查看变量：

1. 在InteliJ IDEA中，参数所在行的代码后面会用灰色的斜体字标明当前变量的值：

   ![example1](https://ws4.sinaimg.cn/large/006tKfTcly1g16039hmn2j311i0ieadh.jpg)

2. 光标悬停在参数上也可以显示当前变量信息：

   ![example2](https://ws3.sinaimg.cn/large/006tKfTcly1g1606mcr8dj30eo052t99.jpg)

3. Variables窗口，这里可以查看当前所有变量的信息：

   ![variables](https://ws2.sinaimg.cn/large/006tKfTcly1g1608m3z5bj30dk0budgz.jpg)

4. Watches窗口。你可以将需要观察的变量从 Variables窗口中拖拽到Watches窗口，也可以根据你的需求添加新的需要观察的变量/表达式。

   Watches窗口中有用一排按钮：

   左侧的加/减符号可以添加/删除要观察的变量；中间的上下箭头可以移动变量显示的位置；箭头右侧的按钮用来复制一个需要观察的变量；点击最右侧的眼睛标志可以将Watches窗口合并入Variables窗口中。

   ![watches](https://ws3.sinaimg.cn/large/006tKfTcly1g160d4m3w2j30k00b4wex.jpg)

   注：一般来说，Watches窗口会并排出现在Variables窗口右侧。有时Watches窗口也会被合并入Variables窗口中：（如下图）

   ![watches](https://ws3.sinaimg.cn/large/006tKfTcly1g160nu5il4j30c20dign0.jpg)

   有时候会最小化，图标位置如下图所示：

   ![watches](https://ws2.sinaimg.cn/large/006tKfTcly1g160q9gbz8j310c0f0q5d.jpg)