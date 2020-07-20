package demo;

public class StudentMarks {
       int science;
       int maths;
       int social;
       float t;
       public void calculateMarks() {
    	 t=((science+maths+social)/300)*100;
    	
       }
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
       
}
