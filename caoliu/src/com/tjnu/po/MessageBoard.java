package com.tjnu.po;

public class MessageBoard {
	private int messageId;//浏览编号
	private String UserName;// 用户名
	private String Theme;// 主题
	private String Content;// 内容
	private String Time;// 留言时间

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	@Override
	public String toString() {
		return "MessageBoard{" +
				"messageId=" + messageId +
				", UserName='" + UserName + '\'' +
				", Theme='" + Theme + '\'' +
				", Content='" + Content + '\'' +
				", Time='" + Time + '\'' +
				'}';
	}
}
