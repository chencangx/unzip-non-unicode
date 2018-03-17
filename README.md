# unzip-non-unicode
解决linux下解压zip乱码问题  
由于zip格式中并没有指定编码格式，Windows下生成的zip文件中的编码是GBK/GB2312等，而Linux下的默认编码是UTF8
使用命令行`java -jar unzip.jar src.zip /destfolder/`
