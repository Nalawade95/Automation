package Test;

public class StringBufferBuilder {
	public static void main(String[] args){
		String s = new String("Velocity");
		StringBuffer sb = new StringBuffer("Katraj");
		StringBuffer sbb = new StringBuffer("Pune");
		s.concat(" Pune ");
		sb.append(" Pune ");
		sbb.append(" Maharashtra ");
		System.out.println(s);
		System.out.println(sb);
		System.out.println(sbb);
		sb.reverse();
		System.out.println(sb);
	}

}
