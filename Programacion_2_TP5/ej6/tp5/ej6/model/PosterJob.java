package tp5.ej6.model;

public class PosterJob extends Job{
	
	public PosterJob() {
		super();
	}
	
	public boolean reachRequirement(Assessor a) {
		boolean reach = false;
		int i = 0;
		while(i < super.getThemes().size() && !reach) {
			if(a.hasTheme(super.getThemes().get(i))) {
				reach = true;
			}
		}
		return reach;
	}
}
