import java.lang.Object;

public class Plot extends Object{
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot) { // this is a copy constructor!!
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	public boolean overlaps(Plot plot) {
		if ((this.x + this.width) < plot.x && (this.y + this.width) < plot.y 
				&& (plot.y + plot.width) < this.y && (plot.x + plot.width) < this.x 
				&& this.x > plot.y && (this.x + this.width) > (plot.y + plot.width) 
				&& (plot.x + plot.width) > (this.y + this.width) && (plot.x > this.x)) {
			return false;
		}
		return true;
	}
	
	public boolean encompasses(Plot plot) {
		if (plot.x >= this.x && (plot.x + plot.width) >= (this.x + this.width)
			&& (plot.x + plot.depth) >= (this.x + this.depth) && (plot.x + plot.depth + plot.width) >= (this.x + this.depth + this.width) 
			&& (plot.x + plot.depth + plot.width + plot.depth) >= (this.x + this.depth + this.width + this.depth)
			&& (plot.x + plot.depth) >= (this.x + this.depth) && plot.x < this.x && (plot.x + plot.width) < (this.width + this.x)
			&& plot.y < this.x && plot.y < (this.y + this.width)) {
			return false;
		}
		return true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return this.x + "," + this.y + "," + this.width + "," + this.depth;
	}
}
