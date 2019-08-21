package day04;

//Ŭ���� ����� extends��� ���� ���ؼ� �̷������.
//���߻���� �� �� ����.
//interface ����� implements ��� ��ɾ ���ؼ� �̷������.

public class Police implements Human{
	//���� �̸�, ���� �Ķ����Ÿ���� method��
	//�ڽ� Ŭ������ �������ϴ� ����
	//overriding�̶�� �Ѵ�.
	@Override
	public void work() {
		System.out.println("ġ�������� �Ѵ�.");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("���ξ� �ű⼭��!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Ŷ��");
	}
}
