//子类与父类的转换问题
class Animal{
	public String name;
	Animal(String name) {
		this.name = name; 
		}
	}

class Dog extends Animal {
	public String eyecolour;
	Dog(String n, String c){
		super(n);                 //子类的构造函数里必须先引用父类
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
		System.out.println(a instanceof Animal);    //说明instanceof不同于equals不用重写
		System.out.println(b instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(a instanceof Cat);
		a = new Dog("da huang", "bule");      	 	//此时a是Dog类型，但是还是只能访问Animal
		System.out.println(a instanceof Dog);	 	//ture
		System.out.println(a instanceof Animal); 	//ture
		System.out.println(a.name);
		Dog cc = (Dog) a;  						    //强制转换
		System.out.println(cc.eyecolour); 
		}
	}









