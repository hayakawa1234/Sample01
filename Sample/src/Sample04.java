/**
 *�Z ���K��� 8 - 1
 *�ȉ��� Animal �N���X���p�������N���X�i�h���N���X�j�ACat ���쐬���Ȃ����B
 *
 *Cat �̓����o�[�E���\�b�h Sleep �����B
 *Sleep �����s����Ɓg�X�[�X�[�h�Ƃ����������\������B
 *���̃v���O�������쐬���Ȃ����B
 *
 *Cat �N���X�̃C���X�^���X���쐬����B
 *public �̃����o�[�ϐ��AName�AAge �ɖ��O�A�N���ݒ肷��B
 *ShowProfile �����s����B
 *Sleep �����s����B
 *
 *�Z ���K��� 8 - 2
 *�O��ɉ��� Animal �N���X���p�������N���X�ADog ���쐬���Ȃ����B
 *
 *Dog �̓����o�[�E���\�b�hRun�����B
 *Run �����s����Ɓg�g�R�g�R�h�Ƃ����������\������B
 *���̃v���O�������쐬���Ȃ����B
 *
 *Cat �N���X�� Dog �N���X�̃C���X�^���X���쐬����B
 *���ꂼ��̃����o�[�ϐ��AName�AAge �ɖ��O�A�N���ݒ肷��B
 *���ꂼ��� ShowProfile �����s����B
 *Cat �̃C���X�^���X�� Sleep �����s����B
 *Dog �̃C���X�^���X�� Run �����s����B
 */

/**
 * @author hayak
 *
 */
class Animal {
	public String Name;
	public int Age;
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int age) {
		Age = age;
	}

	public void ShowProfile() {
		System.out.println("���O�́A" + Name + "�A" + Age + "�΂ł��B");
	}
}

class Cat extends Animal {
	public String Talk;
	
	public void Sleep(String talk) {
		Talk = talk;
		System.out.println("�X�[�X�[");
	}
}

public class Sample04 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.SetName("����");
		cat.SetAge(5);
		cat.ShowProfile();
		cat.Sleep("");
	}

}
