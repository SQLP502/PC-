# 计191 许燕瑜 2019311378
## 第一次Java实验  

### 一、实验目的  
为了更好地理解并运用类与对象，构造方法，属性等相关知识点。  
### 二、实验要求  
完成教材P110第四题关于PC、内存等模拟的程序。  
### 三、实验设计  
本次实验共有4个类名，PC，HardDisk,CPU,Text。四个类中再分别创建对象，构造方法。核心代码如下：  
PC.java文件代码  
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
  
HardDisk.java文件代码  
package computer;  

public class HardDisk {  

	public static final String HD = null;  
	
	private int amount;  
	
	HardDisk(){}  
	
void setAmount(int amount){  

	this.amount = amount;  
	
}   

int getAmount(){  

	return amount;  
	
}  

}  
  
  CPU.java文件代码：
   
   package computer;    
   
   
public class PC {   


	CPU cpu;    
	
	
	HardDisk HD;    
	
	
PC(){}    


void setCPU(CPU cpu){    


	this.cpu = cpu;    
	
	
}    


void setHardDisk(HardDisk HD){    


	this.HD = HD;    
	
	
}    


void show(){    


	System.out.println("CPU的速度："+cpu.getSpeed());    
	
	
	System.out.println("硬盘容量："+HD.getAmount());  
	
	
}    


}    

  
  Text.java文件代码：  
  package computer;  
  
public class Test {  

public static void main(String args[]){  

	CPU cpu = new CPU();  
	
	HardDisk HD = new HardDisk();  
	
	cpu.setSpeed(2200);  
	
	HD.setAmount(200);  
	
	PC pc = new PC();  
	
	pc.setCPU(cpu);  
	
	pc.setHardDisk(HD);  
	
	pc.show();  
	
}  

}  
  
  ### 四、实验感想  
  经过这一次实验，学会了怎么构建类与对象，构造不同的方法，运行程序，使用eclipse写java程序并运行，运行了PC模拟机的程序。
