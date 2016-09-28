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
		System.out.println("开始测试。。。");
	}
	
	@After
	public void tearDown(){
		System.out.println("测试结束。。。");
	}
	
	@Ignore
	@Test
	public void test1(){
		assertTrue("没在假期，没在工作日的早上应该睡觉",ss.ShouldSleep(false, false));
	}
	
	@Test
	public void test2(){
		assertTrue("在假期，无论是不是工作日的早上应该睡觉",ss.ShouldSleep(true, true));
	}
	
	@Test
	public void test3(){
		assertFalse("不在假期，是工作日的早上不应该睡觉",ss.ShouldSleep(true, false));
	}

}
