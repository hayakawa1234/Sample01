package test;
/**
 *�Z�@���K��� 7 - 2
 * �O��� Dog �N���X�ɁA���̓��e��ǉ����Ȃ����B
 * 
 * �N���ێ����� int �^�̃����o�[�ϐ��B
 * �N���ݒ肷�郁���o�[�E���\�b�h�ASetAge�B
 * ShowProfile ���\�b�h�Ŗ��O�A�N���\������悤�ɂ���B
 * �C������ Dog �N���X���g�p���Ď��̃v���O�������쐬���Ȃ����B
 * 
 * Dog �N���X�̃C���X�^���X���쐬����B
 * ���O�A�N���ݒ肷��B
 * �v���t�B�[����\������B
 * 
 *�Z�@���K��� 7 - 3
 *�O��� Dog �N���X���g�p���Ď��̃v���O�������쐬���Ȃ����B
 *
 *Dog �N���X�̃C���X�^���X���Q�쐬����B
 *�P�ڂ̃C���X�^���X�ɁA���O�A�N���ݒ肷��B
 *�Q�ڂ̃C���X�^���X�ɁA���O�A�N���ݒ肷��B
 *�P�ڂ̃C���X�^���X�́A�v���t�B�[����\������B
 *�Q�ڂ̃C���X�^���X�́A�v���t�B�[����\������B 
 *
 *�Z�@���K��� 7 - 4
 *�O��� Dog �N���X�ɁA���̓��e��ǉ����Ȃ����B
 *
 *�����ێ����郁���o�[�ϐ��B�i String �^�j
 *�����ݒ肷������i String �j�����R���X�g���N�^�B
 *ShowProfile ���\�b�h������A���O�A�N��A��\������悤�ɂ���B
 *�C������ Dog �N���X���g�p���Ď��̃v���O�������쐬���Ȃ����B
 *
 *������w�肵�� Dog �N���X�̃C���X�^���X���쐬����B
 *���O�A�N���ݒ肷��B
 *�v���t�B�[����\������B
 */

/**
 * @author hayak
 *
 */

class Dog {
	private String Name;
	int dogAge;
	String dogBreed;
	
	Dog(String br) {
		dogBreed = br;
	}
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int age) {
		dogAge = age;
	}

	public void ShowProfile() {
		System.out.println("���O�́A" + Name + "�ł��B");
		System.out.println("�N��� �A" + dogAge + "�΂ł��B");
		System.out.println("�����" + dogBreed + "�ł�");
	}
}

public class Sample02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog("�v�[�h��");
		Dog dog2 = new Dog("�R�[�M�[");
		dog1.SetName("mike");
		dog1.SetAge(12);
		dog1.ShowProfile();
		dog2.SetName("tama");
		dog2.SetAge(9);
		dog2.ShowProfile();
	}

}
