package com.cs.creator.command;

/**
 * 调用命令对象执行这个请求。
 */
public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		this.command.execute();
	}
}