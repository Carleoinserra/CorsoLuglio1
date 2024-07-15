
public class Lampadina {

	
	String stato = "off";
	int maxClick;
	int contClick = 0;
	
	public Lampadina(int maxClick) {
		
		this.maxClick = maxClick;
	}
	
    public String stato() {
    	
    	return stato;
    }
    
    public void click() {
    	if (contClick < maxClick) {
    	
    	if (stato.equals("off")) {
    		this.stato = "on";
    		contClick++;
    	}
    	else if (stato.equals("on")) {
    		this.stato = "off";
    		contClick++;
    	}}
    	else {
    		this.stato = "out";
    	}
    }
	
}
