package com.situ.day19;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Test;

public class SwingDemo {
	public static void main(String[] args) {
		SwingDemo swingDemo = new SwingDemo();
		swingDemo.showView();
	}

	private void showView() {
		JFrame frame = new JFrame();
		//JFrame默认是没有尺寸的
		frame.setSize(500, 300);
		//设置坐标
		frame.setLocation(400, 400);
		//默认关闭是不关闭整个应用程序，就是为了防止当有过个窗口弹出的时候
		//关闭弹窗把整个应用程序都关闭
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//获得面板
		JPanel panel = (JPanel) frame.getContentPane();
		//设置流式布局
		panel.setLayout(new FlowLayout());
		//文本框1
		final JTextField textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(120, 30));
		panel.add(textField1);
		
		//+号
		JLabel label = new JLabel("+");
		label.setPreferredSize(new Dimension(30, 30));
		panel.add(label);
		
		//文本框2
		final JTextField textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(120, 30));
		panel.add(textField2);
		
		//Button = 号
		JButton button = new JButton("=");
		button.setPreferredSize(new Dimension(60, 30));
		panel.add(button);
		
		//label 显示结果
		final JLabel labelResult = new JLabel();
		labelResult.setPreferredSize(new Dimension(120, 30));
		panel.add(labelResult);
		
	    //给button添加点击事件
		//匿名内部类 : XXX implement ActionListener
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("actionPerformed");
				String text1 = textField1.getText();
				String text2 = textField2.getText();
				if ((text1 != null && !"".equals(text1)) 
						&& (text2 != null && !"".equals(text2))) {
					int num1 = Integer.parseInt(text1);
					int num2 = Integer.parseInt(text2);
					int result = num1 + num2;
					//labelResult.setText(result + "");
					labelResult.setText(Integer.toString(result));
				}
			}
		});
		
		//JFrame默认是不显示
		frame.setVisible(true);
	}
	
	
	@Test
	public void test1() {
		String str2 = "3.14g";
		double d = Double.parseDouble(str2);
		System.out.println(d);
	}
	
	@Test
	public void test2() {
		String str = "";// null  ""
		check(str);
	}
	
	private void check(String str) {
		if (str != null && "".equals(str) == false) {
			System.out.println("abc");
		}
	}
}
