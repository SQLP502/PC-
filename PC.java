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
	System.out.println("CPU���ٶȣ�"+cpu.getSpeed());
	System.out.println("Ӳ��������"+HD.getAmount());
}
}