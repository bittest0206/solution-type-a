package problem02;

public class SmartPhone extends MusicPhone {
	
	

	@Override
	public void execute(String function) {
		if (function.equals("앱")) {
			System.out.println(runApp());
			return;
		}
		if (function.equals("음악")){
			System.out.println(playMusic());
			return;
		}
		
		super.execute(function);
	}

	@Override
	public String playMusic() {
		// TODO Auto-generated method stub
		return "스트리밍";
	}

	@Override
	public String call() {
		// TODO Auto-generated method stub
		return super.call();
	}

	public String runApp() {
		return "앱실행";
		
	}
	
	
	
	
}