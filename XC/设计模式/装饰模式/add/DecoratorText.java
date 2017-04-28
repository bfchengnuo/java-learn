package add;

public class DecoratorText {

	/*
	 * 1��ʲô��װ��ģʽ��
	 * װ��ģʽ������װ(Wrapper)ģʽ��װ��ģʽ�ԶԿͻ�͸���ķ�ʽ��̬�ĸ�һ�����󸽼��ϸ�������Ρ�װ��ģʽ�ڲ��ظı�ԭ���ļ���ʹ�ü̳е������
	 * ����̬����չһ������Ĺ��ܡ�����ͨ������һ����װ����Ҳ����װ����������ʵ�Ķ���
	 * 
	 * 2��Ϊʲôʹ��װ��ģʽ��
	 * ����ͨ��ʹ�ü̳���ʵ�ֹ��ܵ���չ�������Щ��Ҫ��չ�Ĺ��ܵ�����ܷ��࣬��ô�Ʊػ����ɺܶ����࣬����ϵͳ�ĸ����ԡ�ͬʱ��ʹ�ü̳�ʵ�ֹ�����չ
	 * ��������֪����Щ��չ���ܵ����ã���Щ�������ڱ���ʱ��ȷ���˵ģ��Ǿ�̬�ġ�
	 * ��ʹ��װ��ģʽ�����ڲ�����������������£�������Ĺ��ܼ�����չ���Ǽ̳й�ϵ��һ�����������
	 * 
	 * 3��װ��ģʽ�Ľ�ɫ���ص㣿 ��ɫ���ɣ� -���󹹼���ɫ������һ������ӿڣ��Թ淶׼�����ո������εĶ���
	 * -���幹����ɫ������һ����Ҫ���ո������ε��ࡣ -װ�ν�ɫ������һ��������������ã�������һ������󹹼��ӿ�һ�µĽӿڡ�
	 * -����װ�ν�ɫ������������������ϡ����ӵ����Ρ�
	 * 
	 * װ��ģʽ���ص㣺 1.װ�ζ������ʵ��������ͬ�Ľӿڡ������ͻ��˶���Ϳ����Ժ���ʵ������ͬ�ķ�ʽ��װ�� ���󽻻���
	 * 2.װ�ζ������һ����ʵ���������(reference)�� 3.װ�ζ�������������Կͻ��˵�����������Щ����ת������ʵ����
	 * 4.װ�ζ��������ת����Щ������ǰ�����Ժ�����һЩ���ӹ���
	 * ��������ȷ����������ʱ�������޸ĸ�������Ľṹ�Ϳ������ⲿ���Ӹ��ӵĹ��ܡ����������������У�ͨ����ͨ���̳���ʵ�ֶԸ�����Ĺ�����չ��
	 * 
	 * 4��װ��ģʽ��̳е����� װ��ģʽ �̳� ������չ�ض�����Ĺ��� ������չһ�����Ĺ��� ����Ҫ���� ��Ҫ���� ����ʱ����ְ�� ����ʱ����ְ��
	 * ��ֹ������������µĸ��Ӻͻ��� ���ºܶ�������� ���������� ȱ�������
	 */

	
	
	//�����
	public static void main(String[] args) {

		Component component = new ConcreteDecorator2(new ConcreteDecorator1(
				new ConcreteComponent()));

		component.doSomething();
	}

}

// ���󹹼��ӿڣ��淶׼�����ո������εĶ���
interface Component {
	public void doSomething();
}

// ���幹����ɫ
class ConcreteComponent implements Component {
	@Override
	public void doSomething() {
		System.out.println("����A");
	}
}

// װ�ν�ɫ������һ������(Component)���������
class Decorator implements Component {
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void doSomething() {
		component.doSomething();
	}
}

// ����װ�ν�ɫ1���������������"����"���ӵ����Σ�������µĹ���
class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	@Override
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}

	private void doAnotherThing() {
		System.out.println("����B");
	}
}

// ����װ�ν�ɫ2
class ConcreteDecorator2 extends Decorator {
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	@Override
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}

	private void doAnotherThing() {
		System.out.println("����B");
	}
}
