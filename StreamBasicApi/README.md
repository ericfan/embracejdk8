# Stream character
* 代码简洁:
函数式编程写出的代码简洁且意图明确，使用stream接口让你从此告别for循环
* 多核友好:
Java函数式编程使得编写并行程序从未如此简单，你需要的全部就是调用一下parallel()方法
* 无存储:
stream不是一种数据结构，它只是某种数据源的一个视图，数据源可以是一个数组，Java容器或I/O channel等。
* 为函数式编程而生:
对stream的任何修改都不会修改背后的数据源，比如对stream执行过滤操作并不会删除被过滤的元素，而是会产生一个不包含被过滤元素的新stream。
* 惰式执行:
stream上的操作并不会立即执行，只有等到用户真正需要结果的时候才会执行。
* 可消费性:
stream只能被“消费”一次，一旦遍历过就会失效，就像容器的迭代器那样，想要再次遍历必须重新生成

# Stream Operation
* 中间操作(Intermediate Operation):
总是会惰式执行，调用中间操作只会生成一个标记了该操作的新stream，仅此而已。
* 结束操作(Terminal Operation):
会触发实际计算，计算发生时会把所有中间操作积攒的操作以pipeline的方式执行，这样可以减少迭代次数。计算完成之后stream就会失效。

operation type | method
---------------|----------------
Intermediate   | concat() distinct() filter() flatMap() limit() map() peek() skip() sorted() parallel() sequential() unordered()
Terminal       | allMatch() anyMatch() collect() count() findAny() findFirst() forEach() forEachOrdered() max() min() noneMatch() reduce() toArray()







