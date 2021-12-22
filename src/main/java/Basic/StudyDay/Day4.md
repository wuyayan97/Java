####Random


#### ArrayList 
数组的长度不可以发生改变。
ArrayList集合的长度是可变的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合中的所有元素，全都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容为空，则得到:[]

常用方法:
```
    public boolean add(E e):添加元素
    public E get(int index):获取
    public E remove(int index):删除
    public int size():获取集合尺寸大小

```

希望向集合ArrayList中存储基本类型，必须使用封装类
```
基本类型      包装类(引用类型：java.lang下)
int         Byte
short       Short
int         Integer 【特殊】
long        Long
float       Float
double      Double
char        Character [特殊]
boolean     Boolean
```
从jdk1.5+开始，支持自动装箱、自动拆箱

自动装箱：基本类型-->包装类型
自动拆箱：包装类型-->基本类型

##### String
程序中所有用"String"引起来的字符串，都是String类的实现，就算没有new.

字符串的特点：
1.字符串的内容用不可变
2.字符串可以共享使用
3.字符串效果上相当于char[]字符数组，但是子层原理是byte[]字节数组。

创建字符串的常见3+1种方式：
1.public String()，创建一个空白字符串，不含有任何内容
2.public String(char[] array):根据字符数组的内容，来创建对应的字符串。
3.public String(byte[] array):根据字节数组的内容，来创建队形的字符串。


```
    ==是进行对象地址值比较，如果确实需要字符串的内容比较，可以可以使用两个方法。
    public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同才会为true.
    注意：一个常量一个变量，要把常量写在前面。

    public boolean equalsIgnoreCase(String str):
    忽略大小写比较。
```

####### String 获取相关的常用方法
public int length():获取字符串长度
public String concat(String str):拼接字符串
public car charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值。

####### String 截取相关的常用方法
public String substring(int index):从参数位置一直到参数末尾，返回新字符串。
public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串。
备注[begin,end]，包含左边，不包含右边。

####### String 转换相关的常用方法
public char[] toCharArray():将当前字符串拆分为字符数组作为返回值
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString):
将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串。

####### String 分割相关的常用方法
public String[] split(String regex):
按照参数的规则，将字符串切分成若干部分。

注意事项：split方法的参数其实是一个，正则表达式。
如果要用正则表达式中的特殊值切割要加\\
```
String[] split1 = d.split("\\.");
```