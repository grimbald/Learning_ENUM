
public class StringEnums {
	public enum Days implements IEnumRepresentation
	{
		MONDAY(1, "Poniedzia³ek"), 
		TUESDAY(2, "Wtorek"), 
		WEDNESDAY(3, "Œroda"),
	    THURSDAY(4, "Czwartek"), 
	    FRIDAY(5, "Pi¹tek"), 
	    SATURDAY(6, "Sobota"), 
	    SUNDAY(7, "Niedziela");
		
		private final int id;
		private final String name;
		private Days(int id, String name)
		{
			this.id = id;
			this.name = name;
		}
		
		@Override
		public String toString()
		{
			return this.name;
		}
		
		@Override
		public int getIntRepresentation()
		{
			return this.id;
		}
		
		@Override
		public String getStringRepresentation()
		{
			return this.name;
		}
	}
	
	public static void main(String[] args)
	{
		for(Days day : Days.values())
		{
			System.out.println(day);
		}
	}
	
	public interface IEnumRepresentation
	{
		public int getIntRepresentation();
		public String getStringRepresentation();
	}
}
