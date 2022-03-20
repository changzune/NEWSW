package com.newlecture.app.console;

import com.newlecture.app.service.NoticeService;


public class NoticeConsole {
	
	private NoticeService service;
	
	public NoticeConsole() {

	}	
	

	public void printNoticeList() {
		System.out.println("---------------------");
		System.out.printf("<공지사항> 총 %d 게시글", 12);
		System.out.println("---------------------");
		System.out.printf("%d. %s / %s / %s\n", 12, "안녕하세요",
				"newlec", "2020-10-09");
		System.out.println("---------------------");
		System.out.printf("   %d/%d pages\n", 1, 2);
	}

	public int inputNoticeMenu() {
		// TODO Auto-generated method stub
		return 0;
	}



}
