package com.cs.creator.command;

/**
 * 将一个接收者对象绑定于一个动作；调用接收者相应的操作，以实现命令角色声明的执行操作的接口。
 */
class ConcreteCommand extends Command {
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		this.receiver.doSomething();
	}
}