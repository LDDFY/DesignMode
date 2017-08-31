package decorator;

public class Manager implements Project {

	private Project project;

	public Manager(Project project) {
		this.project = project;
	}

	@Override
	public void doCoding() {
		startNewWork();
	}

	private void startNewWork() {
		doEarlylWork();
		project.doCoding();
		doEndWork();
	}

	public void doEndWork() {
		System.out.println("项目经理做收尾工作！");
	}

	public void doEarlylWork() {
		System.out.println("项目经理做早期工作！");
	}

}
