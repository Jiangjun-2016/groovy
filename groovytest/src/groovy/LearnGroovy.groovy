/**
 * groovy语法练习
 */

//读取文件
text = new File("text.txt").getText();
println text;

//单引号为java.lang.String
def name = 'Test Groovy'
// 双引号包含占位符则为groovy.lang.GString
def gname = 'test'
def gstring = "hello ${gname}"
println gstring;//hello test

//**次方运算
def sum = 2**3;//8
println sum







































