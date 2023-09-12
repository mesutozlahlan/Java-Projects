package inheritance2;

public class FileLogger extends LogManager {
	@Override
	public void log() {
		System.out.println("Dosya loglandı");
	}
}
