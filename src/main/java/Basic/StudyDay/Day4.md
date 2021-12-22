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

