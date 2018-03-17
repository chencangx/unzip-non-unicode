# unzip-non-unicode
解决linux下解压zip乱码问题  
由于zip格式中并没有指定编码格式，Windows下生成的zip文件中的编码是GBK/GB2312等，而Linux下的默认编码是UTF8  
使用命令行`java -jar unzip.jar src.zip /destfolder/`  
## 注意
- 专为gbk编码的zip文件
- 密码采用明文输入
- 未加入压缩文件完整性校验(如果压缩文件有错误,则结果不可预知)
## 依赖
```xml
<dependency>
  <groupId>net.lingala.zip4j</groupId>
  <artifactId>zip4j</artifactId>
  <version>1.3.2</version>
</dependency>
```
