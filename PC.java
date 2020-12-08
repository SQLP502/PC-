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