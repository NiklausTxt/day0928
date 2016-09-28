package LearnJunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunit {

	ShouldSleep ss;
	
	@Before
	public void setup(){
		ss = new ShouldSleep();
		System.out.println("��ʼ���ԡ�����");
	}
	
	@After
	public void tearDown(){
		System.out.println("���Խ���������");
	}
	
	@Ignore
	@Test
	public void test1(){
		assertTrue("û�ڼ��ڣ�û�ڹ����յ�����Ӧ��˯��",ss.ShouldSleep(false, false));
	}
	
	@Test
	public void test2(){
		assertTrue("�ڼ��ڣ������ǲ��ǹ����յ�����Ӧ��˯��",ss.ShouldSleep(true, true));
	}
	
	@Test
	public void test3(){
		assertFalse("���ڼ��ڣ��ǹ����յ����ϲ�Ӧ��˯��",ss.ShouldSleep(true, false));
	}

}
