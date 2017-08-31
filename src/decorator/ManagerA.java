package decorator;

public class ManagerA extends Manager {

	public ManagerA(Project project) {
		super(project);
	}

	@Override
	public void doEarlylWork() {
		System.out.println("项目经理A 在做需求分析");
		System.out.println("项目经理A 在做架构设计");
		System.out.println("项目经理A 在做详细设计");
	}

	@Override
	public void doEndWork() {
		System.out.println("项目经理A 在做收尾工作！");
	}

}
