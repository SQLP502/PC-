# 计191 许燕瑜 2019311378
## 第一次Java实验  

### 一、实验目的  
为了更好地理解并运用类与对象，构造方法，属性等相关知识点。  
### 二、实验要求  
完成教材P110第四题关于PC、内存等模拟的程序。  
### 三、实验设计  
本次实验共有4个类名，PC，HardDisk,CPU,Text。四个类中再分别创建对象，构造方法。核心代码如下：  
package computer;  

public class CPU {  

	public int speed;  
  
CPU(){}  

void setSpeed(int speed){  

	this.speed = speed;  
  
}  

int getSpeed(){  

	return speed;  
  
}  

}
