package day04;

/*
 *  Ŭ����
 *  Ŭ������ �ϳ��� ������ ���α׷��̴�.
 *  ��ü�������α׷��ֿ����� ���α׷��� ����� �ҷ��� ���� ���� �ƴ϶�
 *  ���α׷� ����� �����ٰ� ���°��� ��ǥ�� �Ѵ�.
 *  
 *  �� Ŀ�ٶ� ���α׷��� ���� ���α׷����� �ҷ��� ���µ�
 *  �� ���� ���α׷��� Ŀ�ٶ� ���α׷��� ����� ��
 *  ������ �����ϵ��� ����� �ʱ�ȭ�ؼ� ����ϰ� �ȴ�.
 *  
 *  ���� ���α׷��� ����� �����Ű�� �� ���� ���α׷��� ����������
 *  �ش� ����� �����Ű�� �� ������� ū ���α׷��� �����ְ� �ȴ�.
 *  
 *  ���� �� �츮�� Ű���� �Է��� �Ҷ����� 
 *  �ش� ����� ����ϴ� Scanner Ŭ���� Ÿ���� ������ ����
 *  �°� �˾Ƽ� �ϵ��� �츮�� ��ɸ� ȣ�����ش�.
 *  
 *  �׸��� �̷��� Ŭ���� Ÿ���� ������ �츮�� ��ü��� �θ���.
 *  �� ��ü�������α׷���(Object Oriented Programming)�̶�
 *  �׷��� ���� ���α׷����� �پ��ϰ� ���� �츮�� �ʿ��� ��
 *  �� ���� ���α׷� �����鸸 ������ ���°� ��ü�������α׷����� �����ϴ� ���̴�.
 *  
 *  Ŭ������ �������
 *  Ŭ������ �ʵ�� �޼ҵ�� �̷�����ִ�.
 *  �ʵ�: �ش� Ŭ���� ������ ������ ���� ������ Ʋ
 *       ����-> �л��� ��� �й�, �̸�, ����, ����, ���е��� ������
 *       Ŭ�������� �ʵ带 ���鶧���� �츮�� �޼ҵ�ȿ��� ������ �������
 *       "������Ÿ�� �ʵ��̸�" ���� �������ָ� �ȴ�.
 *       
 *  �޼ҵ�: �޼ҵ�� �ش� Ŭ������ �������� 
 *        ������ ���� ����� ����/������ ���� ���̴�.
 *        
 *        �޼ҵ带 ������ ������
 *        ����Ÿ�� �̸�(�Ķ����) �� �����Ѵ�.
 *        
 *        ���� Ÿ��: �ش� ����� ����ɶ� ȣ��� ������ ������ �������� ������Ÿ��.
 *                 ���� �ش� �޼ҵ尡 �ƹ��� ���� �������� �ʴ´ٸ� 
 *                 void ��� �����־�� �Ѵ�.
 *                 ���� ���� ���� Ÿ���� void�� �ƴ϶��
 *                 �ش� Ÿ�԰� ��ġ�ϴ� �����͸� �ݵ��
 *                 return Ű����� ���ļ� �޼ҵ� ���ο� �־�� �Ѵ�.
 *                 �ݴ�� ����Ÿ���� void�̸�
 *                 return Ű���带 ������ ������ ����!
 *                 ���� �޼ҵ� ���ο��� return �� ������
 *                 �ش� �޼ҵ�� �� ���ο��� ���ᰡ �ȴ�.
 *                 
 *        �̸�: �ҹ��ڷ� �����ϴ� ����
 *        
 *        �Ķ����: �Ķ���Ͷ� �ش� �޼ҵ带 �����ų �� �ʿ�� �ϴ� �ܺ��� 
 *                ���� ������ ���·� ������ ���̴�.
 *                �ܺο��� ������ �� ����� �����ִ� ���� 
 *                �ش� �޼ҵ� ���ο����� �츮�� ������ �̸����� ȣ��ȴ�.
 *                
 *                ���� �Ķ���ʹ� �ʵ�� �̸��� ���� ���� �ִµ�
 *                �̶��� �ش� �̸��� ���� �Ķ���Ͱ� ȣ��ȴ�.
 *                ���� -> �ʵ忡�� id�� �ְ� �Ķ���Ϳ��� id�� ������
 *                       �޼ҵ� ���ο��� id�� �Ķ���ͷ� �Ѿ�� id�� ���Ѵ�.
 *                       �̷� ������ �ʵ带 ��Ī�� �� �ʵ��̸� �տ�
 *                       this.�� �ٿ��� �ش� �̸��� �ʵ��� ����
 *                       �������ָ� �ȴ�.
 *       
 *  static: static�̶� �ڹٿ��� �ش� �ʵ� Ȥ�� �޼ҵ带 ��ü ���� ����
 *          ����Ҽ� �ֵ��� ����ϴ� Ű�����̴�.
 *          ��, ��ü ������ ���� �ʴ´ٴ� ���� ��ü�������α׷����� ��ǥ�ʹ�
 *          ���ݴ��̹Ƿ�, ���̻� static Ű���带 �츮�� ����� �޼ҵ忡 ����ϴ�
 *          ���� ��õ���� �ʴ´�.
 *          
 *          ���� static Ű���尡 ���� �޼ҵ� ���� Ŭ������ �ִ�
 *          �ʵ峪 �޼ҵ带 ȣ���ҷ��� �ϸ�, �� �ٸ� �ʵ峪 �޼ҵ忡�� static��
 *          �پ�� �Ѵ�! 
 *  
 *  ������(Constructor)
 *  �����ڶ�, �ش� Ŭ������ ��ü�� �����ɶ� ȣ��Ǵ� �޼ҵ�ν�
 *  ���� �ʱ�ȭ �۾��� �ʿ��� ���, �����ڰ� ���ְ� �ȴ�.
 *  �츮�� ���� �����ڸ� ��������� �ʴ���
 *  �ڹٰ� �⺻������ �������ִ� �����ڰ�
 *  �ʵ带 �ʱ�ȭ���ش�.
 *  ���� �ʵ��� ������Ÿ���� �⺻���� ��� 0���� �ʱ�ȭ���ش�.
 *  ���� �ʵ��� ������Ÿ���� �������� ��� null�� �ʱ�ȭ���ش�.
 *  
 *  �������� ���, �츮�� ���� �ʵ带 � ������ �ʱ�ȭ���� Ȥ��
 *  � �ڵ带 �������� ���� ����� �� ���� �ִµ�
 *  �츮�� ���� �����ڸ� ���� ���, �ڹٰ� �⺻������ �������ִ� �⺻ �����ڴ�
 *  ���̻� ȣ���� �� ����.
 *  
 *  �����ڴ� ����Ÿ�� ����
 *  Ŭ������ �޼ҵ��� �̸��� ���� �� �տ� public�� ������ �ȴ�.
 *  
 *  ��, Ŭ������ �Ķ���Ͱ� �ִ� �����ڸ� ������ְ� �ȴٸ�
 *  ���̻� �Ķ���� ���� ������ Ȥ�� �⺻ �����ڴ� ȣ���� �Ұ���������.
 *  
 *  �޼ҵ� �����ε�(overloading)
 *  �޼ҵ� �����ε��̶� �Ķ���͸� �ٸ��� �ؼ� ���� ������ ���� �޼ҵ����
 *  �̸��� ���� �����ִ� ����� �޼ҵ� �����ε��̶�� �Ѵ�.
 *  ����: System.out.println()�� �پ��� �Ķ���͵�!
 *  
 *  ��, �׷��ٸ� �Ķ���Ͱ� �ٸ��ٴ°� ���� ���ϱ�?
 *  
 *  1. (int id, String name, int korean, int english, int math)
 *     (int id, String name)
 *  
 *  2. (int id, String name)
 *     (String name, int id)
 *  
 *  3. (int korean, int english, int math)
 *     (int math, int korean, int english)
 *  
 *  1���� �ΰ��� �Ķ���ʹ� ���� �ٸ� �Ķ�����̴�. �ֳ��ϸ� ������ Ʋ���� ����.
 *  ���� �츮�� (1, "���翵") �̶�� �ϸ� ��Ȯ�ϰ�
 *  � �޼ҵ尡 ȣ����� �����ȴ�.
 *  
 *  2���� �ΰ��� �Ķ���ʹ� ���� �ٸ� �Ķ�����̴�. �ֳ��ϸ� ������ Ʋ���� ����.
 *  ���� �츮�� ("���翵", 1) �̶�� �ϸ� ��Ȯ�ϰ�
 *  � �޼ҵ尡 ȣ����� �����ȴ�.
 *  
 *  3���� �ΰ��� �Ķ���ʹ� ���� ���� �Ķ�����̴�. �ֳ��ϸ� 
 *  �츮�� (80, 80, 81)�̶�� �ϸ� � �޼ҵ尡 ȣ����� �ָŸ�ȣ�ϱ� �����̴�.
 *  
 *  �޼ҵ��� �Ķ���Ͱ� ������ �ٸ����� ��������
 *  �Ķ������ �̸��� �����ϰ� 
 *  �Ķ������ Ÿ���� ������ �������� ���ϸ� �ȴ�.
 *  
 *  ���
 *  ���α׷��ֿ��� ����� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ �ٽ� ����/������
 *  ���� �ʾƵ� �״�� ����� �� �ְ� �ڵ��� ���뼺�� �����ִ� ����̴�.
 *  �츮�� ��� Student Ŭ���� Ȥ�� �ٸ� Ŭ������ ��� ���ɾ ���� �ʾƵ�
 *  �ڹٰ� ���� java.lang.Object�� ����Ѵ�.
 *  
 *  �׷��� �츮�� ��� �޼ҵ�(toString(), equals()��)���� ���� ������
 *  ���� �ʾƵ� �����ų �� �ִ�. 
 *  
 *  ������ java.lang.Object �� �츮 Ŭ������ � �ʵ尡 �ִ��� Ȥ��
 *  � ���� �߽����� ������ �ٸ��� �񱳸� ������ �𸣱� ������
 *  java.lang.Object�� �޼ҵ���� ���� �ſ� �ָŸ�ȣ�ϰ� �����Ǿ��ִ�.
 *  
 *  ���� �츮 Ŭ������ ��ü�� �ش� �޼ҵ���� ����� ����ҷ���
 *  �츮�� ���� ���������־�� �Ѵ�.
 *  �̷��� �θ� Ŭ�����κ��� ��ӹ��� �޼ҵ���� �ڽ� Ŭ������ �������ϴ� ����
 *  �������̵�(overriding)�̶�� �Ѵ�.
 *  �������̵��� �Ҷ� �����ؾ��� ���� �θ�Ŭ������ �޼ҵ带 ������ ��� �״��
 *  �������־�� �Ѵ� ���̴�.
 *  
 *  // 1. toString()
 *  //    toString() �޼ҵ�� �ش� ��ü�� ������ String���� �ٲ��ش�.
 *  //    System.out.println()�� ���, �Ķ���ͷ� Object Ŭ���� Ȥ��
 *  //    Object Ŭ������ ��ӹ޴� ��� Ŭ������ ��ü�� �Ķ���ͷ� ������
 *  //    �ش� ��ü�� toString() ������� ȭ�鿡 ������ش�.
 *  //    java.lang.ObjectŬ������ toString()�� �ش� Ŭ������ ����
 *  //    (��Ű��+Ŭ�����̸�)�� �ش� ��ü�� �޸� �ּҰ��� String���� �ٲ㼭
 *  //    return ���ش�.
 *  //    ���� �츮�� ���� Ŭ������ ��ü�� System.out.println()�� �־
 *  //    ���� �ش� ��ü�� �ʵ尪�� ����ϰ� �������
 *  //    �츮�� ���� toString()�� �������ؾ��Ѵ�.
 *  //    toString()�� ������ ���� ����Ǿ��ִ�.
 *  //    public String toString()
 * 
 *  // 2. equals()
 *  //    �񱳿����� == �� ���, ��ü���� ���ϸ�
 *  //    �ּҰ� �񱳸� �ϱ� ������, ��ü�� �ʵ尪 �񱳸� ���ؼ���
 *  //    equals()�� ���ؼ� ���ؾ��Ѵ�.
 *  //    �� equals() �޼ҵ嵵 java.lang.Object�� ���ǵǾ��ִ�.
 *  //    �ٵ� toString()�� ���������� java.lang.Object��
 *  //    �ش� Ŭ������ � �ʵ带 �������� �񱳸� ���� �˱�?
 *  //    �翬�� �𸥴�.
 *  //    �׷��� ������̰Ե� java.lang.Object�� equals()��
 *  //    ������ ���� �����.
 *  
 *  //    public boolean equals(Object o){
 *  //        return this == o;
 *  //    }
 *  
 *  //    �� �ּҰ� �񱳸� �ϰԵǴ� ���̴�.
 *  //    ���� �츮 Ŭ���� ��ü�� �ʵ带 �������� �ؼ� �񱳸� �ҷ���
 *  //    toString()�� ����������, �츮�� �������̵� �ؾ��Ѵ�!!!
 *  
 *  null
 *  null�̶� ������ ����/��������� �߰ߵǴ� Ư���� ��Ȳ�̴�.
 *  ���������� �ʱ�ȭ�� ������ ����/�����
 *  ����/��� ��ü�� �ּҰ��� ������ �ְ�
 *  �� �ּҰ��� ã�Ƽ� ���� ���� �ش� ������Ÿ���� ������ �����ϴ� ���°� �ȴ�.
 *  
 *  �׷��� ����, �� �ּҰ��� ã�Ƽ� �� ����, �ƹ��� ������ ���ٸ�?
 *  �� ������ ����/����� �ʵ� Ȥ�� �޼ҵ� �� ���� ������ ���� �� �� ���� �ȴ�.
 *  �̷��� �ش� �޸� �ּҿ� �ƹ��͵� ���� ���¸� null�̶��,
 *  null�� ������ ����/����� �ʵ� Ȥ�� �޼ҵ带 ȣ���ϸ�
 *  NullPointerException �̶�� ������ �߻��ϰ� �ȴ�!!!
 *  
 *  
 *   ������(polymorphism)
 *   �������̶� �پ��� ����� ������ �����̶�� �� �� �ִ�.
 *   �ڹٿ����� �θ�Ŭ������ �Ķ���ͷ� ������ ���
 *   �ڽ� Ŭ������ �Ķ���ͷ� ���� �� �ִ�.
 *   
 *   
 *   ����������(Access Modifier)
 *   ���������ڶ� �ش� �ʵ� Ȥ�� �޼ҵ��� ���� ������ �����ϴ� Ű�����̴�.
 *   public > protected > default > private ���� �����̴�.
 *   public: ���� ��Ű���� �ܺ� Ŭ������ �ܺ� ��Ű���� �ӿܺ� Ŭ������
 *   		 ��𼭵� ���� ����(��ü�� ���� �ش� �ʵ� Ȥ�� �޼ҵ带 ȣ�Ⱑ��)
 *   
 *   protected: ���� ��Ű���� �ٸ� Ŭ������ ���� ����������
 *   			�ܺ� ��Ű������ �ش� Ŭ������ ��ӹ޴� Ŭ������ ���� ����
 *   
 *   default: ���� ��Ű���� �ٸ� Ŭ������ ���� ����������
 *   		  �ܺ� ��Ű���� ��� Ŭ������ ���� �ȵ�
 *   		  �̷��� ������ ��Ű�� ���������ڶ���� �Ҹ�����
 *   		  default�� package ��� �ٸ������� ���̴� Ű�����̱� ������
 *   		  �츮�� �ƹ��� ���� �����ڸ� �޼ҵ峪 �ʵ忡 ������ ������
 *   		  �ڵ����� default ���������ڰ� ����ȴ�.
 *   
 *   private: �ܺ� Ŭ������ ��� ������ �Ұ���.
 *   
 *   �������� �������� �ܺο� �˷��ֱ� ���� �޼ҵ� Ȥ�� �ʵ常 private���� �صΰ�
 *   �������� ���� public���� �ξ �����Ҵ�.
 *   ������ ������ ĸ��ȭ��� ���䶧���� �ܺΰ� �� �˾ƾ��� �޼ҵ带 �����ϰ�����
 *   ��� �ʵ� -> private
 *   ���� ��� �޼ҵ� -> public
 *   ���� ���������� �ϰ� �ȴ�.
 *   
 *   ĸ��ȭ�� ��ü�� ����� ���� �� ��ü�� ������ �ٸ� �ܺΰ� �� �ʿ����
 *   �� ��ü ��ü�� ���� �ȴٴ� �������� �����ϴ� ���̴�.
 *   
 *   ������ �ʵ��� ��� private ���������ڰ� ����Ǹ�
 *   �ܺο��� ���� ���� �Ѱ��ְų� ȣ���ϴ� ���� �Ұ���������.
 *   
 *   
 *   �׷��� ������ �޼ҵ带 ���ؼ� ���������� �ʵ忡 ���� �����ϰ�
 *   ����� ���� �����ϴ� ����� ���� �ȴ�.
 *   
 *   �ܺηκ��� ���� �޾Ƽ� �ʵ忡 ���� �Ҵ��ϴ� �޼ҵ�� setter �޼ҵ��� �Ѵ�.
 *   setter �޼ҵ�� ������ ���� "���"�� ������.
 *   public void set�ʵ��̸�(�ʵ�Ÿ�� �ʵ��̸�){
 *   	this.�ʵ��̸� = �ʵ��̸�; 
 *   }
 *   ���� ���� ������ ��, �߰������� �۾��� ���� �ִٸ�, setter�޼ҵ� ���ο�
 *   �����ϸ� �ȴ�.
 *  
 *  
 *   �ʵ忡 ����� ���� ȣ��� ������ �����ϴ� �޼ҵ�� getter �޼ҵ��� �Ѵ�.
 *   getter �޼ҵ�� ������ ���� "���"�� ������.
 *   public �ʵ�Ÿ�� get�ʵ��̸�(){
 *   	return �ʵ��̸�;
 *   }
 *   ���� ���� ������ ��, �߰������� �۾��� ���� �ִٸ� getter�޼ҵ� ���ο�
 *   �����ϸ� �ȴ�.
 *   
 *   
 */
public class Ex07Class {

}








