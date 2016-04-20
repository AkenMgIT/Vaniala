package net.akensync.vaniala.datatest;

import java.util.ArrayList;
import java.util.List;

import net.akensync.vaniala.model.obj.Centre;

public class DataTest {
	private List<Centre> centres;
	
	public List<Centre> getCentres() {
		return centres;
	}

	public void setCentres(List<Centre> centres) {
		this.centres = centres;
	}

	public DataTest(){
		centres = new ArrayList<Centre>();
		
		this.initData();
	}
	
	private void initData(){
		Centre c1 = new Centre(0,"C001","centre A");
		Centre c2 = new Centre(1,"C002","centre B");
		Centre c3 = new Centre(2,"C002","centre C");
		
		centres.add(c1);
		centres.add(c2);
		centres.add(c3);
	}
}
