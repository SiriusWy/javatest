//�����븸���ת������
class Animal{
	public String name;
	Animal(String name) {
		this.name = name; 
		}
	}

class Dog extends Animal {
	public String eyecolour;
	Dog(String n, String c){
		super(n);                 //����Ĺ��캯������������ø���
		eyecolour = c; 
		}
	}

class Cat extends Animal {
	public String furcolour;
	Cat(String n, String c){
		super(n);
		furcolour = c; 
		}
	}

public class Test{
	public static void main(String[] args){
		Animal a = new Animal("name");     
		Dog b = new Dog("wang", "yellow");
		Cat c = new Cat("miao", "black");
		System.out.println(a instanceof Animal);    //˵��instanceof��ͬ��equals������д
		System.out.println(b instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(a instanceof Cat);
		a = new Dog("da huang", "bule");      	 	//��ʱa��Dog���ͣ����ǻ���ֻ�ܷ���Animal
		System.out.println(a instanceof Dog);	 	//ture
		System.out.println(a instanceof Animal); 	//ture
		System.out.println(a.name);
		Dog cc = (Dog) a;  						    //ǿ��ת��
		System.out.println(cc.eyecolour); 
		}
	}









