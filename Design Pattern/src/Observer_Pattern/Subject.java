package Observer_Pattern;

public interface Subject {
	public void registerobserver(Observer observer);
	public void removeobserver (Observer observer);
	public void notifyobserver (int value);
	
	public void setvalue(int value);
}
