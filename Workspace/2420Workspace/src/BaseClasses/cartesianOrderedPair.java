public static class cartesianCordinates implements Comparable<cartesianCordinates> {

		public int X;
		public int Y;

		public cartesianCordinates (int x, int y) {
			this.X = x;
			this.Y = y;
		}
		public boolean equals (Object o) {
			if (!(o instanceof cartesianCordinates)) { //check to make sure we are actually using an ordered pair,
				return false;
			}
			cartesianCordinates op = (cartesianCordinates) o; //if true then check if the ordered pairs are equal.
			return op.Y==this.Y;
		}
		public int hashCode () {
			return Y;
		}
		public String toString () {
			return ("\n[" + this.X +" , "+ this.Y + "]");
		}
		@Override
		public int compareTo(cartesianCordinates o) {
			return (this.Y-o.Y);
		}
	}
